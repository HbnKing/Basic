package book.thinkingjava.chapter13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * 测试
 * @author Wangheng
 *
 */
public class Turtle {
	private String name;
	private Formatter  f;
	public Turtle(String name, Formatter  f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x , int y) {
		f.format("%s The Turtle is at ( %d ,%d) \n", name ,x ,y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
		
		Turtle terry  = new Turtle("Terry" ,new Formatter(System.err));
		
		tommy.move(0, 0);
		terry.move(4, 5);
		tommy.move(2, 4);
		terry.move(2, 5);
		
	}

}
