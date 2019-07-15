package javabasic;

/**
 * 三元运算符
 * @author 徐葳
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		// 三元运算符
		// (条件表达式)?表达式1：表达式2；
		int a = 1;
		int b;
		/*
		 * b的取值要根据一个条件
		 * 如果这个条件为true，则返回10，如果条件为false，则返回20；
		 */
		b = (a>1)?10:20;
		
		System.out.println(b);
		
		// 三元运算符的特点：它是一个运算符，所以运算完肯定要有一个结果
		
	}

}
