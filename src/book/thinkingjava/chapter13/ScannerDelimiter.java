package book.thinkingjava.chapter13;

import java.util.Scanner;

/**
 * 修改 ScannerDelimiter 的定界符
 * @author Wangheng
 *
 */
public class ScannerDelimiter {

	public static void main(String [] args) {
		Scanner scanner = new Scanner("12,24,78,99,42");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
	}
}
