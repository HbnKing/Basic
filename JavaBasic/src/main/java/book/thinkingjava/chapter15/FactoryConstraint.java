package book.thinkingjava.chapter15;

/**
 * 
 * 一个显式的工厂模式
 * 获得了编译期的检查
 * @author Wangheng
 *
 */
public class FactoryConstraint {

	public static void main(String[] args) {
		new Foo2<Integer> (new IntegerFactory());
		new Foo2<Widget> (new Widget.Factory());
	}

}

interface IFactory<T>{
	T create();
}

class Foo2<T>{
	private T x;
	
	//只接受  IFactory  的实现类
	public <F extends IFactory<T> > Foo2(F factory){
		x = factory.create();
	}
}

class IntegerFactory implements IFactory<Integer> {

	@Override
	public Integer create() {
		// TODO Auto-generated method stub
		return new Integer(0);
	}
}

class Widget{
	public static class Factory implements IFactory<Widget>{

		@Override
		public Widget create() {
			return new Widget();
		}
	}

		
}

