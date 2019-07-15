package WorkFlow;

/**
 * for循环
 * @author 徐葳
 *
 */
public class ForDemo1 {
	public static void main(String[] args) {
		/*
		 for(初始化表达式；循环条件表达式；循环后的操作表达式)
			{
				执行语句；(循环体)
			}
			注意：初始化表达式只会执行一次 
		 */
		
		for(int x=1;x<3;x++) {
			System.out.println("x="+x);
		}
		//System.out.println(x);//会报错，这里获取不到x这个变量
		
		int y = 1;
		while(y<3) {
			System.out.println("y="+y);
			y++;
		}
		System.out.println(y);//可以获取到y变量
		//for和while是可以互换的
		
	}

}
