package book.thinkingjava.chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * 处理一部分异常抛出一部分异常
 * @author Wangheng
 *
 */
public class InputFile {

	private BufferedReader in;
	public InputFile(String fname) throws FileNotFoundException {
		
		try {
			in = new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw e;
		}catch(Exception e){
			try {
				in.close();
			}catch(IOException e2) {
				System.out.println("in.close () unsuccessful");
			}
			throw e;
		}finally {
			
		}
	}
	
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readline ()  failed");
		}
		
		return s;
	}
	
	public void dispose() {
		try {
			in.close();
		} catch (IOException e) {
			throw new RuntimeException("in.close()  failed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
