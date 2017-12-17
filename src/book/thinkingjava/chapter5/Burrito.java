package book.thinkingjava.chapter5;


/**
 * enum  和 switch case  的结合使用
 * 枚举和  switch case
 * @author HENC
 *
 */
public class Burrito {

	Spiciness degress;
	public Burrito(Spiciness degress) {
		this.degress = degress;
	}
	public void describe() {
		System.out.print("This burrito is ");
		switch(degress) {
		case NOT: System.out.print("not spicy at all ");
			break;
		case MILD:
		case MEDIUM:System.out.print("a little hot ");
			break;
		case HOT:
		case FLAMING:
		default: System.out.print("maybe too hot ");
			break;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Burrito  plain = new Burrito(Spiciness.NOT),
				greenChile = new Burrito(Spiciness.MEDIUM),
				jalapeno = new Burrito(Spiciness.HOT);
		
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}
