
深入分析类与对象(综合实战:简单Java类)
//类名称必须存在有意义;  
 //类中所有属性必须用private封装，封装后的属性必须提供有setter，getter;
//类之中可以提供有任意多个构造方法，但必须保留有一个无参构造方法;   
//类之中不允许出现任何的输出语句，所有信息输出必须交给被调用的处输出，  
 //类之中需要提供有一个取得对象完整信息的方法，暂定为:getInfo()，返回String数据;   
 //第一个代码模型，老师说整个Java有10来个，能掌握核心命脉。

```
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
```
//所有类之中提供的setter、getter方法可能某些操作不会使用到，但是依然必须提供， //所有的setter方法除了具备有设置属性的内容之外，也具备有修改属性内容的功能。 //简单Java类为日后进行整个项目开发的千分之一的组成部分，也是最为重要的组成部分，所以必须做到信手拈来。
