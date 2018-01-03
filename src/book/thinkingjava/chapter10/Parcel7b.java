package book.thinkingjava.chapter10;

import innerclasses.Contents;
/**
 * 匿名 内部类   的   向上转型
 * @author HENC
 *
 */
public class Parcel7b {
	
	class MyContents implements Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	public Contents Contents() {
		//通过new 表达式 反悔的引用  被直接自动的向上转型为Contents 的应用
		return new  MyContents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel7b p = new Parcel7b();
		Contents c = p.Contents();
	}

}
