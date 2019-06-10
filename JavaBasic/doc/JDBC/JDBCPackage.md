
所有数据库的操作的类和接口 都保存在 java.sql包内
具体内容如下
* 一个类： DriverManager
* 四个接口：Connection  Statement ResultSet PreparedStatement


所有jdbc 连接数据库操作流程都是固定的，按照如下的几步完成：

* 加载数据库的驱动程序（向容器加载）
* 进行数据库连接（通过DriverManager 完成，Connection 表示连接）
* 进行数据的 CRUD (STATEMENT,PREPAREDSTATEMENT,,RESULTSET)
* 关闭数据库操作及连接（直接关闭连接就够了）


加载驱动程序：
oracle 驱动类 oracle.jdbc.driver.OracleDriver
加载类使用,这就是一个容器 ```Class.forName("oracle.jdbc.driver.OracleDriver")```

连接数据库   
数据库连接地址："""  
数据库用户名：  
数据库的密码： 

数据库的连接 必须要依靠 DriverManager 类来完成
该类定义有如下方法 getConnnection() ;这个方法返回Connection 对象
在 jdbc里面每一个数据库连接 都要求使用一个Connection 对象进行封装，所以每一个新的 Connection 对象 都会连接一次数据库。
如果该 Connection 对象不为空null 既创建成功
Conection 接口 提供了 close()方法


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

