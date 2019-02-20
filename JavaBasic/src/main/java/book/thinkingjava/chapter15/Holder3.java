package book.thinkingjava.chapter15;

import java.book.thinkingjava.chapter15.Automobile;

/**
 * 保存不确定类型的 类  范型的使用
 * @author Wangheng
 * @param <T>
 *
 */
public class Holder3<T> {

	private T a;
	public Holder3(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
		
	}
	public T get() {
		return a;
	}
	public static void main(String[] args) {
		Holder3<Automobile>  h3 = new Holder3<Automobile>(new Automobile());
		Automobile a =  h3.get();
		
		//该对象加入具体类型后不能在添加其他类型了
		/*h3.set("just a string");
		String S = (String) h3.get();
		h3.set(1);
		int i = (int) h3.get();
		System.out.println(a +" " + S + " " +i);*/
		
	}

}
