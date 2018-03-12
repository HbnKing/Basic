package book.thinkingjava.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSTION ,MOMENTUM>{}

/**
 * 为什么不同类型  会被认为是相同的类型  ？
 * getTypeParameters() 返回一个TypeVariable 数组
 * 它只是用来 标识 参数占位符的标识符   ，并没有其他的意义；
 * 在使用泛型时   任何具体类型的信息都被 檫除了
 * @author Wangheng
 *
 */
public class LostInformation {
	
	public static void main(String[] args) {
		System.out.println("XXXXX");
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob,Fnorkle> map = new HashMap<>();
		Quark<Fnorkle> quark = new Quark<Fnorkle> ();
		Particle<Long ,Double> p =	new Particle<Long ,Double>();
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				p.getClass().getTypeParameters()));
		
			/*	[E]
				[K, V]
				[Q]
				[POSTION, MOMENTUM]*/
	}

}
