## String 作为参数的传递 
String是不可以被修改的
一旦String对象创建之后,我们是不能修改他的值的(这里的修改是指在内存的同一位置).我们可以从JDK的String类里看到
比如substring()方法

    public String substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == value.length)) ? this
                : new String(value, beginIndex, subLen);
    }
在最后,我们发现他返回的String是重新new的一个对象,而不是在原对象的基础上修改

基本类型做参数传的是值,对象传递的是相当于引用
传值是不会导致数据的改变的,但是当传递的是引用,在方法中改变了对象的某字段,会导致方法外部的变量也改变
example:

    public class Test {
        public int i = 0;
        public void chaneg(Test t) {
            t.i = 10;
        }
        public static void main(String[] args) {
            Test test = new Test();
            System.out.println(test.i);
            test.chaneg(test);
            System.out.println(test.i);
        }
    }
output: 0 10

说明在方法内改变变量值导致外部改变
但是对于String当值的改变是,内存地址已改变
则相当于下面的example:

```
public class Test {
public int i = 0;
public void chaneg(Test t) {
t = new Test();//改变内存地址
t.i = 10;
}
public static void main(String[] args) {
Test test = new Test();
System.out.println(test.i);
test.chaneg(test);
System.out.println(test.i);
}
}

output: 0 0
```
也就是说没有改变外部的值
```
public class Test {
    public static void main(String[] args) {
        String a = "aa";
        Test  t = new Test();
        t.changeData(a);
        System.out.println(a);  //输出结果没变

    }
    public void changeData(String a){
        a = a+"b";
    }
}
```
总结  
当在方法中该变量对象的内存地址之后,是不会影响外部的值,
但是如果只是改变了某字段的值,外部的值会跟着改变.

需要注意 传入的 对象本身是否可变。还是改变的是对象的属性。