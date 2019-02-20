package book.thinkingjava.chapter10;

import java.book.thinkingjava.chapter10.Event;
import java.util.ArrayList;
import java.util.List;

public class Contorller {

	private List<java.book.thinkingjava.chapter10.Event> evenList = new ArrayList<java.book.thinkingjava.chapter10.Event>();
	public void addEvent(java.book.thinkingjava.chapter10.Event c) {
		evenList.add(c);
	}
	public void run() {
		while (evenList.size() >0)
			for(java.book.thinkingjava.chapter10.Event e:new ArrayList<Event>(evenList)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					evenList.remove(e);
				}
			}
	}
	

}
