package book.thinkingjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 程序中的直接常量
 * @author HENC
 *
 */

public class Literals {
	public static  void main(String agrs[]) {
		int i1 = 0x2f; //  0x为16进制开头 f 代表15
		print( "i1 :" +Integer.toBinaryString(i1));
		int i2 = 0x2F; //  字母大小写表达意思一样
		print( "i2 :" +Integer.toBinaryString(i2));
		int i3 = 0177;
		print("i3 ：" +Integer.toBinaryString(i3));
		char c = 0xffff; //
		print("c :"+Integer.toBinaryString(c));
		byte b = 0x7f;
		print("b :" + Integer.toBinaryString(b));
		short s = 0x7fff;
		print ("s :"+ Integer.toBinaryString(s));
		
		long n1 = 200l;
		long n2 = 200l;
		long n3 = 200;
		print("n1 :"+Long.toBinaryString(n1));
		print("n2 :"+Long.toBinaryString(n2));
		print("n3 :"+Long.toBinaryString(n3));
		
		
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		
		double d1 = 1d;
		double d2 = 1D;
		
		
	}

}
