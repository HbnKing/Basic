package book.thinkingjava.chapter5;

public class PassingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().eat(new Apple());
	}

}
//人
class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("yummy");
	}
}
//苹果
class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);  //传入的为这个苹果本身的引用
	}
}
//削皮   这是一个工具类   一般放在外部    方法一般为静态方法
class Peeler{
	
	static Apple peel(Apple apple) {
		Apple applewithPeel = new Apple();
		return  applewithPeel ;
	}
}