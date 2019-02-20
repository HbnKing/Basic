package book.thinkingjava.chapter4;

import static net.mindview.util.Print.*;

/**
 * 流程控制语句if else  4.2章
 * @author HENC
 *
 */
public class IfElse {
	static int  result = 0;
	static void test(int value, int target) {
		if (value > target)
			result = +1;
		else if(value <target)
			result = -1;
		else
			result = 0;
	}
	public static void main(String [] args) {
		test(10,5);
		print(result);
		test(5 ,10);
		print(result);
		test(5,5);
		print(result);
	}

}
