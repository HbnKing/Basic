package book.thinkingjava.chapter7;

public class Frog extends Amphibian{
	private String name;
	@Override
	public void changeName( String nm) {
		this.name = nm;
		System.out.println("Frog name");
	}
	public void ddodod() {}
	
	

	public static void main(String [] args) {
		Amphibian x = new Frog();
		x.changeName("");
		
		Frog w = new  Frog();
		x.printName(w);
		
		
	}
}

class Amphibian{
	private String name;
	public void changeName( String nm) {
		this.name = nm;
		System.out.println("Amphibian name");
	}
	

	public void printName(Amphibian i) {
		System.out.println("Amphibian printName");
	}
}