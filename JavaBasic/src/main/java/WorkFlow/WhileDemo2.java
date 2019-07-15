package WorkFlow;

/**
 * while练习题
 * 1：在控制台打印1~10
 * 分析：通过循环对一个变量进行递增操作，判断这个变量是否满足条件，满足条件，则把值打印到控制台
 * @author 徐葳
 *
 */
public class WhileDemo2 {
	public static void main(String[] args) {
		int num = 1;
		while(num<=10) {
			System.out.println("num="+num);
			num++;
		}
	}

}
