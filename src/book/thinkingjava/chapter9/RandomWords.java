package book.thinkingjava.chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 举例说明  接口
 * readable 接口  是单独为 Sanner 创建的
 * @author HENC
 *
 */
public class RandomWords implements Readable {

	
	private static Random rand = new Random();
	private static String character ="ABCDEFGHIJKLMNOPQRSTUVWXYZZ";
	private static final char[] capitals = 
			character.toCharArray();
	private static final char[] vowels = 
			"aeiou".toCharArray();
	private static final char[] lowers = 
			character.toLowerCase().toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count -- == 0)
			return -1;  //indicates end of input
		
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0 ; i< 4 ;i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner( new RandomWords(10));
		while (s.hasNext())
			System.out.println(s.next());
		
	}

}
