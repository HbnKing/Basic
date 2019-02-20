package book.thinkingjava.chapter6;

/**
 * 使用到的单例模式  
 * private  外部 无法使用
 * @author HENC
 *
 */
public class Lunch {
	public static void main(String [] args) {
		//不能直接创建  soup1  soup2
		//Soup1 s1 = new Soup1();
		//但是可以访问类中的静态方法
		Soup1 s1 = Soup1.makeSoup();   //返回一个新的对象
		Soup2 s2 = Soup2.access();		//返回已经初始化的  static 对象
	}

}

class Soup1{
	private Soup1() {} //私有化
	public static Soup1 makeSoup() {
		return new Soup1();
	}
	
}
class Soup2{
	private Soup2() {}
	//私有化后 只能在本类内   创建本类对象
	private static Soup2 sp2 = new Soup2();
	public static Soup2 access() {
		return sp2;
	}
}
