package book.thinkingjava.chapter7;

/**
 * 继承的过程中  因为 父类都是  public method 
 * 导致这个实例可以看到其所有的方法
 * 引入的代理 解决这个问题
 * @author HENC
 *
 */

public class SpaceShip extends SpaceShipControls {

	private String name;
	SpaceShip(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return  name ;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpaceShip protector = new SpaceShip("NSEA  Protector");
		protector.forward(100);
		System.out.println(protector);
	}

}

class SpaceShipControls{
	void up(int velocity) { 	}
	void down(int velocity) { 	}
	void left(int velocity) { 	}
	void right(int velocity) { 	}
	void forward(int velocity) { 	}
	void back(int velocity) { 	}
	void turboBoost(int velocity) { 	}
	
}
