package WorkFlow;

/**
 * if练习题
 * 已知一年有四季，实现功能，根据用户输入的月份，返回所属的季节
 * 
 * 一年四季信息
 * 【3 4 5 ：春季】	【6 7 8 ：夏季】  
 * 【9 10 11：秋季】	【12 1 2：冬季】
 * 
 * @author 徐葳
 *
 */
public class IfDemo8 {
	public static void main(String[] args) {
		int month = 2;
		/*if(month==3) {
			System.out.println("春季");
		}else if(month==4) {
			System.out.println("春季");
		}else if(month==5) {
			System.out.println("春季");
		}*/
		
		if(month==3 || month==4 || month==5) {
			System.out.println("春季");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("夏季");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("秋季");
		}else if(month==12 || month==1 || month==2) {
			System.out.println("冬季");
		}else {
			System.out.println("输入月份错误！");
		}
		
	}

}
