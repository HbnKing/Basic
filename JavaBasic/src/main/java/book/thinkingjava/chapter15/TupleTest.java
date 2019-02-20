package book.thinkingjava.chapter15;

import java.book.thinkingjava.chapter15.Automobile;
import java.book.thinkingjava.chapter15.ThreeTuple;
import java.book.thinkingjava.chapter15.TwoTuple;

public class TupleTest {

	static java.book.thinkingjava.chapter15.TwoTuple<String,Integer> f(){
		return new java.book.thinkingjava.chapter15.TwoTuple<String,Integer>(" test" ,10);
	}
	static ThreeTuple<Automobile ,String, Integer> g(){
		return new ThreeTuple<Automobile ,String, Integer> (new Automobile() ,"" ,47 );
	}
	
	public static void main (String [] args) {
		TwoTuple<String,Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(ttsi.getClass());
		System.out.println(g());
		System.out.println(g().getClass());
	}
}
