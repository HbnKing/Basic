package WorkFlow;

/**
 * for练习题
 * 1：累计1~100的和
 * 分析：首先获取到1~100之间的数字，在for循环的初始化表达式中定义x=1，在循环条件表达式中判断x<=100
 * 在循环后的操作表达式中对x++即可。
 * 
 * 最后再循环体中就可以获取到每一次循环的数字了，在循环外面定义一个累加求和的变量，针对循环体内的数字进行累加求和即可。
 * @author 徐葳
 *
 */
public class ForDemo2 {
	
	public static void main(String[] args) {
		int sum = 0;//累加求和的变量
		for(int x=1;x<=100;x++) {
			sum = sum + x;//累加求和，可以简写为：sum+=x;
		}
		System.out.println("sum="+sum);
	}

}
