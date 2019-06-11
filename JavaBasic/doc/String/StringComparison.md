##  字符串比较

`==`是进行数值判断，用于字符串比较时，比较的是字符串内存地址数值的大小。
```
public class StringDemo{
public static void main(String args[]){ String stra="hello";
String strb=new String("hello"); String strc=strb;//引用传递 System.out.println(stra==strb); System.out.println(stra==strc); System.out.println(strb==strc);
}
}
```
字符串比较用equal()例如stra.equal(strb) //比较字符串内容的话，可以使用String类里面定义的方法。
```
public boolean equals(String str) public class StringDemo{
public static void main(String args[]){ String stra="hello";
String strb=new String("hello"); String strc=strb;//引用传递 System.out.println(stra.equals(strb)); System.out.println(stra.equals(strc)); System.out.println(strb.equals(strc));
} }
```