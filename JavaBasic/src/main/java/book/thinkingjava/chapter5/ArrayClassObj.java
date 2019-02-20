package book.thinkingjava.chapter5;

import java.util.Random;

public class ArrayClassObj {

	public static void main(String [] args) {
		Random rand = new Random();
		Integer [] a = new Integer[rand.nextInt(500)];
		System.out.println(a.length);
		for( Integer in :a)
		System.out.println(in);
		
		//非基本类型 并没有进行初始化  他们的指向为null 
		
	}
}
