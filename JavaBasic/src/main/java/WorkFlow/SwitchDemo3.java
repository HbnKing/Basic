package WorkFlow;

/**
 * switch练习题
 * 需求：实现星期的翻译
 * 分析：需要有一个变量保存星期
 * @author 徐葳
 *
 */
public class SwitchDemo3 {
	
	public static void main(String[] args) {
		int week = 3;
		switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			default:
				System.out.println("不支持的数字！");
				break;
		}
	}

}
