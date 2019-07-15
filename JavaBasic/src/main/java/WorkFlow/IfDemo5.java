package WorkFlow;

/**
 * if的嵌套
 * 其实就是if里面还有if
 * @author 徐葳
 *
 */
public class IfDemo5 {
	
	public static void main(String[] args) {
		int i=1,j=2;
		if(i==1) {
			if(j==1) {
				System.out.println("a");
			}else {
				System.out.println("b");
			}
		}else {
			if(j==1) {
				System.out.println("c");
			}else {
				System.out.println("d");
			}
			
		}
	}

}
