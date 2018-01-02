package book.thinkingjava.chapter9;

/**
 * abstract 修饰的class 和method  为抽象类 和抽象方法 
 * 抽象类可以继承  
 * 抽象的方法 没有方法体 
 * 抽象类的子类 必须重写  基类 抽象方法
 * @author HENC
 * 抽象类是  普通类 和  接口  之间的中庸之道
 */
public class Music4 {

	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument [] e) {
		for(Instrument i :e)
			tune(i);
	}
	public static  void main(String [] args) {
		Instrument [] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new WoodWind(),
		};
		
		tuneAll(orchestra);
		//Instrument aa = new  Instrument();
		//抽象 类不能实例化   
	}
}

abstract class Instrument{
	private int i ;
	public abstract void play(Note n); //抽象方法  没有方法体{}
	public String what() {return  "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	//继承 抽象类 之后  抽象类的  抽象方法必须重写  方法体
	@Override
	public void play(Note n){
		System.out.println("Wind.play()" +n);
	}
	@Override
	public String what() {return  "Wind"; }
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
	}

}
class Percussion extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Percussion.play()" +n);
	}
	@Override
	public String what() {return  "Percussion"; }
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}

class Stringed  extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Stringed.play()" +n);
	}
	
	@Override
	public String what() {return  "Stringed"; }

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}
class Brass extends Wind{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Brass.play()" +n);
	}
	@Override
	public String what() {return  "Brass"; }

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}
class WoodWind extends Wind{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("WoodWind.play()" +n);
	}
	@Override
	public String what() {return  "WoodWind"; }

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	
}
enum Note{
	MIDDLE_C , C_SHARP , B_FLAT ;
}