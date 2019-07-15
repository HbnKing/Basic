package WorkFlow;

/**
 * if 双分支
 * @author 徐葳
 *
 */
public class IfDemo3 {
	public static void main(String[] args) {
		int x = 1;
		int y;
		/*if(x>5) {
			y = 100;
		}else {
			y = 200;
		}
		
		System.out.println(y);*/
		
		//使用三元运算符进行改写
		y = (x>5)?100:200;
		System.out.println(y);
	}

}
