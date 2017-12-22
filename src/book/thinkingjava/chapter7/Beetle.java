package book.thinkingjava.chapter7;

/**
 * 先执行 父类的静态  变量方法
 * 本类 的静态  变量 方法 
 * 类的基本参数初始化  基本类型为0  引用类型为null
 * 父类的构造方法
 * 本类的构造方法
 * 
 */
import static net.mindview.util.Print.*;
public class Beetle extends Insect{
	
	private int k = printInit("Beetle.k initialized");
	Beetle(){
		print("k = "+k);
		print("j = " +j);
	}
	private static int x2 = 
			printInit(" static Beetle.x2 initialized");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beetle b = new Beetle();
	}

}
class Insect {
	private  int i = 9;
	protected int j;
	Insect(){
		print("i = " +i +", j ="+ j);
		j = 39;
	}
	private static  int x1 = 
			printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		print(s);
		return 47;
	}
	
}
