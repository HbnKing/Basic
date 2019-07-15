package array;

/**
 * 数组排序
 * 	冒泡排序
 * @author 徐葳
 *
 */
public class ArrDemo9 {
	public static void main(String[] args) {
		int[] arr = {4,1,3,6,2};
		System.out.println("排序前数组：");
		printArray(arr);
		
		doubleSort(arr);
		System.out.println("排序后数组：");
		printArray(arr);
		
	}
	
	
	public static void doubleSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++) {//控制循环的次数
			// -x 让每次参与比较的元素递减
			// -1 避免角标越界
			for(int y=0;y<arr.length-x-1;y++) {
				if(arr[y]>arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}

}
