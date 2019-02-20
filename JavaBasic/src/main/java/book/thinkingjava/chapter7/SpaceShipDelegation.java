package book.thinkingjava.chapter7;

import java.book.thinkingjava.chapter7.SpaceShipControls;

/**
 * 代理解决了子类继承父类的所有的方法 所产生的问题
 * 
 * 代理  在类内部 实例化一个 需要继承类的对象 
 * 并重写需要的父类的方法
 * 方法内用父类实例化的对象来调用父类的方法
 * 
 * @author HENC
 *代理  Delegation
 */
public class SpaceShipDelegation {
	
	private String name;
	private java.book.thinkingjava.chapter7.SpaceShipControls contorls = new java.book.thinkingjava.chapter7.SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
		
	}
	//Delegation method
	public void back(int velocity ) {
		contorls.back(velocity);
	}
	public void down(int velocity) { 
		contorls.down(velocity);
	}
	public void left(int velocity) { 
		contorls.left(velocity);
	}
	void right(int velocity) { 
		contorls.right(velocity);
	}
	public void forward(int velocity) { 
		contorls.forward(velocity);
	}
	public void turboBoost(int velocity) { 
		contorls.turboBoost(velocity);
	}
	public String toString() {
		return name;
	}

	public static void main(String [] args) {
		SpaceShipDelegation protector = 
				new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}

}
