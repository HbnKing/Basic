package book.thinkingjava.chapter5;


public class OverLoadingVarargs2 {

	
	static void f(Character...args) {
		System.out.println("first");
		for(Character c:args)
			System.out.print("char :"+c);
		System.out.println("length :"+args.length);
		
	}
	static void f(Float i,Character...args) {
		System.out.println("second");
		for(Character c:args)
			System.out.print("char :"+c);
		System.out.println("length :"+args.length);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//这里我使用Float封装类  因为基本类型的重载  会有一些问题  ,最好 两个 方法都加上一个区别值 
		// f(char c ,Character...args) 
		// f(float i,Character...args) 
		
		f('a', 'b');
		f(1f,'a');
	}

}
