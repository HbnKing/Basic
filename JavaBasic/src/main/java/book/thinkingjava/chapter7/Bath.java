package book.thinkingjava.chapter7;

/**
 *  * 组合语法 
 * @author HENC
 *对象的初始化可以在
 *1定义的地方 
 *2类的构造器中
 *3在正要 使用这些对象之前
 *4使用实例初始化
 * @author HENC
 *
 */
public class Bath {

	private String 
		s1 = "Happy",
		s2 = "Happy",
		s3 ,s4;
	private Soap castille;
	private int i;
	private float f;
	public Bath() {
		System.out.println("INSIDE bath()");
		
		s3 = "Joy";
		f =3.14f;
		castille = new Soap();
	}
	
	@Override
	public String toString() {
		if(s4 ==null) s4 ="joy";
		return "Bath [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + ", castille=" + castille + ", i=" + i
				+ ", f=" + f + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bath b = new Bath();
		System.out.println(b);
	}

}
class Soap{
	private String s;
	Soap(){
		System.out.print("Soap()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
	
}
