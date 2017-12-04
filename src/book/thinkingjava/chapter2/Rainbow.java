package book.thinkingjava.chapter2;

public class Rainbow {
	public static void main(String[] args) {
		AllTheColorOfTheRainbow  rb = new AllTheColorOfTheRainbow();
		rb.anIntegerRepresentingColors = 2;
		rb.hue =2;
		System.out.println(rb.toString());
		
		rb.changeHueOfTheRainbow(15);
		System.out.println(rb.toString());
		rb.changeIntegerRepresentingColors(44);
		System.out.println(rb.toString());
		
	}

}
class AllTheColorOfTheRainbow{
	@Override
	public String toString() {
		return "AllTheColorOfTheRainbow [anIntegerRepresentingColors=" + anIntegerRepresentingColors + ", hue=" + hue
				+ "]";
	}
	int anIntegerRepresentingColors = 0;
	int hue = 0;
	protected  void changeHueOfTheRainbow(int newhue){
		this.hue = newhue;
		
	}
	protected void changeIntegerRepresentingColors(int newcolor) {
		this.anIntegerRepresentingColors = newcolor;
		
	}
}