package WorkFlow;

/**
 * for循环的嵌套
 * 练习题
 * 
 * 需要打印如下内容
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * @author 徐葳
 *
 */
public class ForDemo7 {
	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
