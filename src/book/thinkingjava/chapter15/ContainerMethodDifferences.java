package book.thinkingjava.chapter15;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author Wangheng
 *
 */
public class ContainerMethodDifferences {
	
	static Set<String> methodSet(Class<?> type){
		Set<String> result  = new TreeSet<>();
		for(Method m : type.getMethods())
			result.add(m.getName());
		return result;
	}
	
	static void interfaces(Class<?> type) {
		System.out.println("interfaces in " + type.getSimpleName()+ ": ");
		List<String> result = new ArrayList<String> ();
		for(Class<?> c: type.getInterfaces())
			result.add(c.getSimpleName());
		System.out.println(result);
	}

	static Set<String> object  = methodSet(Object.class);
	static {object.add("clone");}
	static void difference(Class<?> superset,Class<?> subset) {
		System.out.println(superset.getSimpleName() + " extends "+ 
				subset.getSimpleName() +" , adds");
		Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
		comp.removeAll(object);
		System.out.println(comp);
		interfaces(superset);
	} 
	public static void main(String[] args) {
		System.out.println("Collection ：" + methodSet(Collection.class));
		interfaces(Collection.class);
		difference(Set.class ,Collection.class);
		difference(HashSet.class,Set.class);
		difference(LinkedHashSet.class,HashSet.class);
		difference(TreeSet.class,Set.class);
		difference(List.class,Collection.class);
		difference(ArrayList.class ,List.class);
		difference(LinkedList.class, List.class);
		difference(Queue.class ,Collection.class);
		difference(PriorityQueue.class , Queue.class);
		System.out.println("Map :" + methodSet(Map.class));
		difference(HashMap.class ,Map.class);
		difference(LinkedHashMap.class ,HashMap.class);
		difference(SortedMap.class ,Map.class);
		difference(TreeMap.class ,Map.class);
		
		

	}

}
