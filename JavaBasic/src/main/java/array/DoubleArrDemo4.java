package array;

/**
 * 获取二维数组中所有元素的和
 * @author 徐葳
 *
 */
public class DoubleArrDemo4 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8}};
		int sum = 0;
		//先获取一维数组
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				sum += arr[x][y];// sum = sum + arr[x][y];
			}
		}
		
		System.out.println("sum:"+sum);
		
	}

}
