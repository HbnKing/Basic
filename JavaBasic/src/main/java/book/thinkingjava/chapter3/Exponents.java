package book.thinkingjava.chapter3;

/**
 * 指数计数法
 * @author HENC
 *
 */

public class Exponents {
	public static void main(String[] args) {
		//大小写的 'e' 结果是一样的   e代表的是10的幂次
		//e 字母为 exponential  即指数或者幂数
		float expFloat = 1.29e-43f;
		 expFloat = 1.29e-43f;
		 System.out.println(expFloat);
		 double expDouble = 47e47d; //'d' 是可选项
		 double expDouble2 = 47e47; //自动转为double
		 System.out.println(expDouble);
		 System.out.println(expDouble2);
		
		 /*1.29E-43
		  * 1.29 x 10 的 -43次幂
		  * 4.7E48
		* 4.7 x 10 的48次幂
		*/
		 
		 
	//联系题  指数计数法表示的最大最小的float  和double 类型
		 
		//先看看系统默认最大最小值
		 System.out.println(Float.MAX_VALUE);
		 System.out.println(Float.MIN_VALUE);
		 System.out.println(Double.MAX_VALUE);
		 System.out.println(Double.MIN_VALUE);
		 //------------------
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.pow(2, 31)-1);
		//整数的最大值为  2的  32-1 次幂 减1
		
		System.out.println(-Math.pow(2, 31));
		 
	}

}
