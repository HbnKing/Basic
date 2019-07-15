package WorkFlow;

/**
 * if 多分支
 * @author 徐葳
 *
 */
public class IfDemo4 {
	public static void main(String[] args) {
		int a = 3;
		if(a>5) {
			System.out.println("a");
		}else if(a>4) {
			System.out.println("b");
		}else if(a>2) {
			System.out.println("c");
		}else {
			System.out.println("d");
		}
	}

}
