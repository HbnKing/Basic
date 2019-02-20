package book.thinkingjava.chapter8;

import java.book.thinkingjava.chapter8.RandomShapeGenerator;
import java.book.thinkingjava.chapter8.Shape;

public class Shapes {

	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	public static void main(String[] args) {
		java.book.thinkingjava.chapter8.Shape[] s = new java.book.thinkingjava.chapter8.Shape[9];
		
		for(int i = 0 ; i <s.length ; i++) {
			s[i] = gen.next();
		}

		for(Shape shp :s){
			shp.draw();
		}
	}

}
