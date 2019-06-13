# JavaBasic
## 第一部分:Java基础知识
* 1 Java 简介
    * [java 概述](./doc/new2java/OverViewOfJAVA.md)
        * 什么是JAVA
        * JAVA的跨平台性
        * JAVA的版本
    * [Java 语言特性](./doc/new2java/JavaFeatures.md)
    * [搭建Java 环境](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/new2java/JDK%20%E7%9A%84%E5%AE%89%E8%A3%85.html)
        * JDK与 JRE
        * 安装JDK
        * 第一个Java 程序
    * 思考
        * [练习题](./doc/new2java/HomeWork.md)
    
* 2 开发工具【Eclipse /IDEA】
    * [安装MyEclipse](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/DevelopTools/%E5%AE%89%E8%A3%85myeclipse.html)
    * 安装IDEA
* 3 Java语言基础
    * java 主类的结构
    * [基本数据类型](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/Java_Basic/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B.html)
    * 变量与常量
        * [变量](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/Java_Basic/Java%E5%8F%98%E9%87%8F.html)
    * [运算符](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/Java_Basic/%E8%BF%90%E7%AE%97%E7%AC%A6.html)
    * [注释|关键字| 标识符](https://htmlpreview.github.io/?https://github.com/HbnKing/Basic/blob/master/JavaBasic/doc/Java_Basic/%E6%B3%A8%E9%87%8A%E3%80%81%E5%85%B3%E9%94%AE%E5%AD%97%E3%80%81%E6%A0%87%E8%AF%86%E7%AC%A6.html)
    * 思考
        * [练习题](./doc/Java_Basic/HomeWork.md)
* 4 流程控制
    * [分支结构](./doc/WorkFlow/ConditionalStatement.md)
        * if-else
        * switch-case
    * [循环结构](./doc/WorkFlow/LoopStatement.md)
        * for
        * while
        * dowhile
    * 循环控制
    * 思考
* 5 方法的定义和使用
* 6 数组
    * [一维数组的创建及使用](./doc/Array/OneDimensionArray.md)
    * [二维数组的创建及使用](./doc/Array/TwoDomensionArray.md)
    * [数组的基本操作](./doc/Array/ArraysOperation.md)
    * [数组排序算法](./doc/Array/Array'sSorting.md)
* 7 字符串
    * [字符串的两种实例化方法及区别](./doc/String/instantiate.md)
    * 匿名对象
    * [字符串的比较](./doc/String/StringComparison.md)
    * [不可变字符串](./doc/String/UnmutableString.md)
    * [String 类的常用方法](./doc/String/String'sMethod.md)
    * 正则表达式
    * 格式化字符串
    * [String作为参数](./doc/String/StringAsParameter.md)
    * [String类的HashCode()方法](./doc/String/String_and_hashcode.md)
    * 常见问题
        * replace和replaceAll的区别

* 8 类和对象ObjectOriented
    * [面向对象概述](./doc/ObjectOriented/ObjectOriented.md)
        * 对象
        * 类
        * 封装
        * 继承
        * 多态
    * 类
        * [简单java类](./doc/ObjectOriented/SimpleJavaDemo.md)
        * 成员变量
        * 成员方法
        * 成员修饰符
        * 局部变量
        * 局部变量的有效范围
        * this关键字
    * [类的构造方法](./doc/ObjectOriented/ConstructFuction.md)
    * 静态变量 常量和方法
    * 类的主方法
    * 对象
        * 对象的创建
        * 访问对象的属性和行为
        * 对象的引用
        * 对象的比较
        * 对象的销毁
    * 思考
        * [练习题](./doc/ObjectOriented/HomeWork.md)
* 9 包装类
    * Number类
    * Integer
    * [Integer的比较问题](./doc/PackageType/TheCompareOfInteger.md)
        
* 10 Java基础类库
    * 数字操作类
        * 数学运算
            * Math类
            * 常用数学运算方法
        * 随机数
            * Math.random() 方法
            * Random类
        * 大数字运算
            * BigInteger
            * BigDecimal
    * 日期操作类
        * java.util.Date 和java.sql.Date
    * StringBuffer类
        String和StringBuffer和StringBuilder
    * Runtime类
    * System类
    * 对象克隆
* 类图 UML 
    
    


## 第二部分:核心技术 
* 11 接口、继承与多态
* 13 类的高级特性
* 13 异常处理
* 14 Swing程序设计 
* 15 集合类
    * 集合类概述
    * 集合类的深入研究
    * Collection 接口
    * List 集合
        * List接口   
        * List接口的实现类   
    * Set集合
    * Map接口   
        * Map接口  
        * Map接口的实现类
* 16 IO流
* 序列化与反序列化
    * 我们为啥需要序列化
* 17 反射
* 18 枚举与泛型
* 19 多线程
    * 多线程的实现
    * 多线程的操作方法
    * 线程的同步与死锁
    * 生产者与消费者模型
    * 回顾
        * 单线程多个while(true)会执行到后面的么？
        * 为什么run()方法里面是while(true)?
* 20 网络通信
    * [网络编程简介](./doc/NetworkProgram/BriefIntroduction.md)
    * [网络编程实现](./doc/NetworkProgram/ServerSocket&&Socket.md)
    * [网络编程ECHO模型](./doc/NetworkProgram/EchoDemo.md),[多线程网络编程](./doc/NetworkProgram/ChartingRoom.md)
* 21 数据库操作
    * [JDBC 数据库连接技术](./doc/JDBC/JDBC.md)
    * [sql包jdbc连接](./doc/JDBC/JDBCPackage.md)
    * [Statement和PreparedStatement](./doc/JDBC/StatementPrepareStatement.md)
    * [批处理与事务处理](./doc/JDBC/Transaction.md)
    * ORM 
    * 分页模型
    
* 21 Annotation
* 21 Java8新特性
    * 接口定义增强
    * Lamda表达式
    * 方法引用
    * 内建函数式接口
* 12 设计模式案例 
* DAO 设计模式



## 第三部分:高级应用

* 正确 使用Volatile
* JVM 内存模型
* JVM 类家在机制
* JVM 垃圾回收机制 

* Swing 看看框架设计

## 第四部分:项目实战
有项目么？




