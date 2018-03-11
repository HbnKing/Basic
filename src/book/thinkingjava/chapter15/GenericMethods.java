package book.thinkingjava.chapter15;


/**
 * 范型方法  
 * 例子中只有f() 方法是范型方法  而类不是范型接口
 * @author Wangheng
 *
 */
public class GenericMethods {
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	public static void main(String [] args ) {
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(' ');
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0f);
		gm.f('C');
		gm.f(gm);
	}

}
