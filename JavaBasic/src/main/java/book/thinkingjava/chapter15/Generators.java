package book.thinkingjava.chapter15;

import java.book.thinkingjava.chapter15.Coffee;
import java.book.thinkingjava.chapter15.CoffeeGenerator;
import java.book.thinkingjava.chapter15.Fibonacci;
import java.util.ArrayList;
import java.util.Collection;

import net.mindview.util.Generator;

public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen ,int n){
		for(int i = 0;i< n; i++)
			coll.add(gen.next());
		
		return coll;
	}
	public static void main(String [] args) {
		Collection<java.book.thinkingjava.chapter15.Coffee> coffee = fill(
				new ArrayList<java.book.thinkingjava.chapter15.Coffee>(),new CoffeeGenerator(),4);
		for(Coffee c : coffee)
			System.out.println(c);
		Collection<Integer> fnumbers = fill(
				new ArrayList<Integer>(),new Fibonacci(),12);
		for(int i : fnumbers)
			System.out.println(i + "," );
	}

}
