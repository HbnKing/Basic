package book.thinkingjava.chapter15;

/**
 * 檫除补偿
 * @author Wangheng
 * 显示的传递你的类型的class 对象
 * @param <T>
 */
public class ClassTypeCapture<T> {
	Class<T > kind ;
	public ClassTypeCapture(Class<T > kind) {
		this.kind = kind;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public static void main(String [] arg) {
		ClassTypeCapture<Building> ctt1 =
				new ClassTypeCapture<Building> (Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		
		ClassTypeCapture<House> ctt2 =
				new ClassTypeCapture<House> (House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
		
		/*true
		true
		false
		true*/
	}
	
}

class Building{}
class House extends Building{}
