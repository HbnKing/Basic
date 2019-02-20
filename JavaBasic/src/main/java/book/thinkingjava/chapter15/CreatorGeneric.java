package book.thinkingjava.chapter15;


/**
 * 模板方法设计模式 
 * get()  是 模板方法
 * 而 create () 实在子类中定义  用来产生子类型的对象
 * @author Wangheng
 *
 */
public class CreatorGeneric {

	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
/*
		X*/
	}

}

abstract class GenericWithCreate<T>{
	final T element;
	GenericWithCreate() {element = create();}
	abstract T create();
}

class X {}
class Creator extends GenericWithCreate<X>{
	@Override
	X create() {
		// TODO Auto-generated method stub
		return new 	X();
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}


