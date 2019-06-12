## Integer比较问题
```
System.out.println(Integer.valueOf(127)==Integer.valueOf(127));
System.out.println(Integer.valueOf(128)==Integer.valueOf(128));
System.out.println(Integer.parseInt("128")==Integer.valueOf("128"));
输出

true
false
true
```

为什么会有这问题？通过源代码
```
public static Integer valueOf(int i) {
   if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    return new Integer(i);
}
```
代码中的IntegerCache.low为固定值-128，IntegerCache.high根据VM系统参数不同会有区别，默认127，因此在[-128,127]范围内，实例化的时候是返回的同一个对象，必然相等。当Integer修改的时候，由于他是*不可变对象（参考String,每次修改都是重新生成对象）*，也不会出现问题。对于第三个例子，parseInt（）的返回是int,这时和Integer比较，Integer会拆包为int,当然也就相等。
另外补充一点，当我们调用

Integer i = 1;
其实也是执行

Integer i = Integer.valueOf(1);
可以从反编译中看出
```
//源码
public static void main(String[] args){
  Integer i = 1;
  int r = i + 1;
}
```
//反编译结果
```
public static void main(java.lang.String[]);
  Code:
     0: iconst_1      
     1: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     4: astore_1      
     5: aload_1       
     6: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
     9: iconst_1      
    10: iadd          
    11: istore_2      
    12: return  
```
自动拆箱调用intValue（），自动装箱调用valueOf()。

