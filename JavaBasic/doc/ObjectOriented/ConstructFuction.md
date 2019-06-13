## 深入分析类与对象(构造方法与匿名对象)
```
class Book{
public Book(){//构造方法。
System.out.println("***********");
}
public void print(){//普通方法
System.out.println("HELLO");}
}
public class Demo{
public static void main(String args[]){
Book book=null;//声明对象
book=new Book();//实例化对象，所有构造方法都在对象使用关键字new实例化时候调用，只能调用一次。 System.out.println(book);//输出第一次实例化后对象的堆内存地址
book.print();//普通方法可以多次调用
book.print();//普通方法可以多次调用
book.print();//普通方法可以多次调用
book=new Book();//又重新实例化了一次对象，堆内存里面的地址已经变化，也就是说这已不是之前那个对象了 System.out.println(book);//验证上一句话
}//构造方法是在实例化新对象(new)的时候只调用一次
}//普通方法是在实例化对象产生之后可以随意调用多次
```
//总结:1、构造方法的定义要求:方法名称与类名称相同，且无返回值声明。  
 //2、构造方法是在类对象使用关键字new实例化对象时候被默认调用的，不管你代码如何改变，只要是有了关键字new，就一定需要构造方法;   
 //3、一个类中至少保留一个构造方法，如果没有明确定义构造方法，那么会自动生成一个无参的什么都不做的构造方法。   
 //4、构造方法的核心功能是在类对象实例化的时候为类中的属性初始化;  
//5、构造方法重载时只考虑参数的类型和个数即可。  
