package book.thinkingjava.chapter10;

import innerclasses.Contents;
import innerclasses.Destination;
/**
 * 当内部类 向上转型    尤其是  向上转型为一个接口 的时候  
 * Contents 
 * Destination  均为接口 
 * @author HENC
 *
 */

public class TestParcel {

	public static void main(String[] args) {

		Parcel4 p = new Parcel4();
		
		//内部类转型为一个接口的时候     
		Contents c = p.contents();
		Destination d =p.destination("woqe");
	}

}
class Parcel4 {

	//此类 私有化  只有  parcel4 可以访问  
	private class PContents implements Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	//protected 类  只有  parcel 4  和他的子类 可以访问
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
	}


	
	public Destination destination(String S) {
		return new PDestination(S);
	}
	public Contents contents() {
		return new PContents();
	}
	
	

}

