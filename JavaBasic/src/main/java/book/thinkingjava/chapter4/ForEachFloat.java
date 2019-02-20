package book.thinkingjava.chapter4;

import java.util.Random;
import  static net.mindview.util.Range.*;

/**
 * for( float x: y)
 * for each 练习 
 * 适用于任何 Iterable 的对象
 * for each 需要先有一定量的数据
 * @author HENC
 *
 */
public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		float f[] = new float[10];
		for(int i = 0; i<10 ; i++) {
			f[i] = rand.nextFloat();
		}
		for(float x :f ) {
			System.out.println(x);
		}
		
		//--------------
		for(char c :"we are American".toCharArray())
		System.out.print(c);
		
		for( int x :range(10))
			System.out.println(x);
		
		for(int x :range(5,10))
			System.out.println(x);
		
		for(int x : range(5,20,3))
			System.out.println(x);
		
	}
}
