package WorkFlow;

/**
 * 函数案例
 * @author 徐葳
 *
 */
public class FuncDemo1 {
	
	/*
	 修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
	{
			执行语句;
			return 返回值;
	}
	 */
	public static void main(String[] args) {
		int a = 4 + 5;
		System.out.println("a="+a);
		
		int b = 2 + 7;
		System.out.println("b="+b);
		
		int sum = add();
		System.out.println(sum);
	}
	
	public static int add() {
		int a = 4 + 5;
		return a;
	}
	
	

}
