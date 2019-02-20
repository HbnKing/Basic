package book.thinkingjava.chapter15;

import java.book.thinkingjava.chapter15.Americano;
import java.book.thinkingjava.chapter15.Breve;
import java.book.thinkingjava.chapter15.Cappuccino;
import java.book.thinkingjava.chapter15.Coffee;
import java.book.thinkingjava.chapter15.Latte;
import java.book.thinkingjava.chapter15.Mocha;
import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class CoffeeGenerator implements Generator<java.book.thinkingjava.chapter15.Coffee> ,Iterable<java.book.thinkingjava.chapter15.Coffee>{
	private Class[] types = {java.book.thinkingjava.chapter15.Latte.class, java.book.thinkingjava.chapter15.Mocha.class, java.book.thinkingjava.chapter15.Cappuccino.class, java.book.thinkingjava.chapter15.Americano.class, java.book.thinkingjava.chapter15.Breve.class};

	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int i) { size = i;}
	public java.book.thinkingjava.chapter15.Coffee next() {
		try {
		return  (java.book.thinkingjava.chapter15.Coffee) types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e) {
		throw new RuntimeException(e);
		}
	}
	@Override
	public Iterator<java.book.thinkingjava.chapter15.Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}
	class CoffeeIterator implements  Iterator<java.book.thinkingjava.chapter15.Coffee>{
		int count  = size;
		public boolean hasNext() {
			return count >0;
		}
		@Override
		public java.book.thinkingjava.chapter15.Coffee next() {
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
