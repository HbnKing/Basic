package book.thinkingjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 三元运算符  if else
 * @author HENC
 *
 */

public class TernaryIfElse {
	static int ternary(int i) {
		return i<10?i*100:i*10;
	}
	
	static int standardIfElse(int i) {
		if(i<10)
			return i*100;
		else
			return i*10;
		
	}
	public static void main(String [] args) {
		print(ternary(9));
		print(ternary(10));
		print(standardIfElse(9));
		print(standardIfElse(10));
		int a = 1;
		int b = 2;
		print(a + b);
	}
}
