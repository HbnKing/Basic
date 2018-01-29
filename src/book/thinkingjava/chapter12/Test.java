package book.thinkingjava.chapter12;

/**
 * 12.3捕获异常
 * 测试除以零 的效果   
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		int a ;
		
		try {
			a = 1/0;
			
		}catch(Exception e) {
			a = 1*100;
			
		}
		System.out.println("a 的值为:" +a);
		
		
	}

}
