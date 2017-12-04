package book.thinkingjava.chapter2;

public class Overloading {
	public static void main (String[] args) {
		for(int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloading method");
			}
		// Overloaded constructor:
		new Tree(); 
		
	}

}
