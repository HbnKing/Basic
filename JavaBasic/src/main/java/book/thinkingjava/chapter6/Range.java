package book.thinkingjava.chapter6;

public class Range {

	
	//produce a sequence
	public static int[] range(int marker){
		int [] result = new int [marker];
		for(int i = 0; i<=marker; i++) {
			result[i] = i;
		}
		return result;
	}
	public static int[] range(int start ,int end ) {
		int [] result = new int [end-start] ;
		for(int i=0; i< (end-start); i++)
			result[i] = start +i;
		return result;
		
	}
	//
	public static int[] range(int start, int end ,int step) {
		int [] result = new int [(end-start)/step] ;
		for(int i = 0 ; i <(end-start)/step ; i++ )
			result[i] = start +(i*step);
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
