package book.thinkingjava.chapter10;

import java.util.ArrayList;
import java.util.List;

public class Contorller {

	private List<Event> evenList = new ArrayList<Event>();
	public void addEvent(Event c) {
		evenList.add(c);
	}
	public void run() {
		while (evenList.size() >0)
			for(Event e:new ArrayList<Event>(evenList)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					evenList.remove(e);
				}
			}
	}
	

}
