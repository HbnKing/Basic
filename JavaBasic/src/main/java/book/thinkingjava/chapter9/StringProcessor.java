package book.thinkingjava.chapter9;

import static net.mindview.util.Print.print;
import interfaces.interfaceprocessor.Processor;

import java.book.thinkingjava.chapter9.Apply;
import java.book.thinkingjava.chapter9.Downcase;
import java.book.thinkingjava.chapter9.Processor;
import java.book.thinkingjava.chapter9.Splitter;
import java.book.thinkingjava.chapter9.Upcase;
import java.util.Arrays;

public abstract class StringProcessor  implements java.book.thinkingjava.chapter9.Processor {
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
		java.book.thinkingjava.chapter9.Apply.process(new java.book.thinkingjava.chapter9.Upcase(), s);
		java.book.thinkingjava.chapter9.Apply.process(new java.book.thinkingjava.chapter9.Downcase(), s);
		Apply.process(new java.book.thinkingjava.chapter9.Splitter(), s);
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
