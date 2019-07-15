package WorkFlow;

/**
 * if练习题
 * 需求：实现一个翻译功能，用户输入数字，我们给用户提供这个数字对应的英文单词，只提供1-5之内的。
 * 分析：由于用户输入的数字是不确定的，所以需要定义一个变量，通过判断变量的值来返回对应的单词
 * @author 徐葳
 *
 */
public class IfDemo6 {
	
	public static void main(String[] args) {
		//接收用户输入的数字
		int num = 10;
		
		/*if(num==1) {
			System.out.println("one");
		}
		
		if(num==2) {
			System.out.println("two");
		}*/
		
		if(num==1) {
			System.out.println("one");
		}else if(num==2) {
			System.out.println("two");
		}else if(num==3) {
			System.out.println("three");
		}else if(num==4) {
			System.out.println("four");
		}else if(num==5) {
			System.out.println("five");
		}else {
			System.out.println("输入错误！");
		}
		
		
	}

}
