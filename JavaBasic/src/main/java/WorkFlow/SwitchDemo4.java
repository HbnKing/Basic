package WorkFlow;

/**
 * 改进一年四季的案例
 * @author 徐葳
 *
 */
public class SwitchDemo4 {
	
	public static void main(String[] args) {
		int month = 3;
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("错误的月份！");
				break;
		}
	}

}
