package book.thinkingjava.chapter8;

import java.book.thinkingjava.chapter8.Circle;
import java.book.thinkingjava.chapter8.Shape;
import java.book.thinkingjava.chapter8.Square;
import java.book.thinkingjava.chapter8.Triangle;
import java.util.Random;

public class RandomShapeGenerator {

	private  Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
		default:
		case 0 :return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();
		
		}
	}

}
