package book.thinkingjava.chapter2;

import java.util.Date;

public class HelloDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello it is :");
		System.out.println(new Date());
		System.out.println(new String("HELLO WORLD"));
		
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(
				System.getProperty("java.library.path"));
		
	}

}
