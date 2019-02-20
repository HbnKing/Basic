package book.thinkingjava.chapter10;
import static net.mindview.util.Print.*;
/**
 * 10.8 闭包与回调
 * @author HENC
 * 在内部类中 实现接口 并返回接口  实例
 *
 */
public class Callbacks {

	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}

}

interface Incrementable{
	void increment();
}
class Callee1 implements Incrementable{

	private int i = 0;
	@Override
	public void increment() {
		i++;
		print(i);
	}
}
class MyIncrement{
	public void increment() {print("other operation");}
	static void f(MyIncrement mi) { print("mi.increment();");}
}
class Callee2 extends MyIncrement{
	private int i=0;
	public void increment() {
		//是个死循环  
		// ! Callee2.this.increment();
		super.increment();
		i++;
		print(i);
	}
	/**
	 * 内部类 实现 接口 
	 * @author HENC
	 *
	 */
	private class Closure implements Incrementable{
		public void increment() {
			Callee2.this.increment();
		}
	}
	//返回接口类
	Incrementable getCallbackReference() {
		return new Closure();
	}
}
class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){ callbackReference = cbh;}
	void go() {callbackReference.increment();}
}
