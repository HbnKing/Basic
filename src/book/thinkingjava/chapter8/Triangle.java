package book.thinkingjava.chapter8;

public class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.print("Triangle.draw() ");
	}
	@Override
	public void erase() {
		System.out.print("Triangle.erase()");
	}
}
