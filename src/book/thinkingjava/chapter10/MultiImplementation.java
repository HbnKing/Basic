package book.thinkingjava.chapter10;

/**
 * 10.8  为什么需要 内部类 
 * 当 不是 接口的时候 就不能实现多重继承  
 * 内部类就是解决这个问题  多重继承
 * @author HENC
 * 内部类可以有多个实例  ,并且与外围相互独立
 * 单个外围类中可以让多个内部类以不同的方法实现同一个接口
 * 内部类的对象的 时刻 并不依赖与外部类对象的创建
 * 内部类是一个独立的实体
 *
 */
public class MultiImplementation {
	static void takesD(D d) {}
	static void takesE(E e) {}
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
		
	}
}

class D{}
abstract class E{}
class Z extends D{
	E makeE() {
		return new E() {};
	}
}
