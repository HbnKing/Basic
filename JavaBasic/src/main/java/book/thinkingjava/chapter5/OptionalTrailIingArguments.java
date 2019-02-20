package book.thinkingjava.chapter5;

/**
 * 可变参数  为0 也是可行的
 * @author HENC
 *
 */
public class OptionalTrailIingArguments {
	static void f(int required , String...trailing) {
		System.out.print("required :"+required +"  ");
		for(String s: trailing)
			System.out.print("s :"+s);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f(1,"one");
		f(2,"one","two");
		f(0);
	}

}
