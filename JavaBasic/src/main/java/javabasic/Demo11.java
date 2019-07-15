package javabasic;

/**
 * 元素位置的互换
 * @author 徐葳
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		
		//第一种实现方式   使用第三方变量
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x="+x+",y="+y);
		
	}

}
