### static关键字(主方法)
//public:主方法是程序的开始，所以这个方法对任何操作都一定是可见的。  
//static:证明此方法是由类名称调用的。 //void:主方法是一切执行的开始点，既然是所有的开头，就不能回头。  
//main :是一个系统规定好的方法名称，不能修改
//String args[]:指的是程序运行的时候传递的参数。  
//范例:
```
public class TestDemo{
public static void main(String args[]){ 
for(int x=0;x<args.length;x++){
System.out.println(args[x]); }
} }
//执行时所有输入的参数必须使用空格分割，例如java TestDemo 参数 参数 参数 
//也可以使用双引号来区分 java TestDemo "Hello world" "Hello mldn"
```
### static关键字(应用案例)
//1、开发之中首选的属性一定不是static属性，首选的方法一定不是static方法;   
//2、static属性和方法可以在没有实例化对象的时候直接由类名称进行调用;   
//3、static属性保存在全局数据区，而内存区共有4个:栈内存、堆内存、全局数据区、全局代码区。
``` 
class Book{

private String title; 
private static int num=0; 
public Book(){
this("notitle-"+num++);
}
public Book(String title){
this.title=title;
}
public String getTitle(){
return this.title; }
}
public class TestDemo{
public static void main(String args[]){
System.out.println(new Book("Java").getTitle());
System.out.println(new Book().getTitle());
System.out.println(new Book().getTitle()); }
}
```
### 代码块(普通代码块)
```
public class TestDemo{
public static void main(String args[]){
//if(true){//条件一定满足，去除此行的判断，大括号里面的内容就变为普通代码块 int num=10;//局部变量
System.out.println("num="+num);
}
int num=100;//全局变量 
System.out.println("num="+num);
} }
```
### 代码块(构造块)
```
//如果一个代码块写在一个类里面，就称为构造代码块 
class Book{
//这个是构造方法
public Book(){ 
System.out.println("[A]Book类的构造方法");
}
//这个是代码块
{
System.out.println("[B]Book类中的构造块"); 
}
}
public class TestDemo{
public static void main(String args[]){ new Book();
new Book();
new Book();
} }
```
### 代码块(静态块)
//如果一个代码块使用了static进行定义的话，那么就称为静态块。可是静态块的使用要分为2种情况:   
//非主类中使用,优先于构造块执行，不管有多少个实例化对象，静态块只执行一次。它的功能是为了类中的static属性初始化的。 
```
class Book{
static String msg;
public Book(){ System.out.println("[A]Book类的构造方法"); }
{
System.out.println("[B]Book类中的构造块"); }
static{
msg="Hello".substring(0,2); System.out.println("[C]Book类中的静态块");
} }
public class TestDemo{
public static void main(String args[]){
new Book();
new Book();
new Book(); 
System.out.println(Book.msg);
} }
```
//情况2:在主类中使用，静态块优先于主方法执行
```
public class TestDemo{ static{
System.out.println("**************"); }
public static void main(String args[]){ System.out.println("Hello World!");
} }
```
//总结，代码块能不用就别用，唯一还可用的就是静态块