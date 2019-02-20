package book.thinkingjava.chapter2;

import java.book.thinkingjava.chapter2.Tree;

public class Overloading {
	public static void main (String[] args) {
		for(int i = 0; i < 5; i++) {
			java.book.thinkingjava.chapter2.Tree t = new java.book.thinkingjava.chapter2.Tree(i);
			t.info();
			t.info("overloading method");
			}
		// Overloaded constructor:
		new Tree();
		
	}

}
