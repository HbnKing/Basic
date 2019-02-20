package book.thinkingjava.chapter11;

import java.util.LinkedList;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 11.8 stack  通常指先进后出的容器   也被称为叠加栈
 * 先进后出的模型   LIFO
 * @author HENC
 *以 LinkedList 为例 说明 栈  
 *
 * @param <T>
 */
public class Stack <T>{
	private LinkedList<T> storage  = new LinkedList<T>();
	public void push(T v) {storage.addFirst(v);}
	public T peek() {return storage.getFirst();}
	public T pop() { return storage.removeFirst();}
	public boolean empty() {return storage.isEmpty();}
	public String toString () {return storage.toString();}

}


