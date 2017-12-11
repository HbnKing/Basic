package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 相同的   方法名  返回值类型   只有   参数不同
 * 方法 的重载   overloading
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
