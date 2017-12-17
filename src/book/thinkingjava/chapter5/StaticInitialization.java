package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 静态 初始化 执行顺序
 * 先执行类中静态的初始化   --
 * 该对象的构造方法  --
 * 普通对象的初始化 ---
 * 在执行本类的构造方法 --
 * @author HENC
 * 注意 虽然构造器没有 使用static  实际上也是构造方法
 */
public class StaticInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("creating new Cupboard() in main");
		new Cupboard();
		print("creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	static Table table = new  Table();
	static Cupboard cupboard = new Cupboard();

}

class Bowl{
	Bowl(int market){
		print("Bowl ("+market +") ;");
	}
	void f1(int market) {
		print("f1 (" +market +") ;");
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		print("Talble( )");
		bowl2.f1(1);
	}
	void f2(int market) {
		print("f2 ("+market+ ")");
	}
	static Bowl bowl2 = new Bowl(2);
	
}

class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new  Bowl(4);
	Cupboard(){
		print("Copboard ()");
		bowl4.f1(2);
	}
	void f3(int market) {
		print("f3 (" +market +");");
		
	}
	static Bowl bowl5 = new Bowl(5);
}


