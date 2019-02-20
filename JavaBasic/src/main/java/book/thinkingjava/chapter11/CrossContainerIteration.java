package book.thinkingjava.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * 创建一个display() 方法   不必 知晓容器的确切类型
 * 实现一个迭代器的接口  即可
 * @author HENC
 *
 */
public class CrossContainerIteration {

	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() +": "+p + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<>(pets);
		TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
		
		display(pets.iterator());
		System.out.println("1");
		display(petsLL.iterator());
		System.out.println("2");
		display(petsHS.iterator());
		System.out.println("3");
		display(petsTS.iterator());
	}

}
