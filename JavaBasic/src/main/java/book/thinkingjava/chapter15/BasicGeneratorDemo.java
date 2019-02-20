package book.thinkingjava.chapter15;

import net.mindview.util.Generator;

import java.book.thinkingjava.chapter15.BasicGenerator;
import java.book.thinkingjava.chapter15.CountedObject;

public class BasicGeneratorDemo {

	public static void main() {
		Generator<java.book.thinkingjava.chapter15.CountedObject> gen =
				BasicGenerator.create(CountedObject.class)	;
		for(int i = 0; i< 5 ; i++)
			System.out.println(gen.next());
	}
}
