package book.thinkingjava.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 可变参数 与范型方法
 * @author Wangheng
 *
 */
public class GenericVarargs {

	public static <T> List<T> makeList(T... args){
		List<T> result = new  ArrayList<T>();
		for(T item : args)
			result.add(item);
		return result;
	}
	
	public static void main (String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls) ; 
		ls = makeList("A","B" ,"C");
		System.out.println(ls) ; 
		ls = makeList("ABCDEFGHIJKLMN".split(""));
		System.out.println(ls) ; 
	}
}
