package book.thinkingjava.chapter8;

/**
 * 向上转型  upcast
 * 自动向上转为父类型
 * @author HENC
 *
 */

class Wind extends Instrument {
	@Override
	public void play(Note n){
		System.out.println("Wind.play()" +n);
	}

}

class Instrument{
	
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
	static void tune(Instrument i) {
		//i.play();
	}
}
enum Note{
	MIDDLE_C , C_SHARP , B_FLAT ;
}

public class Music{
	public static void tune(Instrument i){

		i.play(Note.MIDDLE_C);
	}
	public static void main(String [] args){

		Wind flute = new Wind();
		tune(flute);
	}
}