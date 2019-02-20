package book.thinkingjava.chapter7;

import static net.mindview.util.Print.*;

/**
 * 继承 不仅可以使用父类的继承来的方法 
 * 还可以重写  父类的同名方法 修改其返回类型  
 * 
 * 可以使用override 注释来 确保使用的是父类已有的方法
 * 
 * @author HENC
 *
 */
public class Hide {

	public static void main(String [] args) {
		Bart b = new  Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}


class Homer{
	char doh(char c) {
		print("doh(char) ");
		return c;
	}
	
	float doh(float f) {
		print("doh(float) ");
		return f;
		
	}
}

class Milhouse{}

class Bart extends Homer{
	//@Override
	//此处由于返回类型不匹配   会报错
	void doh(Milhouse m) {
		print("Milhouse m");
	}
	@Override
	float doh(float f) {
		print("doh(float) ");
		return f;
	}
}
