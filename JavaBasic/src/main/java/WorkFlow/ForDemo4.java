package WorkFlow;

/**
 * for循环嵌套
 * @author 徐葳
 *
 */
public class ForDemo4 {
	public static void main(String[] args) {
		//for循环的嵌套形式
		// 外循环每执行一次，内循环执行一遍
		for(int x=0;x<3;x++) {//外循环 可以控制打印的行数
			System.out.println("x="+x);
			for(int y=0;y<4;y++) {//内循环 可以控制打印的列数
				System.out.print(" y="+y);
			}
			System.out.println();//换行
		}
		
		//System.out.print("hello");//只打印 不换行
		//System.out.println("hello");//打印并且换行
	}

}
