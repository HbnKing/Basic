package book.thinkingjava.chapter15;

/**
 * 创建一个类来实现 链表的功能
 * 顺序存取
 * @author Wangheng
 * @param <T>
 *
 */
public class LinkedStack<T> {

	//类本身还包含本类对象
	private static class Node<U>{
		U item;
		Node<U> next;
		//构造方法初始化
		Node() {
			item = null ;
			next = null;
		}
		Node(U item , Node<U> next){
			this.item = item;
			this.next = next;
		}
		boolean isEnd() {
			return item == null &&next ==null;
		} 
	}
	private Node<T> top = new  Node<T>() ;
	public void push(T item) {
		top = new Node<T>(item ,top );
		
	}
	//不断的移位
	public T pop() {
		T result  = top.item;
		if( ! top.isEnd()) 
			top = top.next;
		return result;
	}
	public static void main(String [] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s : "hfaiuhf ndfaif feadoej adfadf 33 fd!".split(" ") )
			lss.push(s);
		String s = null;
		while((s = lss.pop()) !=null)
			System.out.println(s);
	}
}
