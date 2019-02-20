package book.thinkingjava.chapter5;

/**
 * 数组的初始化  
 * 所有数组  都有一个固定成员  那就是length 
 * 通过他可以获知 组呢有多少个元素  但是不能对其修改
 * @author HENC
 *
 */
public class ArraysOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a1 = {1 ,2,3,4,5};
		int [] a2 ;
		a2 = a1;
		for(int i = 0 ; i<a2.length ; i++)
			a2[i] = a2[i] +1;
		for (int i = 0 ; i<a1.length ; i++)
			System.out.println( "a1[" +i+ "] = "+a1[i]);
	}

}
/*
 * 在这个案例中  a2 是a1 的拷贝  他们每个下标的指向  相同  当修改指向所对应的值得时候  
 * 在另一个数组中也可以观察到
 */

