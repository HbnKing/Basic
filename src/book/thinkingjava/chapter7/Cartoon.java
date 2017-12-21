package book.thinkingjava.chapter7;

/**
 * 继承类的初始化顺序
 * 先初始化话父类的构造方法
 * @author HENC
 *
 */
public class Cartoon  extends Drawing{

	Cartoon(){
		System.out.println("Cartoon construtor");
	}
	public static void main(String [] args) {
		Cartoon  X = new Cartoon();
		
	}
}

class Art{
	Art(){
		System.out.println("Art construtor");
	}
	
}
class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing construtor");
	}
	
}