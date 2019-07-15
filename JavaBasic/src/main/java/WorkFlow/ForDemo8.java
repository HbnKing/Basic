package WorkFlow;

/**
 * for循环的嵌套
 * 练习题
 * 
 * 需要打印如下内容
 * 54321
 * 5432
 * 543
 * 54
 * 5
 * 
 * @author 徐葳
 *
 */
public class ForDemo8 {
	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {
			for(int y=5;y>=x;y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
