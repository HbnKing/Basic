package book.thinkingjava.chapter10;

import innerclasses.Contents;

/**
 * 匿名对象  
 * 例子中contents() 方法 将返回值的类的定义  结合在一起
 * 另外   这个类  是匿名的 他是没有名字的  
 * 
 * @author HENC
 *
 */

public class Parcel7 {
	public Contents contents() {
		//直接返回该对象的  一个匿名对象  
		return  new Contents() {  //insert  a class definition
					private int i = 11;
					@Override
					public int value() {
						return i;
					}
			
		};  //return  返回时需要的分号
	}

	public static void main(String [] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		
	}
}
