package book.thinkingjava.chapter9;
import static net.mindview.util.Print.*;


public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while(s.move());  //一直调用
	}
	
	public static  void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}

}

interface Game{ boolean move();}
interface GameFactory{Game getGame();}

class Checkers implements Game{

	private int moves = 0;
	private static final int MOVES = 3;
	@Override
	public boolean move() {
		print("Checkers move" +moves);
		return ++moves !=MOVES;
	}
	
}

class CheckersFactory implements GameFactory{

	@Override
	public Game getGame() {
		
		return new Checkers();
	}
	
}

class Chess implements Game{
	private int moves = 0;
	private static final int MOVES = 4;
	@Override
	public boolean move() {
		print("Chess move" +moves);
		return ++moves !=MOVES;
	}
}

class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {
	return  new Chess();
	}
	
}