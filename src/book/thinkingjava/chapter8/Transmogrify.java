package book.thinkingjava.chapter8;

import static net.mindview.util.Print.*;


/**
 * 用继承 来进行设计
 * 更好的方式 是   "组合 "  而不是直接用继承处理
 * 相反 继承在处理时  就需要知道具体的类型
 * @author HENC
 *	状态模式    在运行期间 与不同 的对象重新绑定
 */
public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}

class Actor{
	public  void act() {	}
}

class HappyActor extends Actor{
	@Override
	public  void act() { print("HappyActor");}
}
class SadActor extends Actor{
	@Override
	public  void act() { print("SadActor");}
}
class Stage {
	private Actor actor = new HappyActor();
	public void change() {
		actor = new SadActor();
	}
	public void performPlay() {
		actor.act();
	}
}
