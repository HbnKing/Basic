
上上周学习Java第一个程序Hello World!，今天给电脑换了固态硬盘，重做完系统后，凭记忆登录www.oracle.com，下载了JAVA SE 最新版，安装完成后，查询教程配置了PATH，然后用 记事本默了那个程序，直接编译通过，竟然没有出错，开心!
public class Hello{ //文件名和类名要一致
public static void main(String args[]) { System.out.println("Hello World!");
} }
public class TestDemo{
public static void main(String args[]){ int x=9;
int y=5; System.out.println(x/(double)y);
}
}
public class TestDemo{
public static void main(String args[]) {char c='a';
int num=c; System.out.println(num);}
}
public class TestDemo{
public static void main(String args[]){ char c='A';
int num=c;
num=num+32;
c=(char)num;
System.out.println(c);
}
}
public class TestDemo{
public static void main(String args[]){ boolean flag=false;
if(!flag){
System.out.println(flag);}
}
}
public class TestDemo{
public static void main(String args[]){ String str="Hello";
str=str+"World";
str+="!!!";
System.out.println(str);
}
}
public class TestDemo{
public static void main(String args[]){
int numA=100;
double numB=99.0;
String str="加法运算"+numA+numB;
String str1="Hello\"World\Hello MLJS"
String str1="Hello \"World\" \n\t Hello MLJS"; System.out.println(str); System.out.println(str1);
}
}
 
 public class TestDemo{
public static void main (String args[]){ int numA=10;
int numB=20;
int max=numA>numB?numA:numB; System.out.println(max);
}
}
public class TestDemo{
public static void main(String args[]){ int numA=9;
int numB=11;
int result=numA<<3; System.out.println(numA&numB); System.out.println(numA|numB); System.out.println(result);
}
}
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
//面向对象就是一种组件化的设计思想
class Book{
String title;
double price;
public void getinfo(){ System.out.println("图书名称:"+title+",图书价格:"+price);} }
public class TestDemo{
public static void main(String args[]){ Book bk=new Book(); //bk.title="Java开发";
//bk.price=89.9;
bk.getinfo();
}
}
第7章 课时25:深入分析类与对象(构造方法与匿名对象)
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
//总结:1、构造方法的定义要求:方法名称与类名称相同，且无返回值声明。 //2、构造方法是在类对象使用关键字new实例化对象时候被默认调用的，不管你代码如何改变，只要是有了关键字new，就一定需要构造方法; //3、一个类中至少保留一个构造方法，如果没有明确定义构造方法，那么会自动生成一个无参的什么都不做的构造方法。 //4、构造方法的核心功能是在类对象实例化的时候为类中的属性初始化;
//5、构造方法重载时只考虑参数的类型和个数即可。
第7章 课时26:深入分析类与对象(综合实战:简单Java类)
//类名称必须存在有意义; //类中所有属性必须用private封装，封装后的属性必须提供有setter，getter; //类之中可以提供有任意多个构造方法，但必须保留有一个无参构造方法; //类之中不允许出现任何的输出语句，所有信息输出必须交给被调用的处输出， //类之中需要提供有一个取得对象完整信息的方法，暂定为:getInfo()，返回String数据; //第一个代码模型，老师说整个Java有10来个，能掌握核心命脉。
class Emp{//定义一个有意义的类
private int empno;
private String ename;
private String job;
private double sal;
private double comm;
public Emp(){}//必须有一个无参构造方法
public Emp(int eno,String ena,String j,double s,double c){//构造方法重载
    
empno=eno; ename=ena; job=j;
sal=s; comm=c;
}
public void setEmpno(int e){
empno=e;
}
public void setEname(String e){
ename=e;
}
public void setJob(String j){
job=j;
}
public void setSal(double s){
sal=s;
}
public void setComm(double c){
comm=c;
}
public int getEmpno(){
return empno;
}
public String getEname(){
return ename;
}
public String getJob(){
return job;
}
public double getSal(){
return sal;
}
public double getComm(){
return comm;
}
public String getInfo(){//需要一个取得对象完整信息的方法 return"雇员编号"+empno+"\n"+
"雇员姓名"+ename+"\n"+ "雇员职位"+job+"\n"+ "基本工资"+sal+"\n"+
"佣 金"+comm;
} }
public class TestDemo{
public static void main(String args[]){
//编写测试程序
Emp e=new Emp(7369,"SMITH","CLERK",800.00,1.0); e.setEname("ALLEN"); System.out.println(e.getInfo());//输出雇员所有信息 System.out.println("姓名"+e.getEname());//只取得姓名，用getter方法。 }
}
//所有类之中提供的setter、getter方法可能某些操作不会使用到，但是依然必须提供， //所有的setter方法除了具备有设置属性的内容之外，也具备有修改属性内容的功能。 //简单Java类为日后进行整个项目开发的千分之一的组成部分，也是最为重要的组成部分，所以必须做到信手拈来。
第8章 课时27:数组的定义与使用(基本概念)

第8章 课时28:数组的定义与使用(二维数组)
public class Array{
public static void main(String args[]){ int data[][]=new int[][]{
{1,2,3},
{4,5,6},
{7,8,9}
};
//外层循环是控制数组的行内容
for(int x=0;x<data.length;x++){
for(int y=0;y<data[x].length;y++){ System.out.print(data[x][y]+"\t"); }
System.out.println(); }
}
}
第8章 课时29:数组的定义与使用(数组与方法的引用操作)
//排序，当你困了又睡不着的时候，就赶快滚起来学习，一般来说会更困，所以坚持到特别困就去睡觉，保证你睡的又快又好。如果不困，那么问题解决了。好好学习吧。 public class Array{
public static void main(String args[]){ int data[]=new int[]{2,1,0,9,5,13,7,6,8}; print (data);
sort(data);
print (data); }
public static void sort(int arr[]){ for(int x=0;x<arr.length;x++){
for(int y=0;y<arr.length-1;y++){ if(arr[y]>arr[y+1]){
int t=arr[y];
arr[y]=arr[y+1];
arr[y+1]=t;
} }
} }
public static void print(int temp[]){ for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+",");
}
System.out.println(); }
}
————————————————————— public class Array{
public static void main(String args[]){ int data[]=new int[]{1,2,3,4,5,6,7,8,9}; print (data);
reverse(data);
print(data); }
public static void reverse(int arr[]){ int len=arr.length/2;//转置的次数 int head=0;//头部索引
int tail=arr.length-1;//尾部索引 for(int x=0;x<len;x++){
int temp=arr[head]; arr[head]=arr[tail]; arr[tail]=temp; head++;
tail--;
} }
public static void print(int temp[]){ for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+",");
}
System.out.println(); }
}
————————————————————— public class Array{
   
 public static void main(String args[]){
int data[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}}; print(data);
reverse(data);
print(data);
}
public static void reverse(int arr[][]){
for(int x=0;x<arr.length;x++){ for(int y=0;y<arr[x].length;y++){
if(x!=y){
int temp=arr[x][y]; arr[x][y]=arr[y][x]; arr[y][x]=temp;
} }
} }
public static void print(int temp[][]){ for(int x=0;x<temp.length;x++){
for(int y=0;y<temp[x].length;y++){ System.out.print(temp[x][y]+"、");
} System.out.println(); }
} }
—————————————————————
第8章 课时30:数组的定义与使用(数组相关操作方法)
\\数组拷贝
public class Array{
public static void main(String args[]){
int dataA[]=new int[]{1,2,3,4,5,6,7,8};
int dataB[]=new int[]{11,22,33,44,55,66,77,88};
System.arraycopy(dataA,4,dataB,2,3); print(dataB);
}
public static void print(int temp[]){
for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+"、"); }
System.out.println();
} }
————————————————————— \\Java排序
public class Array{
public static void main(String args[]){ int data[]=new int[]{6,3,9,23,2,45}; java.util.Arrays.sort(data); print(data);
}
public static void print(int temp[]){
for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+"、");
}
System.out.println(); }
}
第8章 课时31:数组的定义与使用(对象数组)
数组是引用类型，而类也同样是引用类型，所以如果是对象数组的话表示一个引用类型里面嵌套了其他的引用类型。在之前使用的数组都属于基本数据类型的数组，但是所有的引用数据类型 也同样可以定义数组。这样的数组叫对象数组。
如果要想定义对象数组(以类为例)，可以采用如下的形式完成:
动态初始化:
1、声明并开辟对象数组:类名称 对象数组名称[]=new 类名称[长度] 2、分步完成:
|-声明对象数组:类名称 对象数组名称[]=null;
|-开辟对象数组:对象数组名称=new 类名称[长度]; 举例:Book books []=new Book[3];