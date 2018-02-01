package book.thinkingjava.chapter12;

/**
 * 12.6.1
 * 栈空间的轨迹
 * @author Administrator
 *
 */
public class WhoCalled {

	static void f() {
		//static void f() throws Exception 
		try {
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste: e.getStackTrace()) {
				System.out.println(ste.getMethodName());
				
			}
			e.printStackTrace();
		}
	}
	static void g() {f();}
	static void h() {g();}
	public static void main(String[] args) {
		f();
		System.out.println("***************");
		g();
		System.out.println("***************");
		h();
		System.out.println("***************");
	}

}
