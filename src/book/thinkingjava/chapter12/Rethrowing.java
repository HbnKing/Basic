package book.thinkingjava.chapter12;

public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("originating the exception in the f()");
		throw new Exception("throw from f()");
	}
	public static void g() throws Exception{
		try {
			f();
		}catch (Exception e) {
			System.out.println("Inside h() e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception )e.fillInStackTrace();
		}
	}
	
	public static void main(String [] args) {
		try {
			g();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
