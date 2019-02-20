package book.thinkingjava.chapter10;

import book.thinkingjava.chapter10.ClassInInterface.Test;

import java.book.thinkingjava.chapter10.Test;

public class TestBed {

	public void f() {System.out.println("F()");}
	public static void main(String[] args) {
		TestBed t = new TestBed();
		t.f();
		new Test().howdy();
	}

}
