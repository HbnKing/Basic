package WorkFlow;

/**
 * while练习题
 * 3：打印1~100之间6的倍数
 * 分析：首先获取到1~100之间的数字，然后针对每个数字判断一下是否是6的倍数，是的话，则打印
 * @author 徐葳
 *
 */
public class WhileDemo4 {
	public static void main(String[] args) {
		int x = 1;
		while(x<=100) {
			if(x%6==0) {
				System.out.println("x="+x);
			}
			x++;
		}
	}

}
