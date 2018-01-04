package book.thinkingjava.chapter10;
import static net.mindview.util.Print.*;

/**
 * 10.6 再访工厂方法
 * 利用  匿名内部类  改写 工厂方法
 * @author HENC
 *
 */
public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s =fact.getService();
		s.method1();
		s.method2();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
	}

}

interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{
	private Implementation1() {}
	@Override
	public void method1() {
		print("Implementation1 method1");
	}
	@Override
	public void method2() {
		print("Implementation1 method2");	
	}
	public static ServiceFactory factory =
			new  ServiceFactory() {
				@Override
				public Service getService() {
					return new Implementation1();
				}
	};
}

class Implementation2 implements Service{
	private Implementation2() {}
	@Override
	public void method1() {
		print("Implementation2 method1");
	}
	@Override
	public void method2() {
		print("Implementation2 method2");	
	}
	public static ServiceFactory factory =
			new  ServiceFactory() {
				@Override
				public Service getService() {
					return new Implementation2();
				}
	};
}
