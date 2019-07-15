package javabasic;

/**
 * 赋值运算符
 * @author 徐葳
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int a = 2;
		a += 3;// a = a+3;
		System.out.println(a);
		
		short s = 3;
		//s = s + 2;//编译是失败的，因为s会被提升为int类型，运算之后的结果还是int类型，所以赋值给short类型，会有安全隐患
		
		s += 2;//编译是通过的，因为+=运算符在赋值时，自动完成了转换操作。
	}

}
