package book.thinkingjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * 11.3  添加一组元素
 * java.lang.UnsupportedOperationException
 * @author HENC
 * Arrays.asList（）  可以当做 list
 * 但是其底层还是数组  ，因此不能调整尺寸  如果尝试使用 ，add() 或者 。delete() 方法 
 * 就会引发去改变数组尺寸的尝试  产生 UnsupportedOperation
 *
 */

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer [] moreInts = {6,7,8,9,0};
		collection.addAll(Arrays.asList(moreInts));
		
		//------------
		Collections.addAll(collection,11,12,13,14);
		Collections.addAll(collection,moreInts);
		
		List<Integer> list = Arrays.asList(17,18,19,29);
		// ！ArrayList<Integer> list2 = Arrays.asList(17,18,19,20);
		list.set(1, 99);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list.get(list.size()-1));
		//!list.add(150);  java.lang.UnsupportedOperationException
		System.out.println(list.get(list.size()-1));
	}

}
