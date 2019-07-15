package javabasic;

/**
 * 元素位置的互换  不使用第三方变量
 * @author 徐葳
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		
		/*
		 * 第一种方式
		 * 注意：这一种方式有一个安全隐患，如果x和y的都比较大，那么相加后的结果可能会超过int的取值范围
		 */
		x = x + y;//x=9;
		y = x - y;//y=3;
		x = x - y;//x=6;
		
		System.out.println("x="+x+",y="+y);
		
		/*
		 * 第二种方式 使用^ 位运算符
		 * 这种方式内存使用了位运算，效果是最高，而且还能避免超出int取值范围的问题
		 * 但是可读性很差，这种形式只有在面试的时候会写，一般工作中其实都会借助于第三方变量实现
		 */
		x = 3;
		y = 6;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("x="+x+",y="+y);
		
		
	}

}
