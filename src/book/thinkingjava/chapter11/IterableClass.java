package book.thinkingjava.chapter11;

import java.util.Iterator;

/**
 *  implements Iterable<> 
 * @author HENC
 *
 */
public class IterableClass implements Iterable<String>{

	public static void main(String[] args) {
		for(String s: new IterableClass()) {
			System.out.println(s);
			
		}
	}

	protected String [] words = ("what a big  petter "
			+ " thing  we like to do ").split(" ");
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			public void remove() {
				//--------------
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
