package WorkFlow;

/**
 * do while案例
 * @author 徐葳
 *
 */
public class DoWhileDemo1 {
	public static void main(String[] args) {
		int x = 1;
		do {
			//注意：不管while中的条件表达式是否为true，do里面的代码至少会执行一次
			System.out.println("x="+x);
			x++;
		}while(x<3);
	}

}
