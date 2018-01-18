package book.thinkingjava.chapter11;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {

	public static void main(String[] args) {

		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next() +","+it.nextIndex()+"," +it.previousIndex() );
		}
		System.out.println();
		
		while(it.hasPrevious())
			System.out.print(it.previous().id() +"");
		System.out.println();
		System.out.println(pets);
		//指向中间的一个元素
		it = pets.listIterator(3);
		while(it.hasNext()) {
			it.next();
			//set() 方法 替换他所访问的最后一个对象
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
		
	}

}
