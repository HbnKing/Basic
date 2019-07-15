package WorkFlow;

/**
 * for循环的嵌套
 * 练习题
 * 
 * 需要实现如下图形
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * @author 徐葳
 *
 */
public class ForDemo6 {
	public static void main(String[] args) {
		for(int x=0;x<5;x++) {//外循环控制行数
			for(int y=x;y<5;y++) {//内循环控制列数
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
