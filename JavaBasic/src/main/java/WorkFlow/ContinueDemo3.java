package WorkFlow;

/**
 * continue
 * @author 徐葳
 *
 */
public class ContinueDemo3 {
	
	public static void main(String[] args) {
		w:for(int x=0;x<3;x++) {
			q:for(int y=0;y<4;y++) {
				System.out.println("x="+x);
				continue w;
			}
		}
	}

}
