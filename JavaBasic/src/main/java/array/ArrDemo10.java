package array;

import java.util.*;
/**
 * 数组排序
 * @author 徐葳
 *
 */
public class ArrDemo10 {
	public static void main(String[] args) {
		int[] arr = {4,1,3,6,2};
		Arrays.sort(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}

}
