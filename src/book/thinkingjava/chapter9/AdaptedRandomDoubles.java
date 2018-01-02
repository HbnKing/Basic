package book.thinkingjava.chapter9;

import java.nio.*;
import java.util.Scanner;
/**
 * 9.6适配接口 
 * @author HENC
 *
 */

public class AdaptedRandomDoubles extends RandomDoubles implements Readable{

	
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	public int read (CharBuffer cb) {
		if(count -- ==0)
			return -1;
		//父类的next 方法 获取一个 double 类型
		String result = Double.toString(super.next()) +" ";
		cb.append(result);
		return result.length();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		boolean b = s.hasNextDouble();
		while(s.hasNextDouble())
			System.out.println(s.nextDouble() +"");
	}

}
