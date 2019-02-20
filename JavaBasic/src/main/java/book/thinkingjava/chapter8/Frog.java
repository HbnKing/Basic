package book.thinkingjava.chapter8;

import static net.mindview.util.Print.*;
/**
 * 继承与销毁  
 * 对象销毁的顺序应当与其初始化的 顺序相反
 * @author HENC
 *
 */
public class Frog extends Amphibian{
	private Characteristic p = new  Characteristic("Croaks");
	private Description t = new  Description("Eats Bugs");
	Frog(){
		print("Frog()");
	}

	protected void dispose() {
		print("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String [] args) {
		Frog frog = new  Frog();
		print("Bye");
		frog.dispose();
		
	}
}
class Characteristic{
	private String s ;
	Characteristic(String s ){
		this.s  = s ;
		print("creating Characteristic" +s);
	}
	protected void dispose() {
		print("dispose Characteristic" +s);
	}
}


class Description {
	private String s ;
	Description(String s ){
		this.s  = s ;
		print("creating Description" +s);
	}
	protected void dispose() {
		print("dispose Description" +s);
	}
}

class LivingCreature{

	private Characteristic  p = new Characteristic("is alive");
	private Description  t = new Description("Basic Living Creature");
	LivingCreature(){
		print("LivingCreature");
	}
	protected void dispose() {
		print("LivingCreature  dispose");
		t.dispose();
		p.dispose();
	}


}

class Animal extends LivingCreature{
	private Characteristic  p =
			new Characteristic("has heart");
	private Description  t =
			new Description("Animal not vegetable");
	Animal(){
		print("Animal");
	}
	protected void dispose() {
		print("Animal  dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

}

class Amphibian extends Animal{
	private Characteristic  p =
			new Characteristic("can live in water ");
	private Description  t =
			new Description("Both water and land");
	Amphibian(){
		print("Amphibian");
	}
	protected void dispose() {
		print("Amphibian  dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

