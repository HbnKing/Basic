package book.thinkingjava.chapter9;

/**
 * 9.5 通过继承来拓展接口  
 * 接口和接口之间通过extends 关键字来拓展接口方法
 * @author HENC
 *
 */
public class HorrorShow {

	static void u(Monster b) { b.menace();}
	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}
	static void w(Lethal l ) { l.kill();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//接口和抽象类都不能直接实例化  
		//DangerousMonster barney = new DangerousMonster();
		//但是可以通过他的实现类实例化
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		//w(barney);
		Vampire vlad =new veryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}

}

/**
 * Monster  接口
 * @author HENC
 *
 */
interface Monster{
	void menace();
}

interface DangerousMonster  extends Monster{
	void destory();
}

interface Lethal{
	void kill();
}

class DragonZilla implements DangerousMonster{
	@Override
	public void menace() {}

	@Override
	public void destory() {	}
	
}

//继承多个接口  
interface Vampire extends DangerousMonster ,Lethal{
	void drinkBlood();
}

class veryBadVampire implements Vampire{

	@Override
	public void destory() {	}

	@Override
	public void drinkBlood() {	}
	@Override
	public void menace() {}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}
}
