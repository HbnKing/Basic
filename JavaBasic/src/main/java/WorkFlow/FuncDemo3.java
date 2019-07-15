package WorkFlow;

/**
 * 函数案例  升级版
 * @author 徐葳
 *
 */
public class FuncDemo3 {
	
	/*
	 修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
	{
			执行语句;
			return 返回值;
	}
	 */
	public static void main(String[] args) {
		add(2, 8);// 2 和 8 就是实际参数
	}
	
	public static void add(int a,int b) {//a  和 b 就是形式参数
		System.out.println(a+b);
		//return;//当函数没有返回值的时候，这个return语句可以省略不写
	}
	
	

}
