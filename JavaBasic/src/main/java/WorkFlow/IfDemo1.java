package WorkFlow;

/**
 * if 单分支
 * @author 徐葳
 *
 */
public class IfDemo1 {
	public static void main(String[] args) {
		int x = 10;
		/*if(x>5) {
			System.out.println("正确");
		}*/
		
		//if单分支的简写形式，如果if中控制的只有一行代码，那么可以把{}省略掉
		//如果发现if后面没有{},那么也就意味着if只会控制后面的那一行语句
		if(x>5) 
			System.out.println("正确");
		
		System.out.println("继续执行");
	}

}
