package book.thinkingjava.chapter12;

import java.io.*;
import java.util.logging.*;

/**
 * 12.4.1
 * 异常与记录日志 
 * @author Administrator
 *
 */

class LoggingException extends Exception{
	private static Logger logger = 
			Logger.getLogger("LoggingException");
	public LoggingException() {
	StringWriter trace  = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
	}
}
public class LoggingExceptions {
	public static void main(String [] args) {
		try {
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("Caught " +e);
		}
		try {
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("Caught " +e);
		}

		

		
	}

}
