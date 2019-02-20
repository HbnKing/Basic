package book.thinkingjava.chapter8;

import java.book.thinkingjava.chapter8.Shape;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}
