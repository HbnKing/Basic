package WorkFlow;

/**
 * 9*9乘法表
 * 
 * 1*1=1
 * 1*2=2 2*2=4
 * 1*3=3 2*3=6 3*3=9
 * @author 徐葳
 *
 */
public class ForDemo9 {
	
	public static void main(String[] args) {
		for(int x=1;x<=9;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");//  制表符 \t
			}
			System.out.println();
		}
	}

}
