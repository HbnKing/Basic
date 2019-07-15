/**
 * break
 * 
 * 标号  可以控制让break跳出到某一个循环
 * @author 徐葳
 *
 */
public class BreakDemo3 {
	public static void main(String[] args) {
		w:for(int x=0;x<3;x++) {
			q:for(int y=0;y<4;y++) {
				System.out.println("x="+x);
				break w;//跳出当前循环
			}
		}
	}

}
