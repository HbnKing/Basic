package book.thinkingjava.chapter5;

import java.util.Arrays;

/**
 * 数组初始化的形式
 * @author HENC
 *
 */
public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = {
			new Integer(1),
			new Integer(2),
			3,  //最后一个元素的逗号  是可选 的
		};
		Integer [] b = new Integer[]{
				new Integer(1),
				new Integer(2),
				3,  //最后一个元素的逗号  是可选 的
			};
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	}
}
