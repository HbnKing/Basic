package book.thinkingjava.chapter8;

import java.book.thinkingjava.chapter8.Instrument;
import java.book.thinkingjava.chapter8.Note;
import java.book.thinkingjava.chapter8.Wind;

public class Music2 {
	
	//不用向上转型时  不小心就会漏掉  
	public static void tune(java.book.thinkingjava.chapter8.Wind i) {
		i.play(java.book.thinkingjava.chapter8.Note.MIDDLE_C);
	}
	public static void tune(Brass i) {
		i.play(java.book.thinkingjava.chapter8.Note.C_SHARP);
	}

	public static void tune(Stringed i) {
		i.play(java.book.thinkingjava.chapter8.Note.B_FLAT);
	}

	public static void  main(String [] args) {
		java.book.thinkingjava.chapter8.Wind flute = new java.book.thinkingjava.chapter8.Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}

}

class Stringed  extends java.book.thinkingjava.chapter8.Instrument {
	@Override
	public void play(java.book.thinkingjava.chapter8.Note n ) {
		System.out.println("Stringed.play()" +n);
	}
}

class Brass extends java.book.thinkingjava.chapter8.Instrument {
	@Override
	public void play(java.book.thinkingjava.chapter8.Note n) {
		System.out.println("Brass.play()" +n);
	}
}
