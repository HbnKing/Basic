package book.thinkingjava.chapter5;

public class Test {
	int i;
	//System.out.println(i);
	Test() {
		i = 7;
	}
	public static void main(String [] args ) {
		System.out.println(new Test().i);
		
	}

}
