package book.thinkingjava.chapter15;

import java.util.ArrayList;

public class Erased<T> {

	private final int SIZE =100;
	public static void f(Object arg) {
		if(arg instanceof T) {}  //error
		T var  = new T();   		//error
		T []  array  =  new T [5] ; 	//error
		T [] arrays = (T) new Object [5];  //unchecked waring
		
	}
}
