package book.thinkingjava.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class TheRepalcements {

	public static void main(String[] args) {
		String s = TextFile.read("");
		Matcher mInput = Pattern.compile("\\*!()",Pattern.DOTALL).matcher(s);
		if(mInput.find()) {
			
		}
	}

}
