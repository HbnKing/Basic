package book.thinkingjava.chapter7;

import static net.mindview.util.Print.*;
/**
 * 同时 使用组合 和继承
 * @author HENC
 * 构造方法的执行顺序 
 * 父类 
 * 本类 
 * 引用类实例化 的父类
 * 引用类实例化
 * 
 *  
 *
 */
public class PlaceSetting extends Custom{

	private Spoon sp;
	private Fork fk;
	private Knife kn;
	private DinnerPlate pl;
	
	public PlaceSetting(int i) {
		super(i+1);
		print("PlaceSetting Constructor");
		sp = new Spoon(i+2);
		fk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x = new PlaceSetting(9);
	}

}

class Plate{
	Plate(int i){
		print("Plate Constructor");
	}
}
class DinnerPlate extends Plate{

	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate Constructor");
	}
	
}
//器具  Utensil
class Utensil{
	Utensil(int i){
		print("Utensil  Constructor");
	}
}
class Spoon extends Utensil{

	Spoon(int i) {
		super(i);
		print("Spoon  Constructor");
	}
	
}
class Fork extends Utensil{

	Fork(int i) {
		super(i);
		print("Fork  Constructor");
	}
	
}

class Knife extends Utensil{

	Knife(int i) {
		super(i);
		print("Knife  Constructor");
	}
	
}

class Custom{
	Custom(int i){
		print("Custom  Constructor");
	}

}

