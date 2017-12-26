package book.thinkingjava.chapter8;

public class Music2 {

}

class Stringed  extends Instrument{
	public void play(Note n ) {
		System.out.println("Stringed.play()" +n);
	}
}

class Brass extends Instrument{
	public void play(Note n) {
		System.out.println("Brass.play()" +n);
	}
}
