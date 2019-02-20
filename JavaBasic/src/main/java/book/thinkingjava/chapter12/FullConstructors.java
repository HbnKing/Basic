package book.thinkingjava.chapter12;

/**
 * 12.4自定义异常
 * @author Administrator
 *
 */
class MyException extends Exception{
	public MyException() {}
	public MyException(String MSG) {
		super(MSG);
	}
}
public class FullConstructors {

	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw  new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException();
	}
	public static void main(String[] args) {

		try {
			f();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
	}

}
