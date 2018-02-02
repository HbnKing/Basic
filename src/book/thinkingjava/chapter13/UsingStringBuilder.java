package book.thinkingjava.chapter13;

import java.util.Random;

/**
 * 
 * StringBuilder 可变容器
 * @author Wangheng
 *
 */
public class UsingStringBuilder {

	 public static Random rand  = new Random();
	 public String toString() {
		 StringBuilder result  = new StringBuilder();
		 for(int i = 0 ; i<25; i++) {
			 result.append(rand.nextInt(100 )+"aa");
			 result.append(", ");
			 
		 }
		 return result.toString();
	 }
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
		
	}

}
