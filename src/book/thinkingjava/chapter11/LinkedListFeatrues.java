package book.thinkingjava.chapter11;

import java.util.LinkedList;


import static net.mindview.util.Print.*;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatrues {
	

	public static void main(String[] args) {
		LinkedList<Pet> pets = 
				new LinkedList<>(Pets.arrayList(5));
		print(pets);
		print("pets.getFirst() " +pets.getFirst());
		print("pets.element " + pets.element());
		print("pets.peek()"+pets.peek());
		print("pets.remove()" +pets.remove());
		print("pets.removeFirst()"+pets.removeFirst());
		print("pets.poll()" +pets.poll());
		print(pets);
		pets.addFirst(new Rat());
		print("addFirst" +pets);
		pets.offer(Pets.randomPet());
		print("After offer()" +pets );
		pets.add(Pets.randomPet());
		print("afeter add"+  pets);
		pets.addLast(Pets.randomPet());
		print("after addlast" + pets);
		
		print("pets.removeLast()" + pets.removeLast());
		
	}

}
