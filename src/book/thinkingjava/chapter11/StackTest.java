package book.thinkingjava.chapter11;

/**
 * 举例说明  Stack  空间的  存储过程
 * @author HENC
 *
 */
public class StackTest {

	public static void main(String[] args) {

		Stack<String> stack  =  new  Stack<String>();
		for(String s :"MY dog has fleas ".split(" "))
			stack.push(s);
		while(!stack.empty())
			System.out.println(stack.pop()+"");
			
		
	}

}
