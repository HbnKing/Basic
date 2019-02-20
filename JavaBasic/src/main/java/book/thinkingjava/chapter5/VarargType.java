package book.thinkingjava.chapter5;

public class VarargType {
	
	static void f(Character...args) {
		System.out.print(args.getClass());
		System.out.println("length :"+args.length);
		
	}
	
	static void g(int...args) {
		System.out.print(args.getClass());
		System.out.println("length :"+args.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f('a');
		f();
		g(1);
		g();
	}

}

/*class [Ljava.lang.Character;length :1
class [Ljava.lang.Character;length :0
class [Ilength :1
class [Ilength :0*/
//[ 表示 后面跟着的是一个类型的数组  
//I表示这个一个int类型
