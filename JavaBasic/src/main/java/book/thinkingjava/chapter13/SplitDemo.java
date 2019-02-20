package book.thinkingjava.chapter13;

import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.regex.Pattern;
public class SplitDemo {

	public static void main(String[] args) {

		String input = 
				"THIS!! IS unusual use !! of excalamation!! points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		print(Arrays.toString(Pattern.compile("!!").split(input,3)));
	}
	

}
