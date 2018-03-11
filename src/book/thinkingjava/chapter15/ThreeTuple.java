package book.thinkingjava.chapter15;

public class ThreeTuple<A,B,C> extends TwoTuple{

	public final C third;
	public ThreeTuple(A a, B b,C c) {
		super(a,b);
		third = c;
	}
	public String toString() {
		return ""+ first + "," +second +"," +third;
	}
}

 class FourTuple<A,B,C,D> extends ThreeTuple{

	public final D fourth;
	public FourTuple(A a, B b, B c,D d) {
		super(a, b, c);
		fourth = d;
	}
	public String toString() {
		//return "" +first + "," +second + "," + third +"," +fourth ;
		return super.toString() +"," +fourth;
	}
	
}
