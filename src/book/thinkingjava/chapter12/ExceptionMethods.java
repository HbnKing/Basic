package book.thinkingjava.chapter12;
import static net.mindview.util.Print.*;

/**
 * 12.6 捕获所有异常
 * 
 * @author Administrator
 *
 */
public class ExceptionMethods {

	public static void main(String[] args) {

		try {
			throw new Exception("My Exception");
		}catch(Exception e) {
			print("caught exception");
			print("getMessage() " + e.getMessage());
			print("getLocalizedMessgae() " +e.getLocalizedMessage());
			print("toString() " +e);
			print("printStackTrace ()" );
			e.printStackTrace(System.out);
		}
	}

}
