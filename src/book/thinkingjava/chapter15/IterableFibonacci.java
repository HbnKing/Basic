package book.thinkingjava.chapter15;

import java.util.Iterator;
/**
 * 
 * 
 * @author Wangheng
 *
 */
public class IterableFibonacci  extends Fibonacci  implements Iterable<Integer>{

	private int n;
	public IterableFibonacci(int count) {
		this.n = count;
	}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove() {
				//----------
			}
			
		};
	}
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18)) {
			
			System.out.print(i+ " " +10);
		}
		
	}

}
