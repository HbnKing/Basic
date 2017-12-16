package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;
/**
 * this 关键字   与构造器
 * 构造器调用其他构造器  但是只能调用一个
 * @author HENC
 *
 */
public class Flower {
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals){
		
		print ("constructor  wiht int ");
		petalCount = petals;
		
		
	}
	
	
	Flower(){
		this("hi",47);
		print("default constructor");
	}
	
	
	public Flower(String string, int i) {
		this(i);
		//this(ss);  调用构造器 必须在首行  所以只能调用一个  
		//调用构造器只能在首行
		// TODO Auto-generated constructor stub
		print("constructor  with str and  int");
		this.s= string;
	}


	private void printPetalCount() {
		// TODO Auto-generated method stub
		//this();
		print("petalCount = "+ petalCount +"s = "+s);
		
	}
	public static void main(String [] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}

	

}
