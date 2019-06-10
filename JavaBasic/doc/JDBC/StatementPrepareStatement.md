没事别用 statement

注入攻击问题与解决方法

数据库表：
```
create table xx_user (
   username varchar(20) primary key,
   password varchar(20) not null
);
insert into xx_user values('wang', '123');
```
登录方法：
java
// 登录方法，如果有用户名和密码其中之一不正确，返回false表示登录失败
 

```
public boolean login (String username, String password) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
        conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
        stmt = conn.createStatement();
        String sql = "select * from xx_user where username = '"+username+"' and password = '"+password+"'";
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
        if(rs.next()) {
            return true;
        } else {
            return false;
        }
        
    } catch(Exception e) {
        e.printStackTrace();
        throw new RuntimeException("sql执行失败", e);
    } finally {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```
一个注入攻击问题：
 

用户名和密码都没有输入正确，但返回true的例子
```
boolean success = dao.login("laowang", "aaa' or '1'='1");
System.out.println("登录" + success);
```
解决注入攻击的一种手段：


在`PrepareStatement`对应的sql语句中，可以使用`?`代表一个未知的值。  
 `?`只能代表值，不能是关键字，表名，列名  
 调用的方法根据`?`的实际类型而定，例如值是int 调用setInt方法  
 `?`的对应的set方法下标从`1`开始  

代码：
```
// 1) 创建 PreparedStatement
PreparedStatement stmt = conn.prepareStatement("select * from xx_user where username = ? and password = ? ");
// 2) 给?占位符赋值
stmt.setString(1, "laowang");
stmt.setString(2, "aaa' or '1'='1"); // 会将整个值当做一个整体，把or当做了值而不是关键字
// 3) 运行sql
ResultSet rs = stmt.executeQuery(); // 会将sql语句以及通过set方法设置的参数值，一起发送给数据库服务器
if(rs.next()) {
    System.out.println("查询到了");
} else {
    System.out.println("没查询到");
}

```
自己写的JDBC工具类
```
import com.alibaba.druid.pool.DruidDataSource;
 
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
public class Utils {
 
    static DruidDataSource dataSource;
 
    static {
        // 池连
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test3?serverTimezone=GMT%2B8&useSSL=false" +
                "&useServerPrepStmts=true&cachePrepStmts=true&rewriteBatchedStatements=true" +
                "&useCursorFetch=true&defaultFetchSize=100");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
    }
 
    public static Connection getConnection() throws SQLException {
        // 直连
//        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        return conn;
        Connection conn = dataSource.getConnection();
        return conn;
    }
 
    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void close(PreparedStatement stmt, Connection conn) {
        close(null, stmt, conn);
    }
 
    /**
     * 写一个通用的增删改方法
     * sql类型：         "insert into student(sname,birthday,sex)values(?,?,?)";
     * "update student set sname=?, birthday=?, sex=? where sid=?";
     * "delete from student where sid=?";
     * object类型：                 new Object[]{"aaa",new Date(), "男"}
     * new Object[]{1001}
     *
     * @param sql
     * @param args
     */
    public static int modify(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(sql);
 
            //遍历所有？值
            int idx = 1;
            for (Object arg : args) {
                if (arg instanceof java.util.Date) {
                    java.sql.Date d = new java.sql.Date(((Date) arg).getTime());
                    stmt.setObject(idx, d);
                }
                stmt.setObject(idx, arg);
                idx++;
            }
            return stmt.executeUpdate();
 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(stmt, conn);
        }
    }
}
```
 
