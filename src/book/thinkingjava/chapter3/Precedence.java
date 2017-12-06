package book.thinkingjava.chapter3;

/**
 * 操作符优先级
 * @author HENC
 *
 */

public class Precedence {
	
	public static void main(String[] args) {
		int [] i = {1,2,3,};
		System.out.println(i.length);
		
		
		//可以将一个常数  等赋值给一个变量  但是 不能把任何一个东西赋给一个常数  ,常数不能作为左边值
		int x = 1, y =2,z =3;
		int a = x +y -2/2 +z;
		int b = x +(y-2)/(2+z);
		System.out.println(a +" "+b);  //output a = 5  b =1
		System.out.println("a =" +a++ +"b =" + ++b);  //output a = 5 b =2
		
		//system.out.println()如果内部有字符串  使用"+"意味着字符串连接   如果当中有不是string类型 ,那么他就会把其他类型转为字符串  
	}

}
