package book.thinkingjava.chapter8;


/**
 * 向下转型   和运行 时的  类型识别
 * @author HENC
 *
 */
public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful [] x = {
				new Useful(),
				new MoreUseful(),
		};
		x[0].f();
		x[1].g();
		//Compile time : The method u() is undefined for the type Useful
		//x[1].u();
		((MoreUseful) x[1]).u();  //Downcast   向下转型 
		((MoreUseful) x[0]).u();   //exception  thrown java.lang.ClassCastException  不能向下转型
	}

}

class Useful{
	public void f() {}
	public void g() {}
}

class MoreUseful extends Useful{
	public void f() {}
	public void g() {}
	public void u() {}
	public void v() {}
	public void w() {}
}
