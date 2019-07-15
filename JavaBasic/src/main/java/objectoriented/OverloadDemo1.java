package objectoriented;

/**
 * 覆盖
 * @author 徐葳
 *
 */
public class OverloadDemo1 {
	public static void main(String[] args) {
		add(1,2,3);
	}
	
	
	/*
	 * 通过定义函数名称的时候，为了更好的阅读该函数，都是以函数的功能来命名的，这样可以增强阅读性
	 */
	
	// 定义一个功能 获取两个整数的和
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	// 定义一个功能 获取三个整数的和  【函数的重载】
	public static int add(int a,int b,int c) {
		return a+b+c;
	}

}
