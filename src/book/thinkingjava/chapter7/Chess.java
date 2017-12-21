package book.thinkingjava.chapter7;

/**
 * 有参数的构造方法如何执行  
 * 必须使用关键字super 
 *  显式 的调用基类的构造器的语句
 * @author HENC
 *
 */
public class Chess extends BoardGame {

	Chess() {
		super(11);
		// TODO Auto-generated constructor stub
		System.out.println("Chess Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chess x = new Chess();
	}

}

class Game{
	Game(int i){
		System.out.println("Game Constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
		
	}
}
