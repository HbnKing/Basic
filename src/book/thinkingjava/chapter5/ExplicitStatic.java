package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
静态方法为什么不能调用非静态类
不可以，静态变量属于类变量，随着类的加载而加载，当调用类变量时java虚拟机会对类的静态变量，静态方法进行初始化，此时如果静态方法中有非静态变量，由于非静态变量是随着实例的创建而创建，此时还没有实例创建，所以非静态变量还没有创建，所以会出现编译错误
 * 
 * static 静态代码块
 * @author HENC
 *
 */
public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		print("Inside main()");
		Cups.cup1.f(99);
		//cup1 在cups 为静态属性  可以直接调用
		/*Cups a = new  Cups();
		a.cup2.f(222);*/
	}

}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		print("Cups()");
	}
}

class Cup{
	Cup(int marker){
		print("Cup( "+marker+") ;");
	}
	void f(int marker) {
		print("f(" +marker +") ;");
	}
	
}