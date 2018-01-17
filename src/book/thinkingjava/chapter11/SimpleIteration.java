package book.thinkingjava.chapter11;

import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * Iterator 迭代器 
 * hasNext()  和  next();
 * 
 * Iterator 只能单向移动 但是    ListIterator 可以双向移动
 * @author HENC
 *
 */
public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator(); 
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.println(p.id() +": "+p + " ");
		}
		System.out.println();
		//---------------
		for(Pet p :pets)
			System.out.println(p.id() +": "+p + " ");
		System.out.println();
		it = pets.iterator();
		for( int i = 0 ;i< 6; i++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}
