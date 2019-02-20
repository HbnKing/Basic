package book.thinkingjava.chapter8;

import java.book.thinkingjava.chapter8.Shape;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	
}
