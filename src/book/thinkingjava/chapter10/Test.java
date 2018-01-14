package book.thinkingjava.chapter10;

public class Test {
	private static int i =0;
	public  void increment() {
		System.out.println(i);
		i++;
		Test.this.increment();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.increment();
	}

}
