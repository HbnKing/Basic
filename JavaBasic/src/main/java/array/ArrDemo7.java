package array;

/**
 * 获取数组的最值--最小值
 * @author 徐葳
 *
 */
public class ArrDemo7 {
	public static void main(String[] args) {
		int[] arr = {4,1,3,2,8};
		int min = getMin(arr);
		System.out.println("min:"+min);
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
		return min;
	}

}
