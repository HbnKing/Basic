package book.thinkingjava.chapter10;

/**
 * 从多层嵌套中访问外部类的成员  
 * 一个内部类被嵌套多少 层并不重要  
 * 他能透明的访问 所有他说嵌入的 外部类的所有成员   
 * @author HENC
 *
 */
public class MultiNestingAccess {

	public static void main(String[] args) {

		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaaB = mnaa.new B();
		mnaaB.h();
	}

}

class MNA{
	private void f() {}
	class A{
		private void g() {}
		public class B{
			//-------
			void h() {
				g() ;
				f();
			}
		}
	}
}
