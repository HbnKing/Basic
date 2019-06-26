## 对象比较

```
class Book{
private String title;
private double price;
public Book(String title,double price){
this.title=title;
this.price=price; }
public boolean compare(Book book){//本类接收本类对象，对象可以直接访问属性。1带回了需要信息，2方便访问。 if(this==book)//内存地址相同
return true; }
if(this.title.equals(book.title)&&this.price==book.price){//但钱对象this(调用方法对象，就是b1引用)，传递的对象book(引用传递，就是b2引用) return true;
}else{
return false;
} }
public String getTitle(){ return this.title;
}
public double getPrice(){
return this.price; }
}
public class TestDemo{
public static void main(String args[]){ Book b1=new Book("Java开发",79.8); Book b2=new Book("Java开发",79.8); if(b1.compare(b2)){
System.out.println("是同一个对象"); }else{
System.out.println("不是同一个对象"); }
} }
```