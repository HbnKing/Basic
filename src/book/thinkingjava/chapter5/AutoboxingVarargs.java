package book.thinkingjava.chapter5;

/**
 * 可变参数与自动拆箱(封装类)
 * @author HENC
 *
 */
public class AutoboxingVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(new Integer(10),new Integer(7));
		f(1,2,3,4,5);
	}
	public static void f(Integer...args) {
		for(Integer i : args)
			System.out.print("i :"+i +"  ");
		System.out.println();
		
	}

}
