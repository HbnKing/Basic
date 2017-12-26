package book.thinkingjava.chapter8;


import static net.mindview.util.Print.*;

/**
 * 
 * @author HENC
 * 这个类中的this  是对象本身   会自动调用  重写的toString() 方法
 */
public class ReferenceCounting {

	public static void main(String[] args) {
		print();
		Shared shared = new Shared();
		Composing [] composing = { new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared),new Composing(shared),
		};
		
		for(Composing c :composing)
			c.dispose();
		
	}

}

class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public void addRef() {	refcount++;	}
	Shared(){
		print("Creating " +this);
	}
	protected void dispose() {
		if(--refcount == 0) {
			print("disposing "+ this);
		}
	}
	public String toString() {
		return "Shared "+ id;
	}
}
class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		print("creating" + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		print("disposing" +this);
		shared.dispose();
	}
	public String toString() {
		return "Composing"+id;
	}
}

