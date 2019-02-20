package book.thinkingjava.chapter10;
import static  net.mindview.util.Print.*;

public class AnonymousConstructor {

	public static Base getBase(int i) {
		i =34;
		// 刚才说 匿名内部类引用外部参数   需要用final 修饰  
		//  这里又可以修改了  ?????
		// 其实不是的    这个 i 的值 被传递给  Base 类的基类构造器  
		//他并不会 在匿名内部类  的内部被使用   
		return new Base(i) {
			{print("Inside instance initializer");}
			@Override
			public void f() {
				print("In anonymous f()");
			}};

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base = getBase(47);
		base.f();
	}

}
abstract class Base{
	public Base(int i) {
		print("Base Constructor .i =" +i);
	}
	public abstract void f();
}
