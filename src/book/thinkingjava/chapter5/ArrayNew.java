package book.thinkingjava.chapter5;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a ;
		Random rand = new Random();
		a = new int[rand.nextInt(20)] ;
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	}

}
