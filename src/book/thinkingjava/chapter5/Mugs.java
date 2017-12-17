package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 非静态类的初始化  
 * 内部对象先初始化  
 * 在执行本类构造方法 
 * @author HENC
 *
 */
public class Mugs {
	Mug mug1 ;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2  initialied");
	}
	Mugs(){
		print("Mugs()");
	}
	Mugs(int i){
		print("Mugs(int i)");
		
	}
	
	public static void main(String [] args) {
		print("Inside main()");
		new Mugs();
		print("new Mugs() completed");
		new Mugs(1);
		print("new Mugs(1) completed");
	}

}
class Mug{
	Mug(int marker){
		print("Mug (" +marker +") ;");
	}
	void f(int marker) {
		print("f (" + marker + ") ;");
		
	}
}