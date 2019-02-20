package book.thinkingjava.chapter15;

import java.util.ArrayList;


/**
 * 
 * 擦除的神秘之处
 * 看起来 ArrayList<String> he  ArrayList<Integer> 是明显得不同类
 * 但是程序会认为他们是相同的类型
 * @author Wangheng
 *
 */
public class ErasedTypeEquivalence {

	public static void main(String [] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 ==c2);
		//true
	}

}
