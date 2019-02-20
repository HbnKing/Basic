package book.thinkingjava.chapter2;

import java.book.thinkingjava.chapter2.StaticTest;

/**
 * 静态方法可以直接调用
 * 不用创建对象,使用类名.静态方法名即可调用
 * 静态变量  只有一个存储空间  多个对象 同享一个静态变量
 */

public class Icreamentable {
	static void icreament(){
		java.book.thinkingjava.chapter2.StaticTest.i++;
	}
	static int geti(){
		return java.book.thinkingjava.chapter2.StaticTest.i;
	}
	
	public static void main(String[] args) {
		Icreamentable i1 = new Icreamentable();
		Icreamentable i2 = new Icreamentable();
		Icreamentable.icreament();
		System.out.println(Icreamentable.geti());
		System.out.println(Icreamentable.geti());
		Icreamentable.icreament();
		Icreamentable.icreament();
		System.out.println(Icreamentable.geti());
		int c = StaticTest.i++;
		System.out.println(Icreamentable.geti());
		
	}
}


