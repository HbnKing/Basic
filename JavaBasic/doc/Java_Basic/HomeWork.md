## JAVA 基础练习

### Java基础语法作业
填空题
Java语言的注释有__ ____、______、______3种。
Java的标识符的命名规则是___________、___________、____________、__________。
Java的数据类型可以分为________________和________________两种。
布尔（boolean）类型变量的值是_______________。
Java中的八种基本数据类型分别是____、______、_____、______、_____、_____、____、____。
写出下列表达式的运算结果，设a=2,b=-4,c=true。
-a%b++                   
a>=1 && a <= 10 ? a : b       
(double)(a+b)/5+a/b    
（1）         （2）        （3）       。                       
当声明一个数据组int arr[]=new int[5];时，这个数组的最大下标_____。
 
选择题
下面这些标识符哪个是错误的（ ） 
A．Javaworld        B．_sum         C．2Java Program       D．$abc
下面哪个赋值语句不会产生编译错误（ ） 
A．char a=‟abc‟;     B．byte b=152;     C．float c=2.0;         D．double d=2.0;
设各个变量的定义如下，哪些选项的值为true （ ） 
int a=3, b=3;   
boolean flag=true; 
A．++a = = b       B．++a= = b++    C．(++a = = b) || flag   D．(++a= =b) & flag
对下面的语句执行完后正确的说法是：（ ） 
int c='c'/3; 
System.out.println(c);  
A．输出结果为21  B．输出结果为22    C．输出结果为32   D．输出结果为33
下列程序运行的结果是（）。 
public class A { 
public static void main(String args[]) {   
int x = 7%3; 
while(x){   
x--;  
}  
System.out.println(x); 
}
}
A．0       B．1        C．true       D．编译错误
System.out.println("5" + 2);的输出结果应该是（）。
A 52                   B 7                     C 2                     D 5
 0.6332的数据类型是（）
A float     B double     C float      D Double
下面的方法，当输入为2的时候返回值是多少?（）
public static int getValue(int i) {
int result = 0;
switch (i) {
case 1:
result = result + i;
case 2:
result = result + i * 2;
case 3:
result = result + i * 3;
}
return result;
}
A 0                    B 2                    C 4                     D 10
请看下面的程序代码： 
   if (x < 0) {
                                       System.out.println("first");
                       } else if (x < 20) {
                                       System.out.println("second");
                       } else {
                                       System.out.println("third");
                       }
当程序输出“second”时，x的范围是（ ）  
A．x<=0       B．x<20 && x>=0      C．x>0    D．x>=20
下列语句执行后，x的值是（）  
int x=2    
do{
x+=x 
}while(x<17);   
A． 4       B．16         C．32           D．256
执行下列语句后，i、j的值是（ ）  
int i=1, j=8;  
do{
       if(i++>--j)
         continue;  
}while(i<4);  
A． i=4, j=5       B．i=5,j=4       C．i=5,j=5         D．i=5,j=6
设有定义语句“int a[]={66,88,99};”，则以下对此语句的叙述错误的是（） 
A．定义了一个名为a的一维数组      B．a数组有3个元素 
C．a数组的元素的下标为1～3        D．数组中的每个元素是整数
以下哪个不是Java的基本数据类型（  ）
A、int B、Boolean C、float D、char
给出下面代码，关于该程序以下哪个说法是正确的？（ ）
public class Person{
static int arr[] = new int[5];
public static void main(String a[])
{
System.out.println(arr[0]);
}
}
A、编译时将产生错误 B、编译时正确，运行时将产生错误
C、输出零 D、输出空
以下程序段执行后的K值为（ ）。
int x=20; y=30;
k=(x>y)?y:x
A、 20 B、 30 C、10 D、50
简答题
short s1 = 1; s1 = s1 + 1;有什么错? short s1 = 1; s1 += 1;有什么错?
swtich是否能作用在byte上，是否能作用在long上，是否能作用在String上?
char型变量中能不能存贮一个中文汉字?为什么? 
编程题
编写方法，求出这3个数字中的最大值，并将最大值输出。
编写程序，分别利用while循环、do...while循环和for循环求出100~200的累加和。
求1~1000之间可以同时被3、5、7整除的数字。
打印出所有的“水仙花数”，所谓“水仙花数”是指一个3位数，其各个数字立方和等于该数本身。如果，153是一个“水仙花数”，因为153=（1的3次方+5的三次方+3的三次方）。
猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个，到第十天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少？
输出九九乘法表。
定义一个整形数组，求出数组元素的和、数组元素的最大值和最小值，并输出结果。










### 答案在这里

Java基础语法作业
一、	填空题
1．	Java语言的注释有_单行注释	___、_多行注释_、___文档注释___3种。
2．	Java的标识符的命名规则是_应以字母、下划线、$符开头_、___后跟字母、下划线、$符或数字 _大小写敏感，长度无限制__。
3．	Java的数据类型可以分为____基本数据类型___和__引用数据类型_____两种。
4．	布尔（boolean）类型变量的值是___ True 或是 False ___。
5．	Java中的八种基本数据类型分别是_int_、_short_、_byte_、_long__、__char_、__boolean___、__float	__、_double_。
6．	写出下列表达式的运算结果，设a=2,b=-4,c=true。 
（1）	-a%b++                    
（2）	a>=1 && a <= 10 ? a : b        
（3）	(double)(a+b)/5+a/b     
（1）   -2  （2）  2 （3）  -0.2 。                        
7．	当声明一个数据组int arr[]=new int[5];时，这个数组的最大下标_4__。
 
二、	选择题
1．	下面这些标识符哪个是错误的（ ）  C
A．Javaworld        B．_sum         C．2Java Program       D．$abc
2．	下面哪个赋值语句不会产生编译错误（ ）  D
A．char a=‟abc‟;     B．byte b=152;     C．float c=2.0;         D．double d=2.0;
一个字符				超出127				加个f后缀
3．	设各个变量的定义如下，哪些选项的值为true （ ）  C
int a=3, b=3;    
boolean flag=true;  
A．++a = = b       B．++a= = b++    C．(++a = = b) || flag   D．(++a= =b) & flag
4．	对下面的语句执行完后正确的说法是：（ ）  D
int c='c'/3;  
System.out.println(c);   
A．输出结果为21  B．输出结果为22    C．输出结果为32   D．输出结果为33
5．	下列程序运行的结果是（）。  D
public class A {  
public static void main(String args[]) {    
int x = 7%3;  //1
while(x){    
x--;   
}   
System.out.println(x);  
} 
} 
A．0       B．1        C．true       D．编译错误
6．	System.out.println("5" + 2);的输出结果应该是（）。A
A 52                   B 7                     C 2                     D 5
7．	 0.6332的数据类型是（）   B
A float     B double     C float      D Double
8．	下面的方法，当输入为2的时候返回值是多少?（）D
public static int getValue(int i) {
int result = 0;
switch (i) {
case 1:
result = result + i;
case 2:
result = result + i * 2;    //没有break  ;继续执行
case 3:
result = result + i * 3;
}
return result;
}
A 0                    B 2                    C 4                     D 10
9．	请看下面的程序代码：  
   if (x < 0) {
			System.out.println("first");
		} else if (x < 20) {
			System.out.println("second");
		} else {
			System.out.println("third");
		}
当程序输出“second”时，x的范围是（ ）   B
A．x<=0       B．x<20 && x>=0      C．x>0    D．x>=20 
10．	下列语句执行后，x的值是（）   C
int x=2     
do{
x+=x  
}while(x<17);    
A． 4       B．16         C．32           D．256
11．	执行下列语句后，i、j的值是（ ）   A
int i=1, j=8;   
do{
       if(i++>--j)
         continue;   
}while(i<4);   
A． i=4, j=5       B．i=5,j=4       C．i=5,j=5         D．i=5,j=6
12．	设有定义语句“int a[]={66,88,99};”，则以下对此语句的叙述错误的是（）  C
A．定义了一个名为a的一维数组      B．a数组有3个元素  
C．a数组的元素的下标为1～3        D．数组中的每个元素是整数
13．	以下哪个不是Java的基本数据类型（  ）B
A、int B、Boolean C、float D、char
14．	给出下面代码，关于该程序以下哪个说法是正确的？（ ） C
public class Person{
static int arr[] = new int[5];
public static void main(String a[])
{
System.out.println(arr[0]); 
}
}
A、编译时将产生错误 B、编译时正确，运行时将产生错误
C、输出零 D、输出空
// 1.基本数据类型的数组在创建之后，已经赋默认值 0 （或0L、0.0D、0.0F）； //2.引用类型的数组在创建之后，已经赋默认值null.
15．	以下程序段执行后的K值为（ ）。A
int x=20; y=30;
k=(x>y)?y:x
A、 20 B、 30 C、10 D、50

三、	简答题
1．	short s1 = 1; s1 = s1 + 1;有什么错? short s1 = 1; s1 += 1;有什么错?
1为int 型数据   而s1为short  需要转换类型 s1 = (short) (s1 + 1);   第二个没问题

2．	swtich是否能作用在byte上，是否能作用在long上，是否能作用在String上?
Switch  支持 int  short  byte  char  四种基本数据类型  不支持long类型  ;支持string类型,和enum类型
3．	char型变量中能不能存贮一个中文汉字?为什么? 
可以存储   char型为两个字节，一个汉字两个字节

四、	编程题
1．	编写方法，求出这3个数字中的最大值，并将最大值输出。
System.out.println((a>b?(a>c?a:c):(b>c?b:c)));
2．	编写程序，分别利用while循环、do...while循环和for循环求出100~200的累加和。

3．	求1~1000之间可以同时被3、5、7整除的数字。

4．	打印出所有的“水仙花数”，所谓“水仙花数”是指一个3位数，其各个数字立方和等于该数本身。如果，153是一个“水仙花数”，因为153=（1的3次方+5的三次方+3的三次方）。

5．	猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个，到第十天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少？ 
 
6．	输出九九乘法表。


7．	定义一个整形数组，求出数组元素的和、数组元素的最大值和最小值，并输出结果。


