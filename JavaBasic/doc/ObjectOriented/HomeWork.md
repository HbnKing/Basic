
## 面向对象作业
### 填空题
面向对象的三大特征是_____、_____、_____。
如果一个对象没有被实例化就直接使用，则使用时会出现_____。
对象产生的格式                                                   。
继承通过_____关键字实现。
实现接口通过_____关键字。
当一个类的修饰符为_____ 时，说明该类不能被继承，即不能有子类。
选择题
被下列修饰符修饰的类不能实例化为对象的是（）。
A. protected B. abstract C. final D. public
下列说法正确的是（）。
A. final关键字可修饰类、属性、方法
B. abstract关键字可修饰类、属性、方法
C. 定义抽象方法需有方法的返回类型、名称、参数列表和方法体
D. 用final修饰的变量，在程序中可对这个变量的值进行更改
下列关于修饰符混用的说法，错误的是（ ）
A. abstract不能与final并列修饰同一个类
B. abstract类中不可以有private的成员
C. abstract方法必须在abstract类中
D. static方法中能处理非static的属性
下列说法正确的有（）
A． class中的constructor不可省略
B． constructor必须与class同名，但方法不能与class同名
C． constructor在一个对象被new时执行
D．一个class只能定义一个constructor
java.lang包的（）方法比较两个对象是否相等，相等返回true。
A．toString（）
B．equals（）
C．compare（）
D．以上所有选项都不正确
选项中哪一行代码可以替换题目中//add code here而不产生编译错误？（）
public abstract class MyClass {
public int constInt = 5;
//add code here
public void method() {
}
}
A public abstract void method(int a);
B constInt = constInt + 5;
C public int method();
D public abstract void anotherMethod() {}
下面是People和Child类的定义和构造方法，每个构造方法都输出编号。在执行new Child("mike")的时候都有哪些构造方法被顺序调用？请选择输出结果 ( )
class People {
String name;
public People() {
System.out.print(1);
}
public People(String name) {
System.out.print(2);
this.name = name;
}
}
class Child extends People {
People father;
public Child(String name) {
System.out.print(3);
this.name = name;
father = new People(name + ":F");
}
public Child() {
System.out.print(4);
}
}
A 312              B 32               C 432              D 132
编译并运行下面的程序，运行结果是（ ）。 
public class K {
    public static void main(String args[]) {
                    K a = new K();
                    a.method(8);
    }
    void method(int i) {
                    System.out.println("int:  " + i);
    }
    void method(long i) {
                    System.out.println("long:  " + i);
    }
}
A．程序可以编译运行，输出结果为：“int:  8”     
B．程序可以编译运行，输出结果为：“long:  8”      
C．程序有编译错误，因为两个method()方法必须定义为静态（static）的
D．程序可以编译运行，但是没有输出
以下关于继承的叙述正确的是（ ）。
A、在Java中类只允许单一继承
B、在Java中一个类只能实现一个接口
C、在Java中一个类不能同时继承一个类和实现一个接口
D、在Java中接口只允许单一继承
在Java中，一个类可同时定义许多同名的方法，这些方法的形式参数的个数、类型或顺序各不相同，传回的值也可以不相同。这种面向对象程序特性称为（）
A 隐藏 B 重写 C 重载 D Java不支持此特性
以下有关构造方法的说法，正确的是：（  ）
A． 一个类的构造方法可以有多个
B． 构造方法在类定义时被调用
C． 构造方法只能由对象中的其它方法调用。
D． 构造方法可以和类同名，也可以和类名不同
下列类定义中哪些是合法的抽象类的定义？（ ）
A、abstract Animal{abstract void growl();}
B、class abstract Animal{abstract void growl();}
C、abstract class Animal{abstract void growl();}
D、abstract class Animal{abstrac t void growl(){System.out.println(“growl”);};}
简答题
请简单说说面想对象的特征，并说说对它们的理解。
Java中的方法覆盖(Overriding)和方法重载(Overloading)是什么意思？
Java支持多继承么？
接口是否可继承接口? 抽象类是否可实现(implements)接口? 抽象类是否可继承实体类(concrete class)?
当一个对象被当作参数传递到一个方法后，此方法可改变这个对象的属性，并可返回变化后的结果，那么这里到底是值传递还是引用传递? 
编程题
设计一个Dog类，有名字、颜色、年龄等属性，定义构造方法来初始化这些属性，定义方法输出Dog信息，编写应用程序使用Dog类。
写一个单例模式Singleton出来，Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。


### 答案在这里 

面向对象作业
一、	填空题
1．	面向对象的三大特征是_封装____、_继承__、_多态__。
2．	如果一个对象没有被实例化就直接使用，则使用时会出现_ NullPointerException _。
3．	对象产生的格式       类名 对象名 =  new 类名();          。
4．	继承通过_extends_关键字实现。
5．	实现接口通过__implements_关键字。
6．	当一个类的修饰符为_final_ 时，说明该类不能被继承，即不能有子类。
二、	选择题
1．	被下列修饰符修饰的类不能实例化为对象的是（）。B
A. protected B. abstract C. final D. public    //抽象类不能被实例化final不能被继承
2．	下列说法正确的是（）。A
A. final关键字可修饰类、属性、方法
B. abstract关键字可修饰类、属性、方法    //类和方法
C. 定义抽象方法需有方法的返回类型、名称、参数列表和方法体  //不需要方法体
D. 用final修饰的变量，在程序中可对这个变量的值进行更改	//不可修改
3．	下列关于修饰符混用的说法，错误的是（ ）D
A. abstract不能与final并列修饰同一个类
B. abstract类中不可以有private的成员   //可以但是没有意义
C. abstract方法必须在abstract类中
D. static方法中能处理非static的属性// static方法中，不能访问类内非static成员变量和方法
4．	下列说法正确的有（）C
A． class中的constructor不可省略   //省略时系统生成一个
B． constructor必须与class同名，但方法不能与class同名		//方法可以和类名同名的，和构造方法唯一的区别就是，构造方法没有返回值

C． constructor在一个对象被new时执行
D．一个class只能定义一个constructor
5．	java.lang包的（）方法比较两个对象是否相等，相等返回true。B
A．toString（）
B．equals（）
C．compare（）
D．以上所有选项都不正确
6．	选项中哪一行代码可以替换题目中//add code here而不产生编译错误？（）A
public abstract class MyClass {
public int constInt = 5;
//add code here
public void method() {
}
}
A public abstract void method(int a);
B constInt = constInt + 5;
C public int method();
D public abstract void anotherMethod() {}
7．	下面是People和Child类的定义和构造方法，每个构造方法都输出编号。在执行new Child("mike")的时候都有哪些构造方法被顺序调用？请选择输出结果 ( )D

class People {
String name;

public People() {
System.out.print(1);
}

public People(String name) {
System.out.print(2);
this.name = name;
}
}

class Child extends People {
People father;

public Child(String name) {
System.out.print(3);
this.name = name;
father = new People(name + ":F");
}

public Child() {
System.out.print(4);
}
}

A 312              B 32               C 432              D 132
8．	编译并运行下面的程序，运行结果是（ ）。  A
public class K {
	public static void main(String args[]) {
		K a = new K();
		a.method(8);
	}
	void method(int i) {
		System.out.println("int:  " + i);
	}
	void method(long i) {
		System.out.println("long:  " + i);
	}
}
A．程序可以编译运行，输出结果为：“int:  8”      
B．程序可以编译运行，输出结果为：“long:  8”       
C．程序有编译错误，因为两个method()方法必须定义为静态（static）的 
D．程序可以编译运行，但是没有输出
9．	以下关于继承的叙述正确的是（ ）。A
A、在Java中类只允许单一继承
B、在Java中一个类只能实现一个接口
C、在Java中一个类不能同时继承一个类和实现一个接口
D、在Java中接口只允许单一继承
10．	在Java中，一个类可同时定义许多同名的方法，这些方法的形式参数的个数、类型或顺序各不相同，传回的值也可以不相同。这种面向对象程序特性称为（）C
A 隐藏 B 重写 C 重载 D Java不支持此特性
11．	以下有关构造方法的说法，正确的是：（  ）A
A． 一个类的构造方法可以有多个 
B． 构造方法在类定义时被调用
C． 构造方法只能由对象中的其它方法调用。
D． 构造方法可以和类同名，也可以和类名不同
12．	下列类定义中哪些是合法的抽象类的定义？（ ）C
A、abstract Animal{abstract void growl();}
B、class abstract Animal{abstract void growl();}
C、abstract class Animal{abstract void growl();}
D、abstract class Animal{abstrac t void growl(){System.out.println(“growl”);};}

三、	简答题
1．	请简单说说面想对象的特征，并说说对它们的理解。
封装    藏对象的属性和实现细节，仅对外提供公共访问方式。
继承   多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中 
多态 就是某一类事物的多种存在形态  

2．	Java中的方法覆盖(Overriding)和方法重载(Overloading)是什么意思？
方法重载(Overloading)是一个类中定义了多个方法名相同,而他们的参数的数量不同或数量相同而类型和次序不同。
方法重写(Overriding)是两个方法具有相同的参数，但是不同的实现方式。其中一个存在于父类，另一个存在于子类。

3．	Java支持多继承么？
Java不支持多继承，这是因为当多个父类中定义了相同方法，而方法内容不同时，子类对象在调用该方法时，不明确要运行哪一个，有安全隐患
4．	接口是否可继承接口? 抽象类是否可实现(implements)接口? 抽象类是否可继承实体类(concrete class)?
都可以
5．	当一个对象被当作参数传递到一个方法后，此方法可改变这个对象的属性，并可返回变化后的结果，那么这里到底是值传递还是引用传递? 
在 Java应用程序中，当对象引用是传递给方法的一个参数时，您传递的是该引用的一个副本（按值传递），而不是引用本身。
是值传递

四、	编程题
1．	设计一个Dog类，有名字、颜色、年龄等属性，定义构造方法来初始化这些属性，定义方法输出Dog信息，编写应用程序使用Dog类。


2．	写一个单例模式Singleton出来，Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。


