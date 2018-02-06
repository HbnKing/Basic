package book.thinkingjava.chapter13;

import java.util.Scanner;

/**
 * Scanner 类
 * @author Wangheng
 * Scanner 可以接受任何类型的输入对象  包括file
 *
 */
public class BetterRead {

	public static void main(String[] args) {
		Scanner stdin  = new Scanner(SimpleRead.input);
		System.out.println("What is your name ?");
		String name  =  stdin.nextLine();
		System.out.println(name);
		System.out.println(
				"HOW old are your ? what is your favourite double");
		System.out.println("Input : <age> <double > ");
		int age = stdin.nextInt();
		double favourite  = stdin.nextDouble();
		System.out.format("In 5 years you will be %d.\n", age+5);
		System.out.format("My favourite double is %f", favourite/2);
		
	}

}
