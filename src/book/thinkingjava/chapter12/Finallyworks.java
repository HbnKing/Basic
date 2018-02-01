package book.thinkingjava.chapter12;


class ThreeException extends Exception{}

/**
 * 12.8
 * 测试finally 类会执行
 * @author Wangheng
 *
 */
public class Finallyworks {

	static int count  = 0 ;
	public static void main(String[] args) {

		while(true) {
			try {
					if(count++ == 0) {
					throw new ThreeException();
					}
				} catch (ThreeException e) {
					// TODO Auto-generated catch block
					System.out.println("eeeeeeeee");
			}finally {
				System.out.println(" finally cause");
				if(count ==2 ) break;
			}
		}
	}

}
