package array;

/**
 * 打印二维数组中的所有元素
 * @author 徐葳
 *
 */
public class DoubleArrDemo3 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8}};
		//先获取一维数组
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				System.out.println(arr[x][y]);
			}
		}
		
	}

}
