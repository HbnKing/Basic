package book.thinkingjava.chapter8;

public class Music2 {
	
	//不用向上转型时  不小心就会漏掉  
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i) {
		i.play(Note.C_SHARP);
	}

	public static void tune(Stringed i) {
		i.play(Note.B_FLAT);
	}

	public static void  main(String [] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}

}

class Stringed  extends Instrument{
	@Override
	public void play(Note n ) {
		System.out.println("Stringed.play()" +n);
	}
}

class Brass extends Instrument{
	@Override
	public void play(Note n) {
		System.out.println("Brass.play()" +n);
	}
}
