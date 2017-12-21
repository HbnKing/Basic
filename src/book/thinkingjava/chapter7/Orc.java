package book.thinkingjava.chapter7;

/**
 * protected 只提供了包内部的访问权限
 * protected权限是一种严格程度介于public和private之间的权限，
 * 具有prtoected权限的域和方法只能对其自身和导出类可见
 * @author HENC
 *
 */
public class Orc extends Villain{
	
	private int orcNumber;
	public Orc(String name,int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	public void change (String name , int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}
	public String toString() {
		return "Orc  " +orcNumber +":  " +super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc("Limburger" , 12);
		Orc orc1 = new Orc("ger" , 1211);
		System.out.println(orc);
		orc.change("Bob", 12);
		System.out.println(orc1);
		System.out.println(orc);
		System.out.println(orc);
		Villain v = new Villain("");
		
	}

}

class Villain{
	private String name;
	protected void set(String nm) {
		this.name = nm;
	}
	public Villain(String name) {
		this.name =name;
	}
	public String toString() {
		return "Villain  de  name is :" +name;
	}
}
