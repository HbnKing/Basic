package WorkFlow;

/**
 * 练习题
 * 需求：实现计算器，支持两个数字的加减乘除
 * 分析：需要有两个变量保存这两个数字，还需要一个变量保存运算符
 * @author 徐葳
 *
 */
public class SwitchDemo2 {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		
		char ch = '*';
		switch(ch) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default:
				System.out.println("不支持的运算符！");
				break;
		}
		
	}

}
