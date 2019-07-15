package WorkFlow;

/**
 * 需求：定义一个功能，可以实现两个整数的加法运算
 * 分析
 * 	1：该功能的运算结果是int类型，所以函数的返回值就是int
 * 	2:该功能的运算需要有两个整数，所以函数需要接收两个参数，并且两个参数都是int类型
 * @author 徐葳
 *
 */
public class FuncDemo4 {
	
	
	/**
	 * 为了验证add函数是否正确，在这里对这个功能进行测试，所以定义一个main方法来调用该功能进行测试
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = add(3, 8);
		System.out.println("sum="+sum);
		
	}
	
	/**
	 * 加法运算
	 * 对a和b的数值进行求和
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a,int b) {
		return a+b;
	}
	
	

}
