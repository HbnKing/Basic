package book.thinkingjava.chapter9;


import static net.mindview.util.Print.*;

import java.util.Arrays;

/**
 * 完全解耦  
 * @author HENC
 *
 */
public class Apply {

	public static void process(Processor p,Object s) {
		print("USing process " + p.name());
		print(p.process(s));
	}
	public static String s = 
			"Apply static String s";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
class Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor{
	@Override
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor{
	@Override
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	@Override
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
