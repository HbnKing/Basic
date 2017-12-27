package book.thinkingjava.chapter9;

import static net.mindview.util.Print.print;
import interfaces.interfaceprocessor.Processor;
import java.util.Arrays;

public abstract class StringProcessor  implements Processor{
	@Override
	public String name() {
		return getClass().getSimpleName();
	}
	@Override
	public abstract String process(Object s);
	public static String s = 
			"Apply static String s";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}

}

class UpcaseA extends StringProcessor{
	@Override
	public
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class DowncaseA extends StringProcessor{
	@Override
	public
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class SplitterA extends StringProcessor{
	@Override
	public
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
