package book.thinkingjava.chapter10;

import innerclasses.Destination;

public class Parcel10 {

	public Destination
	destination (String dest, float price) {
		// !dest = "";
		// ! price =1.2f;
		return new  Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost >100)
					System.out.println("Over Budge !");
			}
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasma", 101.2345f);
	}

}
