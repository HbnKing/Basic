package book.thinkingjava.chapter15;

public class Automobile {

	private Automobile a ;
	public void  Holderl(Automobile a ) {
		this.a = a;
	}
	Automobile get() {
		return a;
	}
}
