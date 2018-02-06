package book.thinkingjava.chapter13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * 13.8
 * String Tokenizer 简单的  分词器
 * 有了正则  和Scanner 之后 我们可以更加复杂的模式来拆分一个字符串
 * @author Wangheng
 *
 */
public class ReplacingStringTokenizer {

	public static void main(String[] args) {
		String input  = "But I am not dead yet! I fell better";
		StringTokenizer stoke = new StringTokenizer(input);
		while(stoke.hasMoreTokens())
			System.out.print(stoke.nextToken() + " ");
		System.out.println();
		System.out.println(Arrays.toString(input.split(" ")));
		Scanner scanner = new Scanner(input);
		while(scanner.hasNext())
			System.out.print(scanner.next() + " ");
	}

}
