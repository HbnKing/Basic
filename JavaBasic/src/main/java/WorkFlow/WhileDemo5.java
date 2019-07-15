package WorkFlow;

/**
 * while练习题
 * 3：打印1~100之间6的倍数
 * 分析：首先获取到1~100之间的数字，然后针对每个数字判断一下是否是6的倍数，是的话，则打印
 * @author 徐葳
 *
 */
public class WhileDemo5 {
	public static void main(String[] args) {
		int x = 1;
		int count = 0;//记录6的倍数的次数
		while(x<=100) {
			if(x%6==0) {
				count++;
			}
			x++;
		}
		
		System.out.println("count="+count);
	}

}
