package book.thinkingjava.chapter10;

import static net.mindview.util.Print.*;

/**
 * 10.6
 * 优先使用类而不是接口  
 * 如果真的需要 接口你必须 了解他 
 * @author HENC
 *
 */
public class Games {

	public static void playGame(GameFactory fact) {
		Game s =fact.getGame();
		while(s.move());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}

}

interface Game{  boolean move();}
interface GameFactory{ Game getGame();}

class Checkers implements Game{
	//私有化构造方法
	private Checkers() {}
	private int moves = 0;
	private static final int MOVES = 3;
	public boolean move() {
		print("Checkers move" + moves);
		return ++moves != MOVES;
	}
	public static GameFactory factory = new GameFactory() {
		public Game getGame() { return new Checkers();}
	};
}
class Chess implements Game{
	//私有化构造方法
		private Chess() {}
		private int moves = 0;
		private static final int MOVES = 3;
		public boolean move() {
			print("Chess move" + moves);
			return ++moves != MOVES;
		}
		public static GameFactory factory = new GameFactory() {
			public Game getGame() { return new Chess();}
		};
}
