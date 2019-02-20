package book.thinkingjava.chapter10;

import static net.mindview.util.Print.*;

/**
 * 局部内部类   不能有访问说明符   因为他不是外围类   但是他不是  外围类的一部分  
 * 但是他可以访问 当前代码块内的常亮  以及此外围类的所有成员  
 * 
 * 例子比较局部内部类  和匿名 内部类
 * @author HENC
 * 
 * 使用局部内部类而不使用匿名内部类的 理由  就是需要不止一个对象
 * 我们需要 重载 构造器    而匿名内部类只能用于 实例的初始化
 *
 */
public class LocaLInnerClass {

	private int count  = 0;
	Counter getCounter(final String name) {
		//局部内部类 
		//不能有访问修饰符   如 public  default
		class LocalCounter implements Counter{
			public LocalCounter() {
				print("LocalCounter");
			}
			@Override
			public int next() {
				printnb(name);
				return count++;
			}
		}
		
		return new LocalCounter();
	}
	//---------------------
	Counter getCounter2(final String name) {
		return new Counter() {
			{print("Anonymous Counter");}
			@Override
			public int next() {
				printnb(name);
				return count++;
			}
		};
	}
	
	//-----------------------
	
	public static void main(String[] args) {
		LocaLInnerClass lic = new LocaLInnerClass();
		Counter 
			c1 = lic.getCounter("local innner"),
			c2 = lic.getCounter2("Anonymous inner");
			for(int i = 0 ;i<5 ;i++)
				print(c1.next());
			for(int i = 0 ;i<5 ;i++)
				print(c2.next());
		
	}

}


interface Counter{
	int next();
}
