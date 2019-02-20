package book.thinkingjava.chapter3;

import static net.mindview.util.Print.*;

public class PassObject {
	static void f(Letter y) {
		//对对象赋值 c 注意 双引号直接为转为string类型  
		y.c = 'z' ;
	}
	static void ff(Letter y) {
		//对对象赋值 c 注意 双引号直接为转为string类型  
		y.f = 1.2f ;
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		print("1:x.c : " + x.c);
		f(x);
		ff(x);
		print("1:x.c : " + x.c +"\t"+x.f);
	}
	

}

class Letter{
	char c;
	float f;
}