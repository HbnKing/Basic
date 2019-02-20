package book.thinkingjava.chapter9;

import java.book.thinkingjava.chapter9.Brass;
import java.book.thinkingjava.chapter9.Instrument;
import java.book.thinkingjava.chapter9.Note;
import java.book.thinkingjava.chapter9.Percussion;
import java.book.thinkingjava.chapter9.Stringed;
import java.book.thinkingjava.chapter9.Wind;
import java.book.thinkingjava.chapter9.WoodWind;

public class Music5 {

	static void tune(java.book.thinkingjava.chapter9.Instrument i) {
		i.play(java.book.thinkingjava.chapter9.Note.MIDDLE_C);
	}
	static void tuneAll(java.book.thinkingjava.chapter9.Instrument[] e) {
		for(java.book.thinkingjava.chapter9.Instrument i :e)
			tune(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InstrumentA aaa= new InstrumentA();
		//抽象类   接口  都不能实例化
		
		java.book.thinkingjava.chapter9.Instrument[] orchestra = {
				new java.book.thinkingjava.chapter9.Wind(),
				new java.book.thinkingjava.chapter9.Percussion(),
				new java.book.thinkingjava.chapter9.Stringed(),
				new java.book.thinkingjava.chapter9.Brass(),
				new java.book.thinkingjava.chapter9.WoodWind(),
		};
		
		tuneAll(orchestra);
	}

}
//abstract class Instrument
//接口 使用interface  声明
interface InstrumentA{
	//public  int i ;  
	//接口  和抽象类 都不能实例化   
	//接口内  类属性  public static final
	/**
	 * public: 使接口的实现类可以使用这个常量
	 * static：static修饰就表示它属于类的，随的类的加载而存在的，如果是非static的话，
    	就表示属于对象的，只有建立对象时才有它，而接口是不能建立对象的，所以
    	接口的常量必须定义为static
    	final：final修饰就是保证接口定义的常量不能被实现类去修改，如果没有final的话，
    	由子类随意去修改的话，接口建立这个常量就没有意义了。
    	
	 */
	 int  i = 9; //public static final
	 void play(java.book.thinkingjava.chapter9.Note n); //抽象方法  没有方法体{}  全部默认为public
	 void adjust();
}

class WindA implements InstrumentA {
	//实现接口的    抽象方法必须重写  方法体
	@Override
	public void play(java.book.thinkingjava.chapter9.Note n){
		System.out.println(this +".play()" +n);
	}
	@Override
	public String toString() {return  "Wind"; }
	@Override
	public void adjust() {
		System.out.println(this +".adjust()");
	}

}
class PercussionA implements InstrumentA{

	@Override
	public void play(java.book.thinkingjava.chapter9.Note n) {
		// TODO Auto-generated method stub
		System.out.println(this +".play()" +n);
	}
	@Override
	public String toString() {return  "Percussion"; }
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}

class StringedA  implements InstrumentA{

	@Override
	public void play(java.book.thinkingjava.chapter9.Note n) {
		// TODO Auto-generated method stub
		System.out.println(this +".play()" +n);
	}
	@Override
	public String toString() {return  "Stringed"; }

	@Override
	public void adjust() {
		System.out.println(this +".adjust()");
		
	}
	
}
class BrassA extends WindA{
	@Override
	public String toString() {return  "Brass"; }
	
}
class WoodWindA extends WindA{
	@Override
	public String toString() {return  "WoodWind"; }
}
