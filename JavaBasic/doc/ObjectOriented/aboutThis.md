##  关于this

### this关键字(调用属性)
先看一个 demo
没有使用this的情况
```
class Person{        // 定义Person类
    private String name ;        // 姓名
    private int age ;            // 年龄
    public Person(String name,int age){    // 通过构造方法赋值
        name = name ;
        age = age ;
    }
    public String getInfo(){    // 取得信息的方法
        return "姓名：" + name + "，年龄：" + age ;
    }
};
public class ThisDemo01{
    public static void main(String args[]){
        Person per1 = new Person("张三",33) ;    // 调用构造实例化对象
        System.out.println(per1.getInfo()) ;    // 取得信息
    }
};
```
运行结果：
姓名：null,年龄：0；
你会发现 初始化 失败 ，传值 失败 。
可以得出结论：此时并没有正确将内容赋给属性；

假设身边有一只笔，远处也有一只笔，肯定会就近拿身边的笔。这在构造方法中一样。

所以此时操作的name,age都是构造方法中定义的name,age.跟类中属性完全不沾边。

**此时，为了明确哪个是类中的属性，需要加上this.类中属性。  
在以后的开发中，只要是访问类中的属性前面必须加上"this."** 
```
class Book{
private String title;
private double price;
public Book(String t,double p){
title=t;
price=p; }
//setter\getter略 public String getInfo(){
return"书名:"+title+",价格:"+price; }
}
```

```
public class TestDemo{
public static void main(String args[]){
Book bk=new Book("Java开发",89.2); 
System.out.println(bk.getInfo());
}

}
```
```
class Book{
private String title;
private double price;
public Book(String title,double price){
this.title=title;//程序默认找最近一个{}内的参数，加了this.表示是大类中的属性，而不是此方法中的参数。
this.price=price; }
//setter\getter略 public String getInfo(){
return"书名:"+this.title+",价格:"+this.price;//以后的开发中，只要是访问类中的属性，前面必须加this. }
}
```
```
public class TestDemo{
public static void main(String args[]){ Book bk=new Book("Java开发",89.2); System.out.println(bk.getInfo());
}
}
```
### this关键字(调用构造方法)

如果在类中有多个构造方法，也可以利用this关键字互相调用。

假设一个类中存在多个构造方法，但无论多少构造方法，都要打造一个“新对象实例化”，此时就有两种做法。

按照最原始方法：   
```
class Book{
private String title;
private double price;
public Book(String title,double price){
this.title=title;//程序默认找最近一个{}内的参数，加了this.表示是大类中的属性，而不是此方法中的参数。
this.price=price; }
//setter\getter略 public void print(){
System.out.println("*******"); }
public String getInfo(){
this. print();//调用本类方法，不加this.也认为是调用本类方法，结果一样。为了代码的严谨性应该加this.
return"书名:"+this.title+",价格:"+this.price;//以后的开发中，只要是访问类中的属性，前面必须加this. }
}
```
```
public class TestDemo{
public static void main(String args[]){ Book bk=new Book("Java开发",89.2); System.out.println(bk.getInfo());
}
}
```
```
class Book{
private String title; private double price; public Book(){
System.out.println("一个新的Book类对象产生了");//把这句话想象成一个20行的代码 }
public Book(String title){
System.out.println("一个新的Book类对象产生了");//代码重复，违背写代码原则
this.title=title;
}
public Book(String title,double price){
System.out.println("一个新的Book类对象产生了"); this.title=title;
this.price=price;
}
//setter\getter略 public String getInfo(){
return"书名:"+this.title+",价格:"+this.price; }
}
```
```
public class TestDemo{
   
 public static void main(String args[]){ Book bk=new Book("Java开发",89.2); System.out.println(bk.getInfo());
} }
```

现在只是一行，感觉不出来，但是如果现在代码很多行的话，缺陷立刻显现出来了。

此时，最好让构造方法间进行互相调用。

使用：this(若干参数)的形式完成 

```
class Book{
private String title; private double price; public Book(){
System.out.println("一个新的Book类对象产生了"); }
public Book(String title){ this();//调用本类中的无参构造 this.title=title;
}
public Book(String title,double price){
this(title);//调用本类中的单参构造
this.price=price; }
//setter\getter略 public String getInfo(){
return"书名:"+this.title+",价格:"+this.price; }
}
```
```
public class TestDemo{
public static void main(String args[]){ Book bk=new Book("Java开发",89.2); System.out.println(bk.getInfo());
} }//虽然以上实现了构造方法的相互调用，但是存在局限，使用this()调用构造方法形式的代码只能放在构造方法的首行。且构造方法必须留一个出口，也就是至少有一个this()未被调用。
class Emp{
private int empno; private String ename; private double sal; private String dept; public Emp(){
this.empno=0; this.ename="无名氏"; this.sal=0.0; this.dept="未定";
}
public Emp(int empno){
this.empno=empno; this.ename="临时工"; this.sal=800.0; this.dept="后勤部";
}
public Emp(int empno,String ename){
this.empno=empno; this.ename=ename; this.sal=2000.0; this.dept="技术部";
}
public Emp(int empno,String ename,double sal,String dept){
this.empno=empno; this.ename=ename; this.sal=sal; this.dept=dept;
}
public String getInfo(){
return"雇员编号:"+empno+",雇员姓名:"+ename+",工资:"+sal+",部门:"+dept; }
}
```
```
public class TestDemo{
public static void main(String args[]){
Emp ea=new Emp();
Emp eb=new Emp(7366);
Emp ec=new Emp(7566,"ALLEN");
Emp ed=new Emp(7839,"KING",5000,"财务部"); System.out.println(ea.getInfo()); System.out.println(eb.getInfo()); System.out.println(ec.getInfo()); System.out.println(ed.getInfo());
} }//以上是传统方式实现的，但是存在重复代码。不合格
```
```
class Emp{
private int empno; private String ename; private double sal; private String dept; public Emp(){
this(0,"无名氏",0.0,"未定");
}
public Emp(int empno){

 this(empno,"临时工",800.0,"后勤部");
}
public Emp(int empno,String ename){
this(empno,ename,2000.0,"技术部");
}
public Emp(int empno,String ename,double sal,String dept){
this.empno=empno; this.ename=ename; this.sal=sal; this.dept=dept;
}
public String getInfo(){
return"雇员编号:"+empno+",雇员姓名:"+ename+",工资:"+sal+",部门:"+dept; }
}
```
```
public class TestDemo{
public static void main(String args[]){
Emp ea=new Emp();
Emp eb=new Emp(7366);
Emp ec=new Emp(7566,"ALLEN");
Emp ed=new Emp(7839,"KING",5000,"财务部"); System.out.println(ea.getInfo()); System.out.println(eb.getInfo()); System.out.println(ec.getInfo()); System.out.println(ed.getInfo());
} }
```
注意点：

在使用this关键字调用其他关键字的时候，有以下限制：

1）this()调用其他构造方法的语句只能放在构造方法（在其他普通方法里是不行的）的首行；

2）在使用this调用其他构造方法的时候，至少有一个构造方法是不用this调用的。（必须要有结尾，不能无限期的调用下去，循环递归调用）；

否则就会出错

### this关键字(表示当前对象)
```
class Book{
public void print(){
System.out.println("this="+this);//this就是当前调用方法的对象 }//哪个对象调用了print方法，this就自动与此对象指向同一块内存地址
}
public class TestDemo{
public static void main(String args[]){ Book booka=new Book();
Book bookb=new Book(); System.out.println("booka"+booka); booka.print(); System.out.println("—————————"); System.out.println("bookb"+bookb); bookb.print();
} }
```
###   引用传递
//引用传递是Java的精髓所在，引用传递的核心意义是，同一块堆内存空间可以被不同的栈内存所指向。 //范例1:
```
class Message{
private int num=10; public Message(int num){
this.num=num; }
public void setNum(int num){ this.num=num;
}
public int getNum(){
return this.num; }
}
public class TestDemo{
public static void main(String args[]){
Message msg=new Message(30); fun(msg);//引用传递,将msg值传递给temp System.out.println(msg.getNum());
}
public static void fun(Message temp){
temp.setNum(100); }
}
```
     
//范例2:
```
public class TestDemo{
public static void main(String args[]){ String msg="hello";
fun(msg);
System.out.println(msg);
}
public static void fun(String temp){
temp="world";//因为字符串一旦生成就不可更改，所以msg没变化，而temp指向了一块新的堆内存。 }
}
```
 //范例3:
```
class Message{
private String info="nihao"; public Message(String info){
this.info=info; }
public void setInfo(String info){ this.info=info;
}
public String getInfo(){
return this.info; }
}
public class TestDemo{
public static void main(String args[]){ Message msg=new Message("Hello"); fun(msg); System.out.println(msg.getInfo());
}
public static void fun(Message temp){ temp.setInfo("World");
}
}

//虽然String属于类，属于引用类型，但是由于其内容不可改变的特点，很多时候就直接把String当成基本数据类型那样使用。
```
###  引用传递实际应用
```
class Member{
private int mid; private String name; private Member child;
//car有实例化对象表示有车 //car为null表示没有车
private Car car;//表示属于人的车 public Member(int mid,String name){
this.mid=mid;
this.name=name; }
public String getInfo(){
return "人员编号:"+this.mid+",姓名:"+this.name;
  
 }
public void setChild(Member child){//使用的是自定义类型
this.child=child; }
public Member getChild(){ return this.child;
}
public void setCar(Car car){
this.car=car; }
public Car getCar(){ return this.car;
} }
```
```
class Car{
private String pname;
private Member member;//车属于一个人 public Car(String pname){
this.pname=pname; }
public String getInfo(){
return "车的名字:"+this.pname;
}
public void setMember(Member member){
this.member=member; }
public Member getMember(){ return this.member;
} }
```
```
public class TestDemo{
public static void main(String args[]){
Member m=new Member(1,"陈冠佑");
Member chd=new Member(2,"陈冠希");
Car c=new Car("八手奥拓100");
Car cc=new Car("法拉利M9");
m.setCar(c);//一个人有一辆车
c.setMember(m);//一辆车属于一个人
chd.setCar(cc);//一个孩子有一辆车
cc.setMember(chd);//一辆车属于一个孩子
m.setChild(chd);
System.out.println(m.getCar().getInfo());//通过人找到车 System.out.println(c.getMember().getInfo());//通过车找到人 System.out.println(m.getChild().getInfo());//通过人找到他孩子 System.out.println(m.getChild().getCar().getInfo()); //通过人找到他孩子车的信息 ，红色标注的叫代码链
} }
```
```
class Member{
private int mid;
private String pname;
private Car car;
public Member(int mid,String pname){
this.mid=mid;
this.pname=pname; }
public String getInfo(){
return "人员编号:"+this.mid+"，人员姓名:"+this.pname;
}
public void setCar(Car car){
this.car=car; }
public Car getCar(){ return this.car;
} }
class Car{
private String cname; private Member member; public Car(String cname){
this.cname=cname; }
public String getInfo(){
return "汽车名称:"+this.cname;
}
public void setMember(Member member){
this.member=member; }
public Member getMember(){ return this.member;
} }
```
```
public class TestDemo{
public static void main(String args[]){
Member m=new Member(1,"小鱼");
Car c=new Car("福特野马");
m.setCar(c);
c.setMember(m); System.out.println(m.getCar().getInfo()); System.out.println(c.getMember().getInfo());

} }
```

###  对象的比较 
以下这个例子中，生成两个对象，当对象中年龄和姓名完全相等的时候，则认为两个对象是相等的，此时有两个问题

1）如何进行对象比较：

2）在那块对象比较：

String本身是一个类，如果要进行相等比较，需要使用equls()，而，age是Int,直接使用==判断。

```
class Person{        // 定义Person类
    private String name ;    // 姓名
    private int age ;        // 年龄
    public Person(String name,int age){
        this.setName(name) ;
        this.setAge(age) ;
    }
    public void setName(String name){    // 设置姓名
        this.name = name ;
    }
    public void setAge(int age){        // 设置年龄
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public int getAge(){
        return this.age ;
    }
};
public class ThisDemo07{
    public static void main(String args[]){
        Person per1 = new Person("张三",30) ;    // 声明两个对象，内容完全相等
        Person per2 = new Person("张三",30) ;    // 声明两个对象，内容完全相等
        // 直接在主方法中依次取得各个属性进行比较
        if(per1.getName().equals(per2.getName())&&per1.getAge()==per2.getAge()){
            System.out.println("两个对象相等！") ;
        }else{
            System.out.println("两个对象不相等！") ;
        }
    }
};
运行结果：
两个对象相等！
```

以上代码，功能确实实现了，但是由于代码暴露在外面，不安全，容易出错。

应该由自己进行比较最合适，所以应该在Person类中增加一个比较的方法。

当前对象调用传人的对象，当前对象即调用方法的对象，用this表示，

这里表示在哪里比较。

如下：

```java
class Person{        // 定义Person类
    private String name ;    // 姓名
    private int age ;        // 年龄
    public Person(String name,int age){
        this.setName(name) ;
        this.setAge(age) ;
    }
    public boolean compare(Person per){
        // 调用此方法时里面存在两个对象：当前对象、传入的对象
         Person p1 = this ;    // 当前的对象，就表示per1
        Person p2 = per ;    // 传递进来的对象，就表示per2
        if(p1==p2){    // 判断是不是同一个对象，用地址比较
            return true ;
        }
        // 之后分别判断每一个属性是否相等
        if(p1.name.equals(p2.name)&&p1.age==p2.age){
            return true ;    // 两个对象相等
        }else{
            return false ;    // 两个对象不相等
        }
    }
    public void setName(String name){    // 设置姓名
        this.name = name ;
    }
    public void setAge(int age){        // 设置年龄
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public int getAge(){
        return this.age ;
    }
};
public class ThisDemo08{
    public static void main(String args[]){
        Person per1 = new Person("张三",30) ;    // 声明两个对象，内容完全相等
        Person per2 = new Person("张三",30) ;    // 声明两个对象，内容完全相等
        // 直接在主方法中依次取得各个属性进行比较
        if(per1.compare(per2)){
            System.out.println("两个对象相等！") ;
        }else{
            System.out.println("两个对象不相等！") ;
        }
    }
};

//运行结果：
//两个对象相等！
```