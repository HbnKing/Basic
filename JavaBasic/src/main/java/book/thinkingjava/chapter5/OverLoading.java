package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 相同的   方法名   只有   参数不同
 * 不能根据返回值类型来区别    比如  system.out.println(  function(a))
 * 方法 的重载   overloading
 * 
 * 类型的提升     如果  无法找到接收char类型的构造方法  会直接提升至  int 类型
 * 如果实际类型大与参数类型     需要  窄化处理   显式转化该类型 否则会报错 
 * 
 * @author HENC
 *
 */

public class OverLoading {
	int height;
	OverLoading() {
		print("Plant a  seeding");
		height = 0;
	}
	
	OverLoading(int  initialHeight){
		height = initialHeight;
		print("Creating new OverLoading that is " +height + "feet tall");
		
	}
	
	void info() {
		print("OverLoading  is " +height + "feet tall");
	}
	void info(String s) {
		print(s +"OverLoading  is " +height + "feet tall");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 0 ; i<5 ; i++) {
			OverLoading t = new OverLoading(i);
			t.info();
			t.info("overloaded method");
		}
		new OverLoading();
	}

}
