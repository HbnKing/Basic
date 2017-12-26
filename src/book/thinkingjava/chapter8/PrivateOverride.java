package book.thinkingjava.chapter8;

import static net.mindview.util.Print.*;

/**
 * private 方法的重载的   
 * 和向上转型 会出现问题
 * 
 * @author HENC
 *
 */
public class PrivateOverride {

	private void f() {    //public  方法不受影响
		print("private f()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateOverride po = new Derived();
		po.f();
		// private f()
	}

}
class Derived extends PrivateOverride{
	
	public void f() {
		print("public f()");
	}
}
