package book.thinkingjava.chapter10;

/**
 * 10.3 .this 和 .new
 * .this  内部类回到 外部类  
 * .new  创建内部类的对象
 * @author HENC
 *
 */
public class DotThis {
	void f() {System.out.println("DotThis.f()");}
	public class Inner {
		public DotThis outer() {
			//使用  .this  跳转 到外部类  
			//return new DotThis();}  
			return  DotThis.this;}//返回上级 的类 对象DotThis.this
		
	}
	public Inner inner() {
		return new Inner();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotThis dt = new DotThis();
		Inner dti  = dt.inner();
		//创建内部 类的对象   使用 .new
		Inner aa = dt.new Inner();
		
		dti.outer().f();
		dti.outer().inner();
	}

}
