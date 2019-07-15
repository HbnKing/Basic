package javabasic;

/**
 * 逻辑运算符
 * @author 徐葳
 *
 */
public class Demo14 {
	
	public static void main(String[] args) {
		// false & true = false;
		System.out.println((3<2) & (4>3));
		// true  | false = true;
		System.out.println((4>3) | (3<2));
		// !true = false;
		System.out.println(!(4>3));
		// &&
		System.out.println((3<2) & (4>3));
		System.out.println((3<2) && (4>3));
		
		// ||
		System.out.println((4>3) | (3<2));
		System.out.println((4>3) || (3<2));
	}

}
