package book.thinkingjava.chapter12;
/**
 * 12.8.3 异常缺失
 * @author Wangheng
 *
 */
public class LostMessage {

	void f() throws VeryImportantExxception{
		throw new VeryImportantExxception();
	}
	
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void main(String[] args) {
	try {
		LostMessage lm = new LostMessage();
		
		try {
			lm.f();
			//抛出VeryImportantExxception
		} finally{
			lm.dispose();
			//再finally 中也有异常抛出 HoHumException
		}
		
	}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class VeryImportantExxception extends Exception{
	public String toString() {
		return "A Very Important Exxception";
	}
}
class HoHumException extends Exception{
	public String toString() {
		return "A trivial Exxception";
	}
}