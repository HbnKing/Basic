package book.thinkingjava.chapter10;

/**
 * 内部类 链接到外部类  
 * 内部类 还拥有 外围类 所有 元素的访问权
 * @author HENC
 *
 */
public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
		
	}

	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {return i==items.length;}
		public Object current() {return items[i];}
		public void next() {if(i<items.length) i++;}
	}
	public Selector selector() {
		return new  SequenceSelector();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sequence sequence = new Sequence(10);
		for(int i = 0; i <10;i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() +"");
			selector.next();
		}
	}

}

interface  Selector{
	boolean  end();
	Object current();
	void next();
}

