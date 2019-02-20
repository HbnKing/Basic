package book.thinkingjava.chapter7;

/**
 * 向上转型  upcast
 * 自动向上转为父类型
 * @author HENC
 *
 */

public class Wind extends Instrument {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wind flute = new Wind();
		Instrument.tune(flute); //Upcasting
		//直接向上转型到父类的
	}

}
class Instrument{
	public void play() {	}
	static void tune(Instrument i) {
		i.play();
	}
}
