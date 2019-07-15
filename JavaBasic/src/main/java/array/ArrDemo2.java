package array;

/**
 *	数组
 * @author 徐葳
 *
 */
public class ArrDemo2 {
	public static void main(String[] args) {
		//	创建数组
		int[] arr = new int[3];
		//	给数组中的0号格子存储数据
		arr[0] = 10;
		
		//	查询数组中指定编号中存储的数据
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);//	堆内存中的实体的变量都有默认值，int类型的元素默认初始化值为0
		
		arr = null;//此时 arr没有指向任何实体
		
		
	}
}
