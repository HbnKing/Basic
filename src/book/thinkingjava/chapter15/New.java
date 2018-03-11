package book.thinkingjava.chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 杠杆利用类型参数推断 
 * 
 * @author Wangheng
 *
 */

//例如 
//public static <K,V> Map<K ,V > map ()
public class New {

	public static <K,V> Map<K ,V > map (){
		return new HashMap<K ,V >();
	}
	public static <T> List<T> list(){
		return new ArrayList<T> ();
	}
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	public static void main(String[] args) {
		

	}

}
