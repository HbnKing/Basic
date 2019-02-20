package book.thinkingjava.chapter3;

import static net.mindview.util.Print.*;
/**
 * java  短路的现象
 * @author HENC
 *
 */
public class ShortCircuit {
	static boolean test1(int val) {
		print("test1 ("+val +")");
		print("result:"+(val<1));
		return val <1;
	}
	
	static boolean test2(int val){
		print("test2("+val+")");
		print("result:"+(val<2));
		return val <2;
	}
	static boolean test3(int val){
		print("test2("+val+")");
		print("result:"+(val<3));
		return val <3;
	}
	
	public  static void main(String args []) {
		boolean b = test1(0)&&test2(2)&&test3(3);
		print("expression is " +b);
	}
	/*
	 * 查看发现 只能打印出test1 test2  test2为false 的时候 test3已经不再执行
	 test1 (0)
	result:true
	test2(2)
	result:false
	expression is false
	 */

}
