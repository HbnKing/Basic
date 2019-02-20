package book.thinkingjava.chapter13;

import static net.mindview.util.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern  
 * 和 Matcher
 * @author Wangheng
 *
 */
public class TestRegularExpression {

	public static void main(String[] args) {

		if(args.length < 2) {
			print("  xxxxx");
			System.exit(0);
		}
		print("xxxxxxxxxxxxxxxxxxxxxx");
		for(String arg :args) {
			print("---------------");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()) {
				print(m.group() +" "+m.start() + (m.end()-1) );
			}
		}
		
	}

}
