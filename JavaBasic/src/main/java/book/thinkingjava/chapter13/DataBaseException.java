package book.thinkingjava.chapter13;

public class DataBaseException extends Exception {

	public DataBaseException(int tid, int queryid,String message) {
		super(String.format("(t%d, q%d) %s", tid,queryid,message));
	}
	public static void main(String[] args) {
		try {
			throw new DataBaseException(3 ,7,"write failed");
		}catch(Exception e) {
			System.out.println(e);
		}

		
	}

}
