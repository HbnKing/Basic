package array;

/**
 * 	数组的第二种创建形式
 * @author 徐葳
 *
 */
public class ArrDemo4 {
	
	public static void main(String[] args) {
		//	第一种创建形式  【数组的动态初始化方式】
		int[] arr = new int[3];
		
		//	第二种创建形式 【数组的静态初始化方式】
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = {1,2,3,4};//	简写形式
		
		System.out.println("数组的长度："+arr1.length);
		System.out.println("数组的最大角标："+(arr1.length-1));
	}

}
