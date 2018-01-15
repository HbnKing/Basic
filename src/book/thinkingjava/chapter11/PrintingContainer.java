package book.thinkingjava.chapter11;

import static net.mindview.util.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 * 11.4容器的打印
 * @author HENC
 *
 */
public class PrintingContainer {

	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		
		
		
		return collection;
	}
	
	static Map fill(Map<String,String> map) {
		map.put("rat", "fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "bosco");
		map.put("dog", "Spot");
		//一组相同的key
		
		return map;
	}
	public static void main(String[] args) {

		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		//LinkedeList和ArrayList都实现了List接口，但是它们的工作原理却不一样
		//ArrayList是可改变大小的数组，而LinkedList是双向链接串列(doubly LinkedList)
		
		print(fill(new HashSet<String>()));
		//HashSet的迭代器在输出时“不保证有序”，但也不是“保证无序”
		//hash 算法 最快  获取元素  而不关心它的顺序
		print(fill(new TreeSet<String>()));
		//以二叉树 排序
		print(fill(new LinkedHashSet<String>()));
		//有序
		//set 实现类没有 重复元素 
		print(fill(new HashMap<String,String>()));
		print(fill(new TreeMap<String,String>()));
		print(fill(new LinkedHashMap<String,String>()));
		//map <k -v> 键值对
	}

}
