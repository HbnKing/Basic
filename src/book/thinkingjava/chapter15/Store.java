package book.thinkingjava.chapter15;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

/**
 * 使用范型构建复杂模型
 * 本例子构建一个 零售商店  它包含 走廊 货架和商品
 * 
 * 可以看出是个多层容器
 * @author Wangheng
 *
 */
public class Store extends ArrayList<Aisle>{

	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	public Store(int nAlise ,int nShelves ,int nProducts) {
		for(int i = 0; i< nAlise ; i++)
			add(new Aisle(nShelves , nProducts));
	}
	public String toString() {
		StringBuilder result =  new StringBuilder();
		for(Aisle a: this)
			for(Shelf s: a)
				for(Product p :s) {
					result.append(p);
					result.append("\n");
				}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Store(14 ,5 ,10));
	}
}

class Product {
	private final int id ;
	private String description;
	private double price;
	public Product(int IDNumber ,String descr ,double price) {
		id = IDNumber;
		description = descr;
		this.price = price;
		System.out.println(toString());
	}
	public String toString() {
		return id + ": " +description +" , price $" +price;
	}
	public void priceChange(double change) {
		price += change;
	}
	public static Generator<Product> generator = 
			new Generator<Product> () {
		private Random rand = new Random(47);
		public Product next() {
			return new Product(rand.nextInt(1000) ,"Test" ,
					Math.round(rand.nextDouble()*1000) +0.99);
		}
	};
}

/**
 * 货架
 * @author Wangheng
 *
 */
class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts) {
		Generators.fill(this,Product.generator , nProducts);
	}
}

/**
 * 走道  边上是货架
 * @author Wangheng
 *
 */
class Aisle extends ArrayList<Shelf>{
	public Aisle( int nShelves ,int nProducts) {
		for(int i=0 ; i <nShelves ;i++)
			add(new Shelf(nProducts));
	}
}

class CheckoutStand{}
class Office {}



