package book.thinkingjava.chapter12;
import static net.mindview.util.Print.*;


/**
 * 12.8.2 return 和finally的 结合使用
 * 之后的try 语句不在执行 
 * 
 * @author Wangheng
 *
 */
public class MultipleReturns {
	
	public static void main(String[] args) {
		for(int i = 1 ;i <=4 ; i++)
			f(i);
	}

	private static void f(int i) {
		print("require clean up");
		try {
			print("point 1");
			if(i == 1) return;
			print("point 2");
			if(i == 2) return;
			print("point 3");
			if(i == 3) return;
			print(" end");
			
		}finally {
			print("performing clean up");
		}
	}

}
