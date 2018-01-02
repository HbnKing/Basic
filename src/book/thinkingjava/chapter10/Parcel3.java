package book.thinkingjava.chapter10;

import book.thinkingjava.chapter10.Parcel2.Contents;
import book.thinkingjava.chapter10.Parcel2.Destination;

/**
 * 使用.new  来创建 内部类
 * @author HENC
 *
 */
public class Parcel3 {

	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}

	private static Contents Contents;
	
	public Destination to(String S) {
		return new Destination(S);
	}
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
	Contents c = new Contents();
	Destination d = to(dest);
	System.out.println(d.readLabel());
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel3 p = new Parcel3();
		Parcel3.Contents c= p.new Contents();
		Parcel3.Destination d = p.new Destination("");
		
	}

}
