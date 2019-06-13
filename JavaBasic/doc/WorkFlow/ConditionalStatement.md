## 条件控制语句
Java提供了两种常见的条件控制语句（也叫分支语句），if语句和switch语句，其中，if语句使用布尔表达式或布尔值作为分支条件类进行分支控制；而switch语句则是通过对多个整形数值进行匹配从而实现分支控制的。
### 1.  if-else语句
if语句使用布尔表达式或布尔值作为分支条件类进行分支控制，它的格式有三种，  
* （1）if(条件表达式){    执行语句;   } ，  
* （2）if(条件表达式){    执行语句1; }else{   执行语句2; }      
* （3）if(条件表达式1) {执行语句1;}else if (条件表达式2){执行语句2;}...else{执行语句n;}  
If的三种格式中，方式if后面的括号中只能是一个逻辑表达式，即这个表达式的结果的返回值只能是true或false。有花括号括起来的多行代码被称为语句块，一个语句块同城被当成一个整体来执行。
代码演示：
```
public static void test(){
           Scanner scanner = new Scanner(System.in);
           int a = scanner.nextInt();
           /*if(a == 100){
                 System.out.println("a等于100");
           }
          
           if(a == 100){
                 System.out.println("");
           }
           System.out.println();*/
          
           /*if(a == 100){
                 System.out.println("a等于100");
           }else{
                 System.out.println("a不等于100");
           }*/
          
           if(a > 30){
                 System.out.println("a的值大于30");
           }else if(a > 10){
                 System.out.println("a的值大于10，小于等于30");
           }else if(a > 0){
                 System.out.println("a的值大于0，小于等于10");
           }else{
                 System.out.println("a的值小于0");
           }
      }
``` 
使用if语句验证登录信息合法性
现在，我们使用if语句来判断登录信息是否合法：
* （1）从通过键盘接收用户输入的登录信息，输入信息有用户名、密码；
* （2）如果用户使用指定的用户名与密码，则允许登录
代码演示：
```
public static void check(){
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入用户名：");
           String username = sc.nextLine();
           System.out.println("请输入密码：");
           String password = sc.nextLine();
          
           if(!username.equals("djt")){
                 System.out.println("用户名是非法的");
           }else if(!password.equals("123456")){
                 System.out.println("输入的密码有误");
           }else{
                 System.out.println("恭喜你，输入登录信息通过验证了");
           }
     }
```
### 2.  switch-case语句
switch语句的格式如下：
switch (表达式) {
     case 取值1:执行语句1;break;
     case 取值2:执行语句2;break;
          ...
     default:执行语句n;
}
当表达式的取值等于取值1的时候，执行语句1，遇到break，跳出switch，如果没有遇到break，就继续往下执行。如果没有符合条件的case，那么就是执行default语句中的代码块。Default分支可以省下。如果存在default分支，那么它必须是switch的最后一个分支。
switch语句特点：
1)        switch语句表达式、取值的类型在jdk1.6只支持四种：byte，short，int ， char。jdk1.7时还支持String类型的。
2)        case 语句中的值的数据类型必须与表达式的数据类型相同，而且只能是常量或者字面常量。
3)        当表达式的值与case分支后的值相等时，则开始执行该分支后的语句。
4)        在case分支中，只要遇到break，程序才会跳出switch，否则，会执行到最后。
5)        default分支如果存在，那么它必须是switch的最后一个分支。
 
代码演示：
```
          int week = 3;
          switch(week){
          case 1 :
                System.out.println("今天是星期一");
                break;
          case 2 :
                System.out.println("今天是星期二");
                break;
          case 3 :
                System.out.println("今天是星期三");
                //break;
          default:
                System.out.println("不知道今天是星期几");
               
     }
```


### 一些案例 

public class TestDemo{
public static void main(String args[]){
} }
public class TestDemo{
public static void main(String args[]){ double score=119.1;
if(score<60.0){
System.out.println("小白的成绩"); }else if(60<=score&&score<=90){
System.out.println("矮油不错"); }else if(90<score&&score<=100){
System.out.println("NB"); }else{
System.out.println("你家的成绩这么怪异"); }
} }
public class TestDemo{
public static void main(String args[]){
int ch=3;
switch(ch){
case 2:{
System.out.println("内容是2");break;
}case 3:{
System.out.println("内容是3");break;
}case 1:{
System.out.println("内容是1");break;
}default:{
System.out.println("没有匹配内容!");break;
}
}
} }//switch不能判断布尔判断式，只能判断内容。jdk1.7开始支持String判断了，识别大小写。
public class TestDemo{
public static void main(String args[]){ int current=1; int sum=0; while(current<=100){
sum+=current;
current++;
}
System.out.println(sum);
}
}