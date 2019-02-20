package book.thinkingjava.chapter15;


/**
 * 一个简单的泛型数组包装器
 * @author Wangheng
 * @param <T>
 *
 */
public class GenericArray<T> {

	private T [] array;
	@SuppressWarnings("unchecked")
	public GenericArray(int sz) {
		//这里定义的是一个Object 【】  数组
		array = (T[]) new Object[sz] ;
	}
	public void put(int index,T item ) {
		array[index] = item;
	}
	
	public T get (int index) {
		return array[index];
	}
	
	public T[] rep() {return  array;}
	public static void main(String[] args) {
		GenericArray<Integer> ga1 = 
				new GenericArray<Integer>(100);
		//Integer [] ia = ga1.rep();
		// java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast
		Object [] oa = ga1.rep();
		System.out.println(oa);

	}

}
