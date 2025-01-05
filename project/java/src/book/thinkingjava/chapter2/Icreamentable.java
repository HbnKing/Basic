package book.thinkingjava.chapter2;

/**
 * 静态方法可以直接调用
 * 不用创建对象,使用类名.静态方法名即可调用
 * 静态变量  只有一个存储空间  多个对象 同享一个静态变量
 */

public class Icreamentable {
	static void icreament(){
		StaticTest.i++;
	}
	static int geti(){
		return StaticTest.i;
	}
	
	public static void main(String[] args) {
		Icreamentable i1 = new Icreamentable();
		Icreamentable i2 = new Icreamentable();
		i1.icreament();
		System.out.println(i1.geti());
		System.out.println(i2.geti());
		i2.icreament();
		Icreamentable.icreament();
		System.out.println(i2.geti());
		int c = StaticTest.i++;
		System.out.println(i1.geti());
		
	}
}


