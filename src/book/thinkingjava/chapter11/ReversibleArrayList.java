package book.thinkingjava.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 11.13.1
 * 适配器的习惯用法
 * @author Administrator
 *
 * @param <T>
 * 
 *说明 Iterable <> 的构造方法包含了 Iterator <> 
 *
 */
public class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) { super(c);}
	public Iterable<T> reversed(){
		return  new Iterable<T>() {
			@Override
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current  = size() -1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1 ;
					}

					@Override
					public T next() {
						// TODO Auto-generated method stub
						return get(current --);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}

		};
		
	}
}
