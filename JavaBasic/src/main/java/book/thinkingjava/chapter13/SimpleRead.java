package book.thinkingjava.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * 扫描输入
 * @author Wangheng
 *
 */
public class SimpleRead {
	public static BufferedReader input = new BufferedReader(
			new StringReader("SIR ROBIN OF CAMELOT\n22 1.61803"));
	//字符串换行
	public static void main(String[] args) {
		
		try {
			System.out.println("ooxxx");
			String name = input.readLine();
			System.out.println(name);
			System.out.println(
					"How old are you ? what is your favourite double?");
			System.out.println("(input : <age> <double>)");
			String numbers = input.readLine();
			System.out.println(numbers);
			String[] numArray = numbers.split(" ");
			int age  = Integer.parseInt(numArray[0]);
			double favourite  = Double.parseDouble(numArray[1]);
			System.out.format("Hi %s.\n", name);
			System.out.format("In 5 years you will be %d.\n", age+5);
			System.out.format("My favourite double is %f", favourite/2);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
	}

}
