package book.thinkingjava.chapter11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * 比较  collection 接口 和iterator
 * 
 * 建议直接使用collection 因为它本身就是Iterable<> 的子接口
 * 
 * @author HENC
 *
 */
public class InterfaceVsIterator {
	public static void display( Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() +" " +p + " ");
		}
		System.out.println();
	}
	
	public static void display(Collection<Pet> pets) {
		for(Pet p: pets) {
			System.out.print(p.id() +" " +p + " ");
		}
		System.out.println();
	}
	public static void main(String [] args) {
		List<Pet>  petList  = Pets.arrayList(8);
		Set<Pet> petSet = new HashSet<Pet>(petList);
		Map <String,Pet> petMap  = new LinkedHashMap<String,Pet>();
		String [] names = ("ralph eric robin lacey berece "
				+ "sam spot luff").split(" ");
		for(int i = 0; i<names.length ;i++) {
			petMap.put(names[i], petList.get(i));
		}
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		System.out.println(petMap.values());
		display(petMap.values());
		display(petMap.values().iterator());
		
		
	}
	
}
