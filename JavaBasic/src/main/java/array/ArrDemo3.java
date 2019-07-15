package array;

/**
 * 	数组常见问题
 * @author 徐葳
 *
 */
public class ArrDemo3 {
	public static void main(String[] args) {
		
		//1:数组角标越界异常 ArrayIndexOutOfBoundsException: 3 【说明操作了不存在的角标】
		int[] arr = new int[3];
		System.out.println(arr[3]);
		
		//2：空指针异常 NullPointerException 【说明操作的变量为null】
		arr = null;
		System.out.println(arr[0]);
		
		
	}

}
