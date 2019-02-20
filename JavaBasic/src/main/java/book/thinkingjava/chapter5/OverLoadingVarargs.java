package book.thinkingjava.chapter5;

public class OverLoadingVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a','b','v');
		f(1);
		f(2,1);
		f(0);
		f(0l);
		//f();  没有参数类型的时候就不知道用哪个方法了
		//这个时候需要 增加一个区分参数

	}
	
	static void f(Character...args) {
		System.out.println("first");
		for(Character c:args)
			System.out.print("char :"+c);
		System.out.println("length :"+args.length);
		
	}
	static void f(Integer...args) {
		System.out.println("second");
		for(Integer c:args)
			System.out.print("int"+c);
		System.out.println("length :"+args.length);
		
	}
	static void f(Long...args) {
		System.out.println("third");
		for(Long c:args)
			System.out.print("long:"+c);
		System.out.println("length :"+args.length);
		
	}

}
