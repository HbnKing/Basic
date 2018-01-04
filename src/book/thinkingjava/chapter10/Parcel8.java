package book.thinkingjava.chapter10;

import  innerclasses.Wrapping;

/**
 * 
 * @author HENC
 *
 */
public class Parcel8 {

	public  Wrapping wrapping(int x) {
		//return new Wrapping(x);
		// Base constructor call;
		//使用原始的 构造方法 
		//发现增加了一个参数  x
		return   new  Wrapping(x) {
			//重写 类的普通方法
			@Override
			public int value(){
				return super.value() *47;
			}
		};

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
	}

}
