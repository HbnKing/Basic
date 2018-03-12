package book.thinkingjava.chapter15;

import java.lang.reflect.Array;

/**
 * 反射 获取 对象数组  
 * 
 * 类型标记class <T > 被传递到构造器 中  
 * 以便从檫除中恢复 
 * @author Wangheng
 *
 * @param <T>
 */
public class GenericArrayWithTypeToken<T> {

	private T [] array;
	@SuppressWarnings("unchecked")
	public GenericArrayWithTypeToken(Class<T> type ,int  sz ) {
		array = (T [])Array.newInstance(type, sz);
	}
	public void put(int index,T item ) {
		array[index] = item;
	}
	
	public T get (int index) {
		return array[index];
	}
	
	public T[] rep() {return  array;}
	public static void main(String[] args) {
		GenericArrayWithTypeToken<Integer> ga1 = 
				new GenericArrayWithTypeToken<Integer>(Integer.class,100);
		Integer [] ia = ga1.rep();
		System.out.println(ia);
		Object [] oa = ga1.rep();
		System.out.println(oa);
	}

}
