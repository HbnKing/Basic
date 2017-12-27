package book.thinkingjava.chapter8;

/**
 * 协变 返回 类型
 * 
 * 协变类型  允许 返回 更具体的 wheat() 类型
 * @author HENC
 *
 */
public class GovariantReturn {

	public static void main(String[] args) {

		Mill m = new Mill();
		Grain g = new Grain();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}

}

/**
 * 谷物
 * @author HENC
 *
 */
class Grain{
	@Override
	public String toString() {
		return "Grain";
	}
}
/**
 * 小麦
 * @author HENC
 *
 */
class Wheat extends Grain{
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill{
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill{
	Wheat process() {
		return new Wheat();
	}

}

