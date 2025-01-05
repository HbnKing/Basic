package book.thinkingjava.chapter2;

/**
 * @since 2017年12月1日
 * @author Administrator
 * @version 0.0.1
 */


/*
 * 八大基本类型 不需要初始化 定义时候系统给予默认值
 * 数值型 (整形) 默认值为 0     [int,short.byte,long]
 * 数值型 (浮点型) 默认值为 0.0		[float ,double]
 * 布尔型  默认值为  false		[boolean]
 * 字符型 默认值为  ""		[char]
 * 
 * 注意  String 字符串型不是基本类型
 * String 类是一个类 需要初始化   才能调用类方法  
 * 没有初始化  时为null
 */
public class FundamentalType {
	
	int a ;
	short b;
	byte c;
	long d;
	
	float f;
	double e;
	
	char  g;
	boolean flag;
	
	String s ;
	

	@Override
	public String toString() {
		return "FundamentalType [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", f=" + f + ", e=" + e + ", g=" + g
				+ ", flag=" + flag + ", s=" +s+"]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FundamentalType ft= new FundamentalType();
		System.out.println(ft.a);
		System.out.println(ft.toString());
		
	}

}
