package book.thinkingjava.chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 举例说明  Set 中 没有重复元素
 * 
 * @author HENC
 *
 */
public class SetOfInteger {

	public static void main(String[] args) {
		Random random  = new  Random();
		Set<Integer> intset = new HashSet<Integer>();
		SortedSet<Integer> intset2 = new TreeSet<Integer>();
		for(int i=0 ; i<100 ;i++) {
			intset.add(random.nextInt(25));
			intset2.add(random.nextInt(25));
		}
		System.out.println(intset);
		System.out.println(intset2);
	}

}
