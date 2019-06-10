
1 所有数据库的操作的类和接口 都保存在 java.sql包内
具体内容如下
* 一个类： DriverManager
* 四个接口：Connection  Statement ResultSet PreparedStatement


所有jdbc 连接数据库操作流程都是固定的，按照如下的几步完成：

* 加载数据库的驱动程序（向容器加载）
* 进行数据库连接（通过DriverManager 完成，Connection 表示连接）
* 进行数据的 CRUD (STATEMENT,PREPAREDSTATEMENT,,RESULTSET)
* 关闭数据库操作及连接（直接关闭连接就够了）



2jdbc开发前的准备
下载与所用数据库相应的驱动jar包。我用的是mysql



3、jdbc的开发步骤

1) 加载驱动 ：新版jdbc可以省略
oracle 驱动类 oracle.jdbc.driver.OracleDriver
加载类使用,这就是一个容器 ```Class.forName("oracle.jdbc.driver.OracleDriver")```
Class.forName("驱动类名");
2) 创建数据库连接 
数据库连接地址
数据库用户名 
数据库的密码

Connection conn = DriverManager.getConnection(连接字符串, 用户名, 密码);
[MySQL连接字符串参考](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html)

[连接字符串参数说明](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-configuration-properties.html)


数据库的连接 必须要依靠 DriverManager 类来完成
该类定义有如下方法 getConnnection() ;这个方法返回Connection 对象
在 jdbc里面每一个数据库连接 都要求使用一个Connection 对象进行封装，所以每一个新的 Connection 对象 都会连接一次数据库。
如果该 Connection 对象不为空null 既创建成功
Conection 接口 提供了 close()方法

3) 创建Statment(Preparedstatement)对象

Statement stmt = conn.createStatement();
执行增删改

int rows = executeUpdate(sql语句);
执行查询

ResultSet rs = executeQuery(sql语句);
4) 关闭资源：先打开的后关闭

rs.close();
stmt.close;
conn.close;
新增示例代码：
标准写法应该将异常捕捉处理，并将close释放资源代码放在finally块中，这里简单写了。
```
public static void insert() throws Exception{
    // 1. 加载驱动
    Class.forName("com.mysql.cj.jdbc.Driver");
    // 2. 创建数据库连接
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3?serverTimezone=GMT%2B8&useSSL=false", "root" "root");
    // 3. 创建Statment对象,执行sql
    Statement stmt = conn.createStatement();
    // 返回值 int类型 代表影响的记录行数
    String sql = "insert into student(sid,sname,birthday,sex) values (null,'老炮儿','1999-1-1','男')";
    int x = stmt.executeUpdate(sql);
    System.out.println("影响的记录行数  x = " + x);
    // 4. 关闭资源 先打开的后关闭
    stmt.close(); // 关闭statement对象
    conn.close(); // 关闭数据库连接    
}
```
查询示例代码：
```
public static void select() throws Exception {
    // 1. 加载驱动
    Class.forName("com.mysql.cj.jdbc.Driver");
    // 2. 创建数据库连接Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3?serverTimezone=GMT%2B8&useSSL=false", "root" "root");
    // 3. 创建Statment对象,执行sql
    Statement stmt = conn.createStatement();
    // executeQuery(sql)  执行sql的方法
    // 返回值ResultSet类型 代表影响的结果集
    String sql = "select sid,sname,birthday,sex from student";
    ResultSet rs = stmt.executeQuery(sql);
    // next()方法用来移动到下一行记录 getXXX方法用来获取某列数据
    while (rs.next()) {
        int sid = rs.getInt(1);
        String sname = rs.getString(2);
        Date birthday = rs.getDate(3);
        String sex = rs.getString(4);
        System.out.println(sid + " " + sname + " " + birthday + " " + sex);
    }
    // 4. 关闭资源 先打开的后关闭
    rs.close(); // 关闭ResultSet
    stmt.close(); // 关闭Statement对象
    conn.close(); // 关闭数据库连接
}
```
> 注意
> 问题1：MySQL Connector/J 8.0.12 驱动连接时需要添加`serverTimezone=GMT%2B8`参数，否则会出现异常：java.sql.SQLException: The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä'，另外`GMT%2B8`也必须加，否则会出现连接方和数据库时区不一致问题
> 问题2：在连接过程中一旦发生异常：java.sql.SQLNonTransientConnectionException: Public Key Retrieval is not allowed 需要添加`allowPublicKeyRetrieval=true`参数，此异常一种可能的发生情况是MySQL服务重启后，立刻用jdbc连接时
> 问题3：WARN: Establishing SSL connection without server's identity verification is not recommended 要消除这个警告信息，需要加入参数`useSSL=false`


获取自增列的值

插入数据时，可以通过在execute()方法或executeUpdate()方法添加参数Statement.RETURN_GENERATED_KEYS获取插入数据在数据库表中自动生成的主键值。
```
Statement stmt = conn.createStatement();
String sql = "insert into student(sid,sname,birthday,sex) values (null,'老炮儿','1999-1-1','男')";
stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
ResultSet rs = stmt.getGeneratedKeys();
rs.next();
System.out.println(rs.getInt(1));
```


可能连不上oracle 的原因
可能连接不上数据库的原因：
1、计算机名被改
2、监听服务出现错误
      1）、监听的主机名称不是本机的计算机名称，也不要使用IP地址
      2）、监听配置文件路径
            a、监听文件：listener.ora
            b、监听文件的名称文件：tnsnames
      3）、不能找到指定的SID
            数据库的名字就是SID的名字，但是很多的时候该名称不会自动注册，即只有数据库名称，没有SID名称（Net Manage）（添加监听程序）（Oracle）

