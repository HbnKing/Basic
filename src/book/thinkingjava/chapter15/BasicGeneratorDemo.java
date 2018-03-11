package book.thinkingjava.chapter15;

import net.mindview.util.Generator;

public class BasicGeneratorDemo {

	public static void main() {
		Generator<CountedObject> gen = 
				BasicGenerator.create(CountedObject.class)	;
		for(int i = 0; i< 5 ; i++)
			System.out.println(gen.next());
	}
}
