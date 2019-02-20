package book.thinkingjava.chapter10;



/**
 * 创建一个内部类
 * 外部内的  方法 指向 内部类的引用  
 * 除静态方法之外
 * outClassName.innerClassName
 * 来创建内部类对象 
 * @author HENC
 *
 */
public class Parcel2 {

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

		Parcel2 p = new Parcel2();
		p.ship("666666");
		Parcel2 q = new Parcel2();
		Contents c = q.contents();
		Destination d = q.to("Borneo");
	}

}
