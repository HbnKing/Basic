package book.thinkingjava.chapter13;

import java.util.ArrayList;
import java.util.List;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

/**
 * 13.3 无意识的递归
 * @author Wangheng
 *
 */
public class ArrayListDisplay {

	public static void main(String[] args) {

		ArrayList<Coffee>  coffees = new ArrayList<Coffee>();
		for(Coffee C: new CoffeeGenerator(10)) {
			coffees.add(C);
		}
		
		/**
		 * 所有的类都来自Object类 
		 * 调用 ArrayList.toString() 方法时  
		 * 会遍历其上的所有元素,调用各个元素的toString() 方法
		 */
		System.out.println(coffees);
		
		//集合可以添加元素，这个元素可能是它本身，如果依然按照去所有元素的方式，那么这就是一个死循环了

		List list = new ArrayList<>();
		list.add("one");
		list.add(list);
		System.out.println(list);
		
		/**
		 * 来看看源码是怎么写的
		 */
		
		
		/**
		  public String toString() {
		        Iterator<E> it = iterator();
		        if (! it.hasNext())
		            return "[]";

		        StringBuilder sb = new StringBuilder();
		        sb.append('[');
		        for (;;) {
		            E e = it.next();
		            sb.append(e == this ? "(this Collection)" : e);
		            if (! it.hasNext())
		                return sb.append(']').toString();
		            sb.append(',').append(' ');
		        }
		    }
		*/
	
	}

}
