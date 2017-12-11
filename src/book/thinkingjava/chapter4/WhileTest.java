package book.thinkingjava.chapter4;

/**
 * 迭代 while do-while for 
 * @author HENC
 *
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
