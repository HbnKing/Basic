package book.thinkingjava.chapter10;

import innerclasses.Contents;
import innerclasses.Destination;
/**
 * 10.7 嵌套类
 * @author HENC
 * 普通的内部类 隐式的包含了一个引用  ,指向创建他的外围类;
 * 而当 内部类是static  就不是这样了
 *
 *1.要创建嵌套类的对象 ,并不需要其外围类的对象.
 *2.不能从嵌套类的对象中访问非静态 的外围类对象.
 */
public class Parcel11 {

	private static class ParcelContents implements Contents{
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	}
	protected static class ParcelDestination 
	implements Destination{

		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
		
		public static void f() {}
		static int x = 10;
		static class AnotherLevel{
			public static void f() {}
			static int x = 10;
		}
	}
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {

		/**
		 * z这里我们 发现不需要再实例化 任何  Parcel11 相关的  对象
		 * 就可以创建  他的 内部类    
		 * 使用了static　修饰了　
		 * 与　非ｓｔａｔｉｃ　方法中的ｔｈｉｓ使他类似一个ｓｔａｔｉｃ　
		 */
		Contents c = contents();
		Destination d= destination("tasmaia");
	}

}
