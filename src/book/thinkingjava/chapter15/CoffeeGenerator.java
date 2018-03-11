package book.thinkingjava.chapter15;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class CoffeeGenerator implements Generator<Coffee> ,Iterable<Coffee>{
	private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};

	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int i) { size = i;}
	public Coffee next() {
		try {
		return  (Coffee) types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e) {
		throw new RuntimeException(e);
		}
	}
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}
	class CoffeeIterator implements  Iterator<Coffee>{
		int count  = size;
		public boolean hasNext() {
			return count >0;
		}
		@Override
		public Coffee next() {
			count--;
			
			return CoffeeGenerator.this.next();
		}
		public void remove() {
			//---------
			throw new UnsupportedOperationException();
		}
	};
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0 ; i<5 ; i++)
			System.out.println(gen.next());
		for(Coffee c : new CoffeeGenerator(5))
			System.out.println(c);

	}



}
