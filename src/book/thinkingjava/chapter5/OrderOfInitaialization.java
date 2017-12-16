package book.thinkingjava.chapter5;

import static net.mindview.util.Print.*;

/**5.7 有构造器初始化
 * 初始化的顺序
 * @author HENC
 *
 */
public class OrderOfInitaialization {
	public static void main(String [] args) {
		House h = new House();
		h.f();
	}

}

class House{
	Window w1 = new Window(1);
	House(){
		//NOW we are in the constructor
		print("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	
	void f() { print("f()")	;}
	Window w3 = new Window(3);
	
	
}

class Window{
	Window(int i){
		print("Window ("+ i +")");
	}
}

/*Window (1)
Window (2)
Window (3)
House()
Window (33)
f()*/

/*初始化一个类  如果这个类调用了其他类  那么全都会被初始化；
执行该类的构造方法  
然后再执行本类的构造方法 
执行构造方法内的 其他类 
最后 调用本类的初始化方法

w3 被定义在了 构造方法的 后部 , 但照样优先执行
如果开始没有初始化 ,那么
构造器 可以使初始化 的执行 得到保证;*/