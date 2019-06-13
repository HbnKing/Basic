## 什么是面向对象

//面向对象就是一种组件化的设计思想
```
class Book{
String title;
double price;
public void getinfo(){ 
System.out.println("图书名称:"+title+",图书价格:"+price);} }
public class TestDemo{
public static void main(String args[]){ 
Book bk=new Book(); 
//bk.title="Java开发";
//bk.price=89.9;
bk.getinfo();
}
}
```