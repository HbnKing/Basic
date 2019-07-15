package array;

/**
 * 获取数组中的所有元素
 * 
 * @author 徐葳
 *
 */
public class ArrDemo5 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,9};
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);*/
		
		for(int x=0;x<arr.length;x++) {
			System.out.println("arr["+x+"] = "+arr[x]);
		}
		
	}

}
