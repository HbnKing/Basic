package book.thinkingjava.chapter7;

public class Frog extends Amphibian{
	private String name;
	@Override
	public void changeName( String nm) {
		this.name = nm;
		System.out.println("Frog name");
	}
	public void ddodod() {}
	
	

	public static void main(String [] args) {
		Amphibian x = new Frog();
		x.changeName("");
		Frog w = new  Frog();
		x.printName(w);
		
		
	}
}

class Amphibian{
	private String name;
	public void changeName( String nm) {
		this.name = nm;
		System.out.println("Amphibian name");
	}
	

	public void printName(Amphibian i) {
		System.out.println("Amphibian printName");
	}
}

/*
给你举个例子吧：一个普通汽车Car类具有run方法，该方法的作用是输出一句话“我每小时跑100公里”；另有一个子类FlyCar，即会飞的汽车，该类把run方法重写了，输出的是“我每小时跑200公里”，又多了一个fly方法，输出“我每小时飞500公里”，然后再main函数中，定义一个Car的对象car1=new FlyCar（）；具体代码如下：
class Car{
    public void run(){System.out.println("我每小时跑100公里");}
}
class FlyCar extends Car{
    public void run(){System.out.println("我每小时跑200公里");}
    public void fly(){System.out.println("我每小时飞500公里");}
    public static void main(String args[]){
        Car car1=new Car();
        Car car2=new FlyCar();
        car1.run();//这里 会输出我每小时跑100公里
        car2.run();//这里 会输出我每小时跑200公里
        car2.fly();//这句话错，不能执行
    } 
}
解释：
car1就是一个普通的Car类的对象，所以肯定输出我每小时跑100公里
car2虽然也是Car类的对象，但他的身体（也就是内存中的表示）是用new FlyCa（）创建的，所以身体里确实有fly方法，而且run方法也是FlyCar中定义的方法（因为子类把父类的同名方法进行了覆盖，即内存里没有了父类方法），但是由于car2的变量类型是Car类型，所以它只认为自己就是一个普通的Car，只知道自己具有run方法，根本不可能知道自己还有fly方法。所以它可以调用run方法，但是执行的是子类定义的run方法，但它不知道自己具有fly方法，当然也不能调用了。给你举个例子吧：一个普通汽车Car类具有run方法，该方法的作用是输出一句话“我每小时跑100公里”；另有一个子类FlyCar，即会飞的汽车，该类把run方法重写了，输出的是“我每小时跑200公里”，又多了一个fly方法，输出“我每小时飞500公里”，然后再main函数中，定义一个Car的对象car1=new FlyCar（）；具体代码如下：
class Car{
    public void run(){System.out.println("我每小时跑100公里");}
}
class FlyCar extends Car{
    public void run(){System.out.println("我每小时跑200公里");}
    public void fly(){System.out.println("我每小时飞500公里");}
    public static void main(String args[]){
        Car car1=new Car();
        Car car2=new FlyCar();
        car1.run();//这里 会输出我每小时跑100公里
        car2.run();//这里 会输出我每小时跑200公里
        car2.fly();//这句话错，不能执行
    } 
}
解释：
car1就是一个普通的Car类的对象，所以肯定输出我每小时跑100公里
car2虽然也是Car类的对象，但他的身体（也就是内存中的表示）是用new FlyCar（）创建的，所以身体里确实有fly方法，而且run方法也是FlyCar中
*/
