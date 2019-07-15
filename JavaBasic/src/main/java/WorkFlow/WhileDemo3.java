package WorkFlow;

/**
 * while练习题
 * 2：打印1~10的和
 * 分析：首先需要获取到1~10之间的递增数字，然后还需要一个变量，保存1~10的和
 * @author 徐葳
 *
 */
public class WhileDemo3 {
	
	public static void main(String[] args) {
		//第一种方式，这种实现方式如果数据比较少是可以的，但是数据量大了，就不合适了。
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		//第二种方式，推荐使用这种方式
		int num = 1;//初始化变量，使用num这个变量保存每次循环之后的值
		int sum = 0;//保存计算的和
		
		while(num<=10) {
			sum += num;//sum = sum + num;// 把每次循环的数字进行累加求和
			num++;//每次循环递增加1
		}
		
		System.out.println("sum="+sum);
	}

}
