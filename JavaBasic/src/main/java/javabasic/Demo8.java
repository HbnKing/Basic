package javabasic;

/**
 * 除法运算
 * @author 徐葳
 *
 */
public class Demo8 {
	public static void main(String[] args) {
		/*
		 * 注意：这时因为x/100之后是1.2 但是呢，x是int类型的
		 * 两个int类型的数据除完以后肯定还是int
		 * 所以就把小数位舍弃了，变成1，这个时候1*100 结果就是100了
		 * 
		 * 如果想解决这个我问题，需要把x的类型改为double
		 */
		int x = 120;
		x = x / 100 * 100;
		System.out.println(x);//100
		
		System.out.println(5%5);//0
		System.out.println(3%2);//1
	}

}
