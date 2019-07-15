package array;

/**
 * 数组中元素的查找
 * @author 徐葳
 *
 */
public class ArrDemo11 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int index = getIndex(arr, 30);
		System.out.println("index:"+index);
	}
	/**
	 * 对数组中的元素进行查找，获取元素第一次出现的位置
	 * 如果找到了，就返回元素对应的角标
	 * 如果没找到，就返回-1，表示该元素并不在数组中存在
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int getIndex(int[] arr,int key) {
		for(int x=0;x<arr.length;x++) {
			if(arr[x] == key) {
				return x;
			}
		}
		return -1;
	}

}
