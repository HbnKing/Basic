## 循环语句

### 1.1. 循环控制语句

循环语句可以在满足循环条件的情况下，反复执行一点代码，这段被重复执行的代码被称为循环体。当反复执行这个循环体的时候，需要在合适的时候把循环条件改为假，从而结束循环。否则循环将一直执行下去，形成死循环。
 
### 1.1.1. while循环

while循环的格式是：while(条件表达式){执行循环体语句;}
当条件表达式的返回值为true时，就会执行{}里，循环体的内容。当{}里的内容执行结束之后，会重新进行条件表达式返回值的判断，直到表达式的返回false时，退出循环。
如，我们通过while对1-10之间的数进行求和：
```
int a = 1;
int sum = 0;//定义一个变量用于保存结果
while(a <= 10){//当a满足a<=10的条件时，执行循环体语句
sum += a;
a++;
}
```
System.out.println("1到10的和是："+sum);
使用while循环是，一定要保证循环条件有变成false的时候，否则这个循环就是死循环。
### 1.1.2. do-while循环

do...while和while循环相似，do{执行循环体语句;}while(条件表达式);
它们之间的区别是，while先判断条件是否成立，成立再执行循环体，而do...while则是先执行循环体，在判断条件是否成立。所以do...while循环不论条件是否成立，循环体至少要被执行一次。do...while循环的结尾还多了一个分号。
如：
```
do{
sum += a;
a++;
}while(a <= 10);
System.out.println("1到10的和是："+sum);
```
两段代码的执行效果都是一样的，但是执行顺序不一样。
 
### 1.1.3. for循环

常用的for循环的格式是：  
for(初始化表达式;循环条件表达式;循环后的操作表达式)
{
执行语句;(循环体)
}
for里面的几个表达式运行的顺序，先执行初始化表达式，判断循环条件，如果循环条件为true，就执行循环体，然后在执行循环后的操作表达式，接着继续判断循环条件，重复这个过程，直到条件不满足为止。
现在，使用for循环实现这个功能;计算2~100之间所有偶数的和。
```
int sum = 0;
for(int i = 2 ; i <= 100 ; i+=2){
sum += i;
}
System.out.println("2-100之间的偶数的和是："+sum);
```
for循环圆括号中只有两个分号是必须的，初始化语句、循环条件、迭代语句都是可以省略的，如果省略了循环条件，则这个循环条件默认是true，将会产生死循环。
最简单无限循环格式：while(true) , for(;;),无限循环存在的原因是并不知道循环多少次，而是根据某些条件，来控制循环。



###  一些案例 

//do{} while();以后建议不要使用 public class TestDemo{
public static void main(String args[]){ int current=101; int sum=0;
do{
sum+=current; current++;
}
while(current<=100); System.out.println(sum); }
}
//for(循环初始化条件;循环判断;循环条件变更) //如果不知道循环次数，但是知道循环结束条件的时候用while //如果知道循环的次数，使用for循环。
//循环可以嵌套循环
public class TestDemo{
public static void main(String args[]){

 int max=9;
for(int x=1;x<10;x++){
System.out.print("开始抽第"+x+"根烟:");
for(int y=1;y<=20;y++){
System.out.print("嘬、");
}System.out.println();
} System.out.println("离完蛋不远了，还差一根烟，嘬完就没得嘬了!"); }
}
//单行注释符号是//而不是\\ 下列程序是乘法口诀表 public class TestDemo{
public static void main(String args[]){ for(int x=1;x<10;x++){
for(int y=1;y<=x;y++){ System.out.print(x+"*"+y+"="+(x*y)+"\t");//制表符是\t不是/t
}System.out.println(); }
} }
//循环语句控制continue和break,需和判断语句配合使用 public class TestDemo{
public static void main(String args[]){
for(int x=0;x<=10;x++){
if(x==3){break;} System.out.println("x="+x);} }
}