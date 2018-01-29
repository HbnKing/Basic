package book.thinkingjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 11.13.1 适配器的的习惯用法
 * collections.shuffled () 方法 并没有改变原有的 迭代顺序  
 * @author Administrator
 *
 */
public class MultiIterableClass extends IterableClass{

	public Iterable <String> resvered() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {

					//从后往前取值
					int current  = words.length - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[current -- ];
					}
					
				};
			}
			
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String> () {

			@Override
			public Iterator<String> iterator() {
				List<String> shuffled  = new ArrayList<String>(
						Arrays.asList(words));
				Collections.shuffle(shuffled , new Random(47));
				return shuffled.iterator();
			}
			
		};
	}
	
	
	
	public static void main(String[] args) {

		MultiIterableClass mic  = new MultiIterableClass();
		for(String s : mic.resvered())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic )
			System.out.print(s +  " ");
		System.out.println();
			
		
	}

}
