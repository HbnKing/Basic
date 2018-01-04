package book.thinkingjava.chapter10;

import innerclasses.Contents;
import innerclasses.Destination;


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
