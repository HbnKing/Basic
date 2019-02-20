package book.thinkingjava.chapter7;
/**
 * final修饰过的 f() 方法
 * 防止 其他继承类修改他的含义 
 * 确保在继承中  方法的行为保持不变 而且不会被覆盖
 * 
 * private 隐式的包含了 final 的意义
 * 可以private 和final  可以一起使用  但并没有额外的意义
 * @author HENC
 *
 *
 *final 关键字可以用来修饰类 
 * 被  final 修饰类不可以被继承
 *final 类 中所有的方法 被隐式的指定为final 
 *
 */

public class FinalOverridingIllusion{
	
	public static void main(String [] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op = op2; 
		// method 方法均不可用
		// ! op.f();
		// ! op.g();
		WithFinals wf = op2;
		//same  here
		// ! wf.f();
		// ! wf.g();
		
	}
}

class OverridingPrivate2  extends OverridingPrivate{
	public  final void f() {
		System.out.println("OverridingPrivate2  f()");
	}
	//@Override
	public void g() {
		System.out.println("OverridingPrivate2  g()");
	}
}
class OverridingPrivate  extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate  f()");
	}

	private void g() {
		System.out.println("OverridingPrivate  g()");
	}

}
class WithFinals{
	private final void f() {
		System.out.println("WithFinals  f()");
	}
	private void g() {
		System.out.println("WithFinals  g()");
	}
}
