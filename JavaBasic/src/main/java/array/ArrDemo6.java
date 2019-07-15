package array;

/**
 * 获取数组中的最值--最大值
 * 1：首先定义一个变量，记录住数组中比较大的元素，因为该元素是不确定，该变量的初始化，需要初始化成数组中的任意一个元素
 * 2：遍历数组，让数组中的每一个元素和该变量的元素进行比较
 * 3：当遍历到的元素比变量中记录的元素大时，需要让变量记录这个比较大的元素
 * 当循环结束时，该变量记录的就是数组中的最大值
 * 
 * @author 徐葳
 *
 */
public class ArrDemo6 {
	
	public static void main(String[] args) {
		int[] arr = {4,1,3,2,8};
		int max = getMax(arr);
		System.out.println("max:"+max);
	}
	/**
	 * 获取int数组中的最大值
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];//先初始化为数组中的第一个元素
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		return max;
	}

}
