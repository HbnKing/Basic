package book.thinkingjava.chapter12;

/**
 * 所有的异常 都继承自 Exception()
 * @author Administrator
 *
 */
 class SimpleExceptions extends Exception{}

public class InheritingExceptions{
	public void f() throws SimpleExceptions{
		System.out.println("throw new SimpleException();\r\n");
		throw new SimpleExceptions();
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleExceptions e) {
			System.out.println("caught simpleExcepTION");
			e.printStackTrace();
			System.out.println("********");
		}
	}

}