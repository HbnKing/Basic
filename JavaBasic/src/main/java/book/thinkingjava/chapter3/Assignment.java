package book.thinkingjava.chapter3;

/*
 * 需要将net.mindview.util.Print
 * 导入到项目资源中 source
 */
import static net.mindview.util.Print.*;

public class Assignment {
	public static void main (String[] args) {
		//创建tank 类的两个实例
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 42;
		print("1 t1.level:" +t1.level+"\t"+"t2.level:" + t2.level);
		//两个对象指向相同
		t1= t2;
		print("2 t1.level:" +t1.level+"\t"+"t2.level:" + t2.level);
		//修改一个对象的值 由于直接是引用传递 所以两个都改变了
		t1.level = 27;
		print("3 t1.level:" +t1.level+"\t"+"t2.level:" + t2.level);
	}

}

class Tank{
	int level;
	
}