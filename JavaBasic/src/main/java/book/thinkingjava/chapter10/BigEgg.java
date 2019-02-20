package book.thinkingjava.chapter10;

import static net.mindview.util.Print.*;
/**
 * 10.10 内部类可以被覆盖么？？
 * 创建一个内部类  然后集成其外围类 
 * @author HENC
 *
 */
public class BigEgg  extends Egg{

	//！ @Override  此处 有问题    不能被重写 
	//当集成 某个外围类的时候   内部类并没有发生什么神奇的地方  这两个内部类是两个完全 独立的两个实体  各自在自己的命令空间
	protected class Yolk{
		public Yolk() {print("BigEgg.Yolk");}
	}
	public static void main(String[] args) {
		new BigEgg();
		
		//new Egg
		//Egg.Yolk

	}

}
class Egg{
	private Yolk y;
	//创建一个 内部类   yolk 蛋黄 
	protected class Yolk{
		public Yolk() {print("Egg.Yolk");}
	}
	public Egg() {
		print("new Egg");
		y = new Yolk();
	}
}
