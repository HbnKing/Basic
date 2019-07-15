package WorkFlow;

/**
 * 函数案例  升级版
 * @author 徐葳
 *
 */
public class FuncDemo2 {
	
	/*
	 修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
	{
			执行语句;
			return 返回值;
	}
	 */
	public static void main(String[] args) {
		int sum = add(2, 8);// 2 和 8 就是实际参数
		System.out.println("sum="+sum);
		
		//System.out.println(add(1, 2));
	}
	
	public static int add(int a,int b) {//a  和 b 就是形式参数
		return a+b;
	}
	
	

}
