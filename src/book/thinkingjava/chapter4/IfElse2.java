package book.thinkingjava.chapter4;
import static net.mindview.util.Print.*;

/**
 * return 语句 
 * void  方法 会调用一个隐式的 return 语句
 * 不是 void  的 其他返回类型必须调用return 
 * @author HENC
 *
 */
public class IfElse2 {
	static int test(int testval ,int target) {
		
		if(testval > target )
			return +1;
		else if (testval <target)
			return -1;
		else
		return 0;
	}

	public static void main(String []  args) {
		print(test(10,5));
		print(test(5,10));
		print(test(5,5));
		
	}
}
