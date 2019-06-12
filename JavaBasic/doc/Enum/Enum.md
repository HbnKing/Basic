## 枚举类型
默认枚举继承至Enum类,由于Java的单一继承机制,所以不能在继承至别的类.
枚举中的元素实质为类的类部静态常量域.
```
public class EnumTest {
    enum Test {
        TEST_1("1"), TEST_2("2");
        private String descript;
        Test(String descript) {
            this.descript = descript;
        }
    }
}
```
该枚举通过反编译查看其内部(javap EnumTest$Test.class),另外,枚举类是final,不会有子类
```
java
Compiled from "EnumTest.java"
final class EnumTest$Test extends java.lang.Enum<EnumTest$Test> {
public static final EnumTest$Test TEST_1;
public static final EnumTest$Test TEST_2;
public static EnumTest$Test[] values();
public static EnumTest$Test valueOf(java.lang.String);
static {};
}
```

对于其构造函数,由于不允许用户自行实例化,构造器为private和public都是一样的.

静态导入,如上面的例子.再别的地使用可以使用静态导入
import static EnumTest.Test.*
Java的switch子句支持的类型

* short(Short)
* char(Charactor)
* byte(Byte)
* int(Integer)
* String
* enum
在Java7中引入的String本质上也是使用int来做判断的(hashCode()和equals())

枚举的values()静态函数是由编译器写入.向上转型为Enum后丢失.但可以通过Class的getEnumContants()获取到枚举元素.

枚举实现抽象方法
```
enum FontConstant{
      Blod{
          @Override
          void show() {
             //TODO
          }
      },
      Italilc{
          @Override
          void show() {
             //TODO
          }
      },
      Plain{
          @Override
          void show() {
             //TODO
          }
      };
      abstract void show();
}
```
EnumSet和EnumMap的使用

EnumSet
内部的数据的顺序与add(...)时的顺序没有关系,而是与enum中声明的顺序一致,

```
public static void showEnumSet(){
    EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);
    enumSet.add(FontConstant.Blod);
    enumSet.add(FontConstant.Plain);
    enumSet.add(FontConstant.Italilc);
    enumSet.add(FontConstant.Blod);
    for(Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();){
        System.out.println(iter.next());
    }
}
```
输出:
```
Blod
Italilc
Plain
```

由此可以看见,EnumSet的顺序是与enum的声明有关,并且只能添加不重复的对象

EnumMap
EnumMap与EnumSet的顺序是一样的.

枚举责任链
实现依赖与枚举的顺序
```
java
enum Handler {
HANDLER_1 {
@Override
boolean handler(Action action) {
return action.action == 1;
}
},
HANDLER_2 {
@Override
boolean handler(Action action) {
return action.action == 2;
}
};

abstract boolean handler(Action action);
}

public static class Action{
int action;

public Action(int action) {
    this.action = action;
}
}

public static void handler(Action action) {
for (Handler handler : Handler.values()) {
if (handler.handler(action)) {
System.out.println(handler.name() + " Handle This Action");
return;
}
}
System.out.println("No One Can Handle");
}

public static void main(String[] args) {
Action a1 = new Action(1);
handler(a1);
Action a2 = new Action(2);
handler(a2);
Action a3 = new Action(3);
handler(a3);
}
```
输出
```
HANDLER_1 Handle This Action

HANDLER_2 Handle This Action

No One Can Handle
```
枚举状态机
1个事件的完成要经过A->B->C->D四个状态,
```
java
public void process(Status status){
switch(status.getStatus){
case A:
status.setStatus(B);
break;
case B:
status.setStatus(C);
break;
... 
}
}
```

这是使用(if/else)/switch实现,我们还可以使用enum来实现
```
java
enum Status {
A {
@Override
void process(Product pro) {
pro.status = B;
}
},
B {
@Override
void process(Product pro) {
System.out.println("OK");
pro.status = C; //reset
}
},
...
abstract void process(Product pro);
}

public static class Product{
private Status status = Status.A;
public void make(){
status.process(this);
}
}

public static void main(String[] args) {
Product product = new Product();
for (int i = 0; i < 10; i++) {
System.out.println(product.status.name());
product.make();
}
}
```

枚举多路分发
根据对象的类型而对方法进行的选择,就是分派(Dispatch)。

静态分派(编译时)
```
  static class A {}
  static class B extends A {}
  static class C extends A {}    
  public static void print(A obj){
      System.out.println("A");
  }
  public static void print(B obj){
      System.out.println("B");
  }
  public static void print(C obj){
      System.out.println("C");
  }
  public static void main(String[] args) {
      A a = new A();
      print(a);
      A b = new B();
      print(b);
      A c = new C();
      print(c);
  }
  ```
  输出
  ```
  > A
  > A
  > A
  ```
动态分派(运行时)
```
static class A {
  public void print(){
      System.out.println("A");
  }
}


static class B extends A {
  @Override
  public void print() {
      System.out.println("B");
  }
}
static class C extends A {
  @Override
  public void print() {
      System.out.println("C");
  }
}

public static void main(String[] args) {
  A a = new A();
  a.print();
  A b = new B();
  b.print();
  A c = new C();
  c.print();
}
```
输出
```
A

B

C
```
两路分发
```
public enum Outcome { WIN, LOSE, DRAW } ///:~
interface Item {
    Outcome compete(Item it);
    Outcome eval(Paper p);
    Outcome eval(Scissors s);
    Outcome eval(Rock r);
}

class Paper implements Item {
    public Outcome compete(Item it) {
        return it.eval(this);
    }
    public Outcome eval(Paper p) {
        return DRAW;
    }
    public Outcome eval(Scissors s) {
        return WIN;
    }
    public Outcome eval(Rock r) {
        return LOSE;
    }
    public String toString() {
        return "Paper";
    }
 }

  class Scissors implements Item {
      public Outcome compete(Item it) {
          return it.eval(this);
      }

      public Outcome eval(Paper p) {
          return LOSE;
      }

      public Outcome eval(Scissors s) {
          return DRAW;
      }

      public Outcome eval(Rock r) {
          return WIN;
      }

      public String toString() {
          return "Scissors";
      }
  }

  class Rock implements Item {
      public Outcome compete(Item it) {
          return it.eval(this);
      }

      public Outcome eval(Paper p) {
          return WIN;
      }

      public Outcome eval(Scissors s) {
          return LOSE;
      }

      public Outcome eval(Rock r) {
          return DRAW;
      }

      public String toString() {
          return "Rock";
      }
}

public class RoShamBo1 {
  static final int SIZE = 20;
  private static Random rand = new Random(47);

  public static Item newItem() {
      switch (rand.nextInt(3)) {
      default:
      case 0:
          return new Scissors();
      case 1:
          return new Paper();
      case 2:
          return new Rock();
      }
  }

  public static void match(Item a, Item b) {
      //在这里两个参数a和b的类型都不确切,
      //通过动态调用a.compete()可以调到真实的a的compete(),
      //而在具体类型的compete通过同样的方式,获取到b的确切类型
      //在更具重载的方法调用到了具体的方法
      System.out.println(a + " vs. " + b + ": " + a.compete(b));
  }

  public static void main(String[] args) {
      for (int i = 0; i < SIZE; i++)
          match(newItem(), newItem());
  }
} 
```
多路分发就是指在调用a.plus(b)，a和b都不知道确切类型，也能让他们正常交互。
如果想使用两路分发，那么必须有两个方法调用，第一个方法调用决定第一个未知类型，第二个方法调用决定第二个未知类型。要利用多路分发，程序员必须为每一个类型提供给一个实际的方法调用。一般而言，程序员需要设定好某种配置，以便一个方法调用能够引出更多的方法调用，从而能在这个过程中处理多个类型。