package book.thinkingjava.chapter7;

/**
 * 继承  父类的方法   super 关键字
 * @author HENC
 *
 */
public class Detergent extends Cleanser{
	//这个 变量定义没啥用  ,用的都是父类的变量
	private String s = "Detergent";
	//可以在 构造方法里 修改父类的变量   s 的值
	//使用super 关键字
	Detergent(){
		//变量 s 不能是私有的
		//一般继承  变量全部私有化   方法全部公开 
		super.s = "Detergent";
	}
	
	//改变父类的方法
	public void scrub() {
		append("Detergent.srub");
		super.scrub();
	}
	
	public void foam() {
		append("foam()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Detergent x = new Detergent();
		x.dilute();		//父类的方法
		x.apply();		//父类的方法
		x.scrub();		//重写的父类的方法
		x.foam();		//本类特有的方法
		System.out.print(x);
	}

}

class Cleanser{
	
	//private String s = "Cleaner";
	String s = "Cleaner";
	public void append (String a) {
		s += a;
	}
	public void dilute() {
		append("dilute()");
	}
	public void apply() {
		append("apply()");
	}
	public void scrub() {
		append("scrub()");
	}
	
	public String toString() {
		return s;
	}
	
	//每个类都可以拥有main() 方法   方便调用
	//但是  只有程序入口的main() 会被使用
	public static void main() {
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.print(x);
	}
}
