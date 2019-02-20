package book.thinkingjava.chapter7;

/**
 * final 关键字 
 * 基本类型 被指定为final  只能读数  不能修改
 * @author HENC
 *
 */
public class FinalArgument {
	void with(final Gizmo g) {
	  // !g = new Gizmo();
	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

	int g(final int i ) {
		//! i=i+1;
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalArgument bf = new FinalArgument();
		bf.without(null);//(new Gizmo() );
		bf.with(null);
	}

}
class Gizmo{
	public void spin() {}
}
