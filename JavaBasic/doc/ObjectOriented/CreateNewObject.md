## 创建对象的集中方式
面向对象程序设计(OOP)是当今主流的程序设计规范，它已经基本取代了结构化、过程化的程序设计。
Java就是面向对象的，使用java开发程序，不管做什么样的操作，我们第一步都是从创建对象、获取对象开始，有了对象我们就可以完成一切我们所需要的程序了。

那怎么样才能创建对象？java中有哪些创建对象的方法？

我们今天就来详细了解一下。

https://blog.csdn.net/u010889616/article/details/78946580
https://baijiahao.baidu.com/s?id=1618808708841190285&wfr=spider&for=pc

### 一：new运算的方式创建对象

```
String  str = new String();
Object obj = new Object();
```

首先我们有一个关于宠物的类Dog

```
public class Dog{
    String name ;
    public void show(){
    System.out.print("the name is" + name);
    }
}

```

当我们程序中需要出现一只狗狗的时候，我们就可以使用new来创建一个具体的对象了
在这里我们就通过了new的方式获得了一个具体的对象，并且起名为二哈。
```
Dog dog  = new Dog();
dog.name = "二哈";

dog.show();

```
现在，dog1就带表了堆中刚才所实例化出来的对象。以后我们要操作刚才new出来的对象就可以通过dog1来操作了，例如我们让小狗打个招呼(调用Dog类的show方法)：


### 二：通过反射的方式创建对象


Java的反射技术是java程序的特征之一，它允许运行中的Java程序对自身进行检查，或者说“自审”，并能直接操作程序的内部属性。

反射的作用：1）可以通过反射机制发现对象的类型，找到类中包含的方法、属性和构造器2）可以通过反射创建对象并访问任意对象方法和属性

第二种创建java对象的方式就是通过反射来创建了。

还是我们之前用过的Dog类，首先JVM利用ClassLoader(类加载器)先将Dog类加载到内存，然后马上产生了一个Class类型的对象，该对象可以看成是一个模型，以后无论创建多少个Dog类的实例都是利用该模型来生成(一个类所对应的Class类型的对象只有一个)。

通过反射创建对象第一步：需要获得class对象
```
Class classname = Dog.class ;

```


这样获取到类对象之后就可以通过newInstance()这个方法来获取具体的对象了，需要注意的是这个方法的返回值是Object类型，我们需要进行转型操作

```
Dog erha = (Dog) classname.newInstance();

```
这样我们就通过反射的方式创建好了java对象,newInstance()和new的区别如下：


newInstance: 弱类型。低效率。只能调用无参构造。new: 强类型。相对高效。能调用任何public构造。

在这里需要注意的是，newInstance()这个方法只能够调用无参的构造函数(其实这也符合javabean规范，一个类必须拥有一个无参构造函数)，现在我们在Dog类中写有参构造函数(默认覆盖无参构造函数)，值得注意的是，当我们写了有参构造函数之后，系统将不再提供默认的无参构造函数，如果需要的话，需要你自己写

```
public class Dog{
    String name ;
    int age ; 
    public Dog(String name ,int age){
    this.name = name ;
    this.age = age ;
    }
    public void show(){
    System.out.print("the name is" + name);
    }
}

```

现在再去调用newInstance()方法
```
Dog erha = (Dog) classname.newInstance();

```

现在程序运行结果为java.lang.InstantiationException，着就是程序没有无参构造函数而使用newInstance()方法引发的错误了


当然如果你需要调用有参构造函数的话，可以通过以下的办法：

```
Class classname = Dog.class ;
Constructor const =classname.getConstructor(String.class,int.class);
Dog  erha =(Dog) const.newInstance("erha",1)

```

程序的第二行我们调用Class对象的getConstructor方法，然后在参数列表中传入String和int，因为我们的有参构造函数的参数列表就是这样规定的，现在我们就获取到了前边定义好的Dog类的有参构造函数了第三行我们通过获取的Constructor对象调用newInstance方法，然后在方法中传入Object类型的参数列表，因为我们的有参构造函数需要这些值，这样就可以通过反射的方式创建只有有参构造函数的对象了


### 三：通过对象反序列化的方式来创建


当我们使用反序列化一个对象的时候，JVM会给我们创建一个对象。但是，反序列化的时候JVM并不会去调用类的构造函数(前边两种方式都会去调用构造函数)来创建对象，而是通过之前序列化对象的字节序列来创建的。

序列化对象必须实现Serializable这个接口把对象转为字节序列的过程称为对象的序列化把字节序列恢复为对象的过程称为对象的反序列化

```
public class Dog implements Serializable{
    String name ;
    int age ; 
    public Dog(String name ,int age){
    this.name = name ;
    this.age = age ;
    }
    public void show(){
    System.out.print("the name is" + name);
    }
}

```

需要注意的是：Dog类需要实现Serializable这个接口才可以被序列化/反序列化，否则会出现java.io.NotSerializableException异常

对象序列化通常有两种用途：

1）将对象的字节序列永久的保存到硬盘上

例如web服务器把某些对象保存到硬盘让他们离开内存空间，节约内存，当需要的时候再从硬盘上取回到内存中使用

2）在网络上传递字节序列

当两个进程进行远程通讯的时候，发送方将java对象转换成字节序列发送(序列化)，接受方再把这些字节序列转换成java对象(反序列化)

当Dog类实现了Serializable接口后，我们现在将Dog对象序列化

```
Dog  dog = new Dog(); 
dog.name = "erha" ; 
dog.age = 3 ;  
FileOutputStream  fos = new FileOutputStream(dog.txt);
ObjectOutputStream ops =new ObjectOutputStream(fos); 
ops.writeObject(dog) ;

```
通过ObjectOutputStream的writeObject方法，我们就将一个对象完成了序列化

现在我们再次将刚才序列化后的对象反序列化回来，这次用到的是ObjectInputStream的readObject方法：

```
FileOutputStream  fos = new FileOutputStream(dog.txt);
ObjectInputtStream ois =new ObjectOutputStream(fos); 
Dog dog =(Dog) ois.readObject();
dog.show();

```
这样我们就使用了对象的序列化完成了java对象的创建


### 四：通过clone的方式来创建


clone方法来源于java中object类，在jdk中的解释为：该方法返回一个此对象的副本。clone顾名思义就是复制的意思。所谓复制对象就是在内存中分配一个和原一模一样的空间，在此创建新的对象。

我们现在就来完成clone的实验，首先我们需要在需要clone的类中实现Cloneable接口，

否则会出现java.lang.CloneNotSupportedException异常,由于Object类中clone方法是protected 修饰的，所以我们必须在需要克隆的类中重写克隆方法

```
public class Dog implements Cloneable{
    String name ;
    int age ; 
    public Dog(String name ,int age){
    this.name = name ;
    this.age = age ;
    }
    public void show(){
    System.out.print("the name is" + name);
    }
    
    @Overrride
    protected Object clone() throws CloneNotSupportedException{
    return super.clone();
    }
}

```

现在进入实验1：

```
Dog d1 = new Dog() ;
Dog d2 = d1 ;

System.out.print(d1 == d2 ) ;


```



返回值为true，因为在这个地方只有d1是真实创建了对象，d2来源于d1的赋值，引用地址值一样(代表是同一个对象)，所以==判断结果为true



现在进入实验2：


```
Dog d1 = new Dog() ;
Dog d2 = d1.clone() ;

System.out.print(d1 == d2 ) ;

```


实验结果为false，因为clone是真实在内存中重新划分一块区域来存储新的对象，d1和d2是两个不同的对象所以返回结果值为false


这样我们就使用了对象的克隆的方式完成了java对象的创建。