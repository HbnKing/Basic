package book.thinkingjava.chapter10;

/**
 * 创建一个内部类
 * 外部内的  方法 指向 内部类的引用  
 * @author HENC
 *
 */
public class Parcel1 {

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
	public void ship(String dest) {
	Contents c = new Contents();
	Destination d = new Destination(dest);
	System.out.println(d.readLabel());
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel1 p = new Parcel1();
		p.ship("TASMANIA");
	}

}
