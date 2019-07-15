package array;

/**
 * 选择排序
 * @author 徐葳
 *
 */
public class ArrDemo8 {
	public static void main(String[] args) {
		int[] arr = {4,1,6,2};
		System.out.println("排序前的数组:");
		printArray(arr);
		
		selectSort(arr);
		System.out.println("排序后的数组:");
		printArray(arr);
		
	}
	
	/**
	 * 打印数组中的元素
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}
	
	/**
	 * 数组排序
	 * @param arr1
	 */
	public static void selectSort(int[] arr1) {
		for(int x=0;x<arr1.length-1;x++) {
			//为什么y的初始化值为x+1？因为每一次比较，都是x角标上的元素和下一个元素进行比较
			for(int y=x+1;y<arr1.length;y++) {
				//当前一个元素比另一个元素大的时候，进行位置互换
				if(arr1[x]>arr1[y]) {
					int temp = arr1[x];
					arr1[x] = arr1[y];
					arr1[y] = temp;
				}
			}
		}
	}

}
