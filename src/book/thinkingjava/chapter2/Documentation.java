package book.thinkingjava.chapter2;

/**
 * DATE 
 * @author HENC
 *
 */
class Date{
/** A field comment */ 
public int i;  
/** A method comment */
public void f() {}
}  
class Documentation2 {
	Date d = new Date();
	void showDate()
	{
		System.out.println("Date = " + d);
		} 
	} 
public class Documentation {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d = " + d);
		} 
	}