package book.thinkingjava.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 11.10
 * MAP  将对象映射的对象
 * @author HENC
 * 
 */
public class Statistics {

	public static void main(String[] args) {

		Random rand = new Random();
		Map<Integer,Integer> m = new  HashMap<Integer,Integer>();
		
		for(int i =0 ; i<10000 ; i++) {
			int r = rand.nextInt(20);
			Integer freq  = m.get(r);
			m.put(r, freq == null ? 1 :freq+1);
		}
		System.out.println(m);
	}

}
