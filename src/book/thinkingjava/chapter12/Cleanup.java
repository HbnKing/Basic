package book.thinkingjava.chapter12;

import java.io.FileNotFoundException;

/**
 * 12.8
 * @author Wangheng
 * 分层处理异常   构造方法异常还是 处理过程中的异常
 */
public class Cleanup {

	public static void main(String[] args) {

		try {
			InputFile in = new InputFile("Cleanup");
			try {
				String s ;
				int i = 1;
				while((s =in.getLine())!=null) {
					
				}
			}catch(Exception e) {
				System.out.println("Caught Exception(in main)");
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}	
		} catch (Exception e) {
			System.out.println("inputFile construction failed");
			e.printStackTrace();
		}
	}

}
