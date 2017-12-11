package book.thinkingjava.chapter4;

/**
 * 迭代 while do-while for 
 * @author HENC
 *
 *do while 格式如下
 *do 
 * statement 
 * while (boolean-expression)
 * 
 *区别   do while 至少 执行一次
 *while  比do -while 更为常用一些
 */

public class WhileTest {
	static boolean  condition() {
		boolean result = Math.random()<0.99;
		System.out.println(result);
		return result;
	} 
	public static void main(String [] args) {
		while (condition())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
		
	}

}
