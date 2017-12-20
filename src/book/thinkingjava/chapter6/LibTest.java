package book.thinkingjava.chapter6;

import net.mindview.simple.*;

/**
 * 当编译器 碰到simple 库的import 语句时 ,就开始在CLASSPATH所指定的目录中
 * 查找子目录  "net\mindview\simple" 
 * 然后从已编译的文件中找出名称相符者 (Vector.class  List.class )
 * 
 * 本书获得的源码包添加到CLASSPATH中即可
 * 
 * @author HENC
 *
 */

public class LibTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		List l = new List();
	}

}
