package javabasic;

/**
 * 数据类型转换
 * @author 徐葳
 *
 */
public class Demo7 {
	public static void main(String[] args) {
		//特殊情况1  自动类型转换
		int x = 10;
		byte y = 5;
		x = x + y;//在这里其实内部进行了数据类型的转换操作，把y的byte类型转换为了int类型
		System.out.println(x);
		
		//特殊情况2  强制类型转换
		byte m = 3;
		m = (byte)(m + 5);// 手工进行指定，进行强制转换
		System.out.println(m);
		
		//特殊情况3
		char ch = 'a';
		System.out.println('a');//a
		System.out.println(ch+1);//char类型和int类型求和，char会被转成int类型，
		
		//因为字符串和任何数据做+运算，都不是加法的意思，这个+号在这是一个连字符
		//任何数据和字符串相连接，都会变成一个新的字符串
		System.out.println("a"+1);//a1
		
		
		System.out.println("a"+1+1);//all
		
		System.out.println("a"+(1+1));//a2
		
		//System.out.println(true+1);//这种写法是错误的。布尔类型不能和其他数据进行操作
		
		byte b1=3,b2=4,b;
		
		//b=b1 + b2;//编译时无法确定b1 和b2的值，所以编译失败！
		b=3 + 4;//编译时就可以确定3+4的值，所以编译正确！

		
		
	}

}
