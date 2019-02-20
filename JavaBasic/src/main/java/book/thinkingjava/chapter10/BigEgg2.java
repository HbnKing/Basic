package book.thinkingjava.chapter10;

import static net.mindview.util.Print.*;

/**
 * 10.10内部类  不能被重写   但是可以继承内部类
 * @author HENC
 *
 */

public class BigEgg2 extends Egg2 {
	
	
	public class Yolk extends Egg2.Yolk{
		
		// !@Override  
		public Yolk() {
			print("BigEgg2.yolk");
		}
		@Override
		public void f() {
			print("BIGEgg2.yolk.f()");
		}
	}
	
	public BigEgg2() {
		print("New BIGEgg2");
		
		//Egg2 的方法
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
		e2.g();
	}

}
class Egg2{
	public Egg2() {
		print("New Egg2");
	}
	protected class Yolk{
		public Yolk() {
			print("Egg2.yolk");
		}
		public void f() {
			print("Egg2.yolk.f()");
		}
	}
	private Yolk y = new Yolk();
	
	
	public void insertYolk(Yolk yy) {y =yy;}
	//调用子类的发f(); 方法
	public void g() {y.f();}
}