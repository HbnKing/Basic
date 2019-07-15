package WorkFlow;

/**
 * while案例
 * @author 徐葳
 *
 */
public class WhileDemo1 {
	
	/**
	 * 注意：在实现循环语句的时候，需要注意两点
	 * 1：定义循环的条件
	 * 2：控制循环执行的次数
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1;
		while(x<3) {
			System.out.println("x="+x);
			x++;//每次循环递增加1
		}
	}

}
