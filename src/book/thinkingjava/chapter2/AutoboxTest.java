package book.thinkingjava.chapter2;

/**
 * 自动装箱拆箱机制
 * @author HENC
 *
 */
public class AutoboxTest {
	public static void main(String[] args) {
		boolean b = false;   char c = 'x';
		byte t = 8;
		short s = 16;
		int i = 32;
		long l = 64;
		float f = 0.32f;
		double d = 0.64;
		Boolean B = b;
		System.out.println("boolean b = " + b);
		System.out.println("Boolean B = " + B);
		Character C = c;
		System.out.println("char c = " + c);
		System.out.println("Character C = " + C);
		Byte T = t;
		System.out.println("byte t = " + t);
		System.out.println("Byte T = " + T);
		Short S = s;
		System.out.println("short s = " + s);
		System.out.println("Short S = " + S);
		Integer I = i;
		System.out.println("int i = " + i);
		System.out.println("Integer I = " + I);
		Long L = l;
		System.out.println("long l = " + l);
		System.out.println("Long L = " + L);
		Float F = f;
		System.out.println("float f = " + f);
		System.out.println("Float F = " + F);
		Double D = d;
		System.out.println("double d = " + d);
		System.out.println("Double D = " + D);
		} 

}