package WorkFlow;

/**
 * for循环嵌套
 * 练习题
 * 
 * 需要输出如下图形
 * ****
 * ****
 * ****
 * 
 * 
 * @author 徐葳
 *
 */
public class ForDemo5 {
	public static void main(String[] args) {
		for(int x=0;x<3;x++) {
			for(int y=0;y<4;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
