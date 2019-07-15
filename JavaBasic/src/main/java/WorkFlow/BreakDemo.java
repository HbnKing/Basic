/**
 * break
 * @author 徐葳
 *
 */
public class BreakDemo {
	public static void main(String[] args) {
		for(int x=0;x<3;x++) {
			if(x==1) {
				//跳出这个循环，其实就是结束这个for循环的执行
				break;
				//System.out.println("x");//break后面的代码是执行不到的，所以不能再它后面写代码
			}
			System.out.println("x="+x);
		}
	}

}
