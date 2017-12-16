package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
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