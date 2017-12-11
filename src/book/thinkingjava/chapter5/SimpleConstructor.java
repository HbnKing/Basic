package book.thinkingjava.chapter5;

public class SimpleConstructor {
	
	public static void main (String[] args) {
		
		for(int i =0;i<10 ; i++) {
			new  Rock(i);
		}
	}

}

class Rock{
	//构造方法名 必须与类名完全一致   自动加载
	//构造器  ----初始化    没有的话系统自动调用默认的构造器
	Rock(){ 
		System.out.println( "rock");
	}
	//有参数的构造方法    至少有一个构造方法()
	//这个是方法的重载
	Rock(int i){
		System.out.println( "rock" +i);
	}
}
