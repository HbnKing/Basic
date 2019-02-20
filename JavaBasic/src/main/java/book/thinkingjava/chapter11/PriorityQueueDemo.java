package book.thinkingjava.chapter11;

import java.book.thinkingjava.chapter11.QueueDemo;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeMap;

/**
 * PriorityQueue 有序的队列
 * 
 * 可以通过修改  comparator 比较器 来约定 排序先后顺序
 * integer string character 
 * 这几个类可以与 PriorityQueue 一起工作是因为  其内部 已经实现了comparater来改变书序
 * @author HENC
 *
 */
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> priority = new PriorityQueue<Integer>();
		
		Random random = new Random(47);
		for(int i = 0 ;i<10 ;i++) {
			priority.offer(random.nextInt(i+10));
		}
		//打印根据 大小排序
		QueueDemo.printQ(priority);
		
		new TreeMap();
	
	}

}
