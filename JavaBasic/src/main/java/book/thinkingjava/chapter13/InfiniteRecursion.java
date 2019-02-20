package book.thinkingjava.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * 13.3 this 关键字打印的是 对象的地址
 * @author Wangheng
 *
 */
public class InfiniteRecursion {

	@Override
	public String toString() {
		//发生的递归调用   this 调用 自己的toString() 方法  无限循环
		//! return " InfiniteRecursion Address :" +this + " ";
		
		return " InfiniteRecursion Address :" +super.toString() + " ";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		
		for(int i = 0; i < 10 ;i++) {
			v.add( new InfiniteRecursion());
		}
		System.out.println(v);

	}

}
