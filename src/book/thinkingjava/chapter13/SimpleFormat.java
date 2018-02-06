package book.thinkingjava.chapter13;

/**
 * formatter类
 * @author Wangheng
 *
 */ 
public class SimpleFormat {

	
	public static void main(String[] args) {
		int x = 5;
		double y = 5.23434;
		System.out.println(x + " " + y);
		System.out.format("Row 1 :[%d %f] \n", x , y);
		System.out.printf("Row 1 :[%d %f] \n", x , y);
		
		//format()  printf() 是等价的
	}

}
