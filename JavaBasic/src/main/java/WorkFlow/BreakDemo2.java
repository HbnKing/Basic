/**
 * break
 * @author 徐葳
 *
 */
public class BreakDemo2 {
	public static void main(String[] args) {
		for(int x=0;x<3;x++) {
			for(int y=0;y<4;y++) {
				System.out.println("x="+x);
				break;//跳出当前循环
			}
		}
	}

}
