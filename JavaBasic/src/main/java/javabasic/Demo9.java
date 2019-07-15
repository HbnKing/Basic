package javabasic;

/**
 * 算术运算
 * @author 徐葳
 *
 */
public class Demo9 {
	
	public static void main(String[] args) {
		int a = 5;
		int b;
		//b = a++;//++号在后面的时候会先把a的值赋给b，然后对a的值进行加1操作
		b = ++a;//++号在前面的时候，会先对a的值进行加1操作，然后再把这个值赋给b
		
		
		System.out.println("a="+a+",b="+b);
		
		
		//a++;  其实和 a = a+1; 是相同的效果。
	}

}
