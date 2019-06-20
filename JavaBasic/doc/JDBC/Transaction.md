二、jdbc的高级知识
 

1.事务控制
概念：
事务是访问数据库的一个操作序列，数据库应用系统通过事务集来完成对数据库的存取。事务的正确执行使得数据库从一种状态转换成另一种状态。 
当操作序列中的所有操作都成功执行时，事务的状态未成功。当任一操作失败时，事务的状态为失败，此时必须将程序状态返回至事务未执行时的状态，即回滚。

四个特性
原子性（Atomicity）：事务中的所有操作是不可再分割的原子单位，事务中的所有操作是一个整体，或者整体执行成功，亦或者整体执行失败。
一致性（Consistency）：事务执行后，数据库状态与其他业务规则保持一致。如转账业务，无论执行成功与否，参与转账的两个帐号余额值和应该是不变的。
隔离性（Isolation）：在并发操作中，不同事务之间应该隔离开来，每个并发中的事务的执行不会相互干扰。
持久性（Durability）：一旦事务提交成功，事务中的所有数据更新必须被持久化到数据库中，即使提交事务后，数据库马上崩溃，在数据库重新启动时，也必须能保证通过某种机制恢复数据。
关键方法：

conn.setAutoCommit(false);
//提交
conn.commit();
//回滚
conn.rollback();
实例：
```
    // 1. Connection 连接对象
    // 2. Statement 执行sql语句 PreparedStatement  值是以?占位符来代替， .setXXX(?位置, 值);
    //      好处: 可以防止sql的注入攻击
    //    executeQuery 查询     executeUpdate  增删改(int 影响行数)   execute  增删改查(返回true表示查询 false是增删改)
    // 3. ResultSet 结果集   .next() 返回值代表是否有下一条记录    .getXXX(列下标)  .getXXX(列名)
    // 4. 关闭顺序：rs > stmt > conn

    public static void main(String[] args) {
 
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Utils.getConnection();
            // 让事务手动提交（自己来控制事务）
            conn.setAutoCommit(false);
            stmt = conn.prepareStatement("delete from emp where empno=?");
            stmt.setInt(1, 7876);
            stmt.executeUpdate();
            System.out.println("delete from emp where empno=7876");
 
            stmt.setInt(1, 7844);
            stmt.executeUpdate();
            System.out.println("delete from emp where empno=7844");
 
            // 让所有操作都成功了，再commit
            conn.commit();
        } catch(Exception e) {
            e.printStackTrace();
            if(conn != null) {
                try {
                    // 一旦有异常，回滚之前的操作
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            Utils.close(stmt, conn);
        }
```
 2.提升性能

 2.1 重用sql

默认情况下，通过jdbc执行一条sql语句流程如下：
1. 将sql语句从客户端程序发送给数据库服务器
2. 由命令解析器进行`词法分析`、`语法分析`、生成`解析树`
3. 如果是查询，还要生成`查询计划`，对sql执行进行优化
4. 由访问控制模块`检查权限`、生成新的`解析树`
5. 进入表管理模块，打开对应的表文件
6. 调用存储引擎，执行
7. 将结果返回给客户端程序

其中2. 3. 4. 步每次都要执行，即使sql语句很类似：

select * from student where id = 1001;
select * from student where id = 1002;
如果希望2. 3. 4.  步能够被重用，可以利用`预编译`的sql：
在sql中：

prepare sql1 from 'select * from student where sid = ?';
 
set @param:=1001;
execute sql1 using @param;
 
set @param:=1002;
execute sql1 using @param;
这样只有在执行`prepare`的时候进行了2. 3. 4.  步，而后面的`execute`执行时就不必执行2. 3. 4.  步了。

jdbc中要利用`预编译`的功能，需要使用`PreparedStatement`，普通`Statement`不行，另外对于MySQL来说，要在jdbc 连接字符串中加入参数：`useServerPrepStmts=true&cachePrepStmts=true`
其中：
```
`useServerPrepStmts=true`是开启MySQL的预编译功能，即`PreparedStatement对象`会利用`prepare`语句
 `cachePrepStmts=true`是同一个连接的多个`PreparedStatement对象`能够被缓存，否则一旦`PreparedStatement对象`关闭，
则下一个`PreparedStatement对象`执行相同sql时，还是会重新执行`prepare`
```

 2.2 批处理
关键方法：
addBatch
executeBatch

MySQL必须在连接字符串中添加`rewriteBatchedStatements=true`才能真正启用批处理功能
```
 Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Utils.getConnection();
            long start = System.currentTimeMillis();
            stmt = conn.prepareStatement("insert into bigtable(id,name) values(?,?)");
            int max = 10000;
            for (int i = 0; i < 1000000; i++) {
                stmt.setInt(1,i);
                stmt.setString(2,"aaa");
//                stmt.executeUpdate(); // 调用一次exeucteUpdate方法，就会跟数据库服务器交互一次
                stmt.addBatch(); // 将insert语句加入至批处理包
                if( (i+1) % max == 0 ) { // 批处理包满500发一次
                    stmt.executeBatch();
                }
            }
            stmt.executeBatch(); // 将批处理包中所有sql一次性发送给服务器
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            Utils.close(stmt, conn);
        }
    }
    
```
2.3 游标支持

默认情况下，MySQL Connector/J 查询时是一次将所有结果返回，这样记录特别大时就会出现OOM异常，可以通过添加`useCursorFetch=true&defaultFetchSize=50`来启用游标的方式来每次返回部分结果。
一般的数据库不会一次性全部取到JVM内存中。Statement和ResultSet都定义了get/setFetchSize()来指定，在需要更多结果集时，一次性取多少记录到本地内存。
但这只是对底层JDBC驱动的一个提示，具体默认值以及是否有实现此功能视JDBC驱动实现而定。例如mysql的connector/j驱动需要使用useCursorFetch=true才能启用此功能并正常识别fetchSize的值
 

2.4 启用日志

my.cnf文件：

[mysqld]
log-output=FILE
log_timestamps=SYSTEM
general-log=1
general_log_file="E:\mysql-8.0.12-winx64\data\mysql.log"
slow-query-log=1
slow_query_log_file="E:\mysql-8.0.12-winx64\data\mysql_slow.log"
long_query_time=2

在安装服务时采用：

mysqld --install MySql --defaults-file=E:\mysql-8.0.12-winx64\my.cnf
mysql连接字符串说明：

| 配置 | 缺省值 | 说明 |
| --- | --- | --- |
| name |  | 配置这个属性的意义在于，如果存在多个数据源，监控的时候可以通过名字来区分开来。如果没有配置，将会生成一个名字，格式是："DataSource-" + System.identityHashCode(this). 另外配置此属性至少在1.0.5版本中是不起作用的，强行设置name会出错。[详情-点此处](http://blog.csdn.net/lanmo555/article/details/41248763)。 |
| url |  | 连接数据库的url，不同数据库不一样。例如：mysql : jdbc:mysql://10.20.153.104:3306/druid2oracle : jdbc:oracle:thin:@10.20.149.85:1521:ocnauto |
| username |  | 连接数据库的用户名 |
| password |  | 连接数据库的密码。如果你不希望密码直接写在配置文件中，可以使用ConfigFilter。[详细看这里](https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter) |
| driverClassName | 根据url自动识别 | 这一项可配可不配，如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName |
| initialSize | 0 | 初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时 |
| maxActive | 8 | 最大连接池数量 |
| maxIdle | 8 | 已经不再使用，配置了也没效果 |
| minIdle |  | 最小连接池数量 |
| maxWait |  | 获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。 |
| poolPreparedStatements | false | 是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。 |
| maxPoolPreparedStatementPerConnectionSize | -1 | 要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100 |
| validationQuery |  | 用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会起作用。 |
| validationQueryTimeout |  | 单位：秒，检测连接是否有效的超时时间。底层调用jdbc Statement对象的void setQueryTimeout(int seconds)方法 |
| testOnBorrow | true | 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。 |
| testOnReturn | false | 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。 |
| testWhileIdle | false | 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。 |
| keepAlive | false（1.0.28） | 连接池中的minIdle数量以内的连接，空闲时间超过minEvictableIdleTimeMillis，则会执行keepAlive操作。 |
| timeBetweenEvictionRunsMillis | 1分钟（1.0.14） | 有两个含义：1) Destroy线程会检测连接的间隔时间，如果连接空闲时间大于等于minEvictableIdleTimeMillis则关闭物理连接。2) testWhileIdle的判断依据，详细看testWhileIdle属性的说明 |
| numTestsPerEvictionRun | 30分钟（1.0.14） | 不再使用，一个DruidDataSource只支持一个EvictionRun |
| minEvictableIdleTimeMillis |  | 连接保持空闲而不被驱逐的最小时间 |
| connectionInitSqls |  | 物理连接初始化的时候执行的sql |
| exceptionSorter | 根据dbType自动识别 | 当数据库抛出一些不可恢复的异常时，抛弃连接 |
| filters |  | 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：监控统计用的filter:stat 日志用的filter:log4j 防御sql注入的filter:wall |
| proxyFilters |  | 类型是List<com.alibaba.druid.filter.Filter>，如果同时配置了filters和proxyFilters，是组合关系，并非替换关系 |
--------------------- 
