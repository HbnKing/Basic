package array;

/**
 * 数组的查找
 * 折半查找/二分法查找
 * 
 * 
 * 注意：折半查找的一个必要前提是：数组必须是有序的。
 * @author 徐葳
 *
 */
public class ArrDemo12 {
	
	public static void main(String[] args) {
		int[] arr = {12,34,45,48,50,66,77};
		int index = halfSearch(arr, 35);
		System.out.println("index:"+index);
		
	}
	
	public static int halfSearch(int[] arr,int key) {
		int min,mid,max;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;
		
		while(arr[mid]!=key) {
			if(key>arr[mid]) {
				min = mid + 1;
			}else if(key<arr[mid]) {
				max = mid - 1;
			}
			//如果min大于max，说明查询的元素是不存在的，这个方法直接执行结束
			if(min>max) {
				return -1;
			}
			mid = (min+max)/2;
		}
		
		return mid;
		
	}

}
