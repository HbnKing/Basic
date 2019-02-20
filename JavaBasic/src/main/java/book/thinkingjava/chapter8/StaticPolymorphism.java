package book.thinkingjava.chapter8;

/**
 * 静态方法  直接与 类关联  与类的对象无关
 * 静态方法  不能重写  
 * @author HENC
 *
 */
public class StaticPolymorphism {

	
	public static void main(String[] args) {

		StaticSuper sup = new StaticSub();  //UPcasting
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}

}
class StaticSuper{
	public static String staticGet(){
		return "Base staticGet()";
	}
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper{
	//@Override
	//静态 方法不能重写
	//静态方法 是与类直接 关联 而不是 类的某一个对象
	public static String staticGet(){
		return "Derived staticGet()";
	}
	@Override
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

