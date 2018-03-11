package book.thinkingjava.chapter15;


/**
 * 一个可以存储多种类型的  类
 * @author Wangheng
 *
 */
public class Holder2 {

	private Object a;
	//构造方法
	public Holder2(Object a) {
		this.a = a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	
	public static void main(String[] args) {

		Holder2  h2 = new Holder2(new Automobile());
		Automobile a =  (Automobile) h2.get();
		h2.set("just a string");
		String S = (String) h2.get();
		h2.set(1);
		int i = (int) h2.get();
		System.out.println(a +" " + S + " " +i);
	}

}
