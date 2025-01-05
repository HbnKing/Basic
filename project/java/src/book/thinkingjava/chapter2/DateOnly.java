package book.thinkingjava.chapter2;

public class DateOnly {
	int i;
	double d;
	boolean b;
	String a = "";
	@Override
	public String toString() {
		return "DateOnly [a=" + i + ", d=" + d + ", b=" + b + "]";
	}
	
	
	public static void main(String[] args) {
		DateOnly dateOnly = new DateOnly();
		dateOnly.i = 47;
		dateOnly.d = 1.1;
		dateOnly.b = true;
		
		System.out.println(dateOnly.toString());
	}

}
