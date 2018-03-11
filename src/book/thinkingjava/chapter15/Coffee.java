package book.thinkingjava.chapter15;

/**
 *  范型接口
 * @author Wangheng
 *
 */
public class Coffee {
	private static long counter = 0;
	private final long id  = counter++;
	public String toString() {
		return super.getClass().getSimpleName()+ " " +counter ;
	}
	
	public static void main(String[] args) {
		Coffee c = new Coffee();
		System.out.println(c);
	}

}
