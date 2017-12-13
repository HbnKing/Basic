package book.thinkingjava.chapter5;

class Book {

	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	protected void finalize() {
		if(checkedOut) {
			System.out.println("ERROR : check  out");
			
		}
	}

}

public  class TerminationCondition{
	public static void main( String [] args) {
		new Book(true);
		//这个 回收是  偶发的   
		System.gc();
		//ERROR : check  out
		///********
		//ERROR : check  out
		
		Book novel = new Book(true);
		
		System.out.println("********");
		novel.checkIn();
		
		new Book(true);
		System.gc();
		
		
	}
}
