package book.thinkingjava.chapter15;

import net.mindview.util.Generator;

/**
 * 求出 前两个数的和
 * 一个递归
 * @author Wangheng
 *
 */
public class Fibonacci implements Generator<Integer>{

	private int count  = 0;
	public Integer next() {
		return fib(count++);
	}
	private Integer fib(int n) {
		if(n <2) return 1;
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for(int i = 0 ;i<18 ;i++)
			System.out.println(gen.next()+ "");
	}

}
