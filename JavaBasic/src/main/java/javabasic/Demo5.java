package javabasic;

/**
 * 八种基本数据类型
 * @author 徐葳
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		//数据类型		变量名    =  初始化值(常量)
		
		//定义一个byte类型的数据
		byte a = 10;
		a = 5;
		System.out.println(a);//这个是打印变量a的值
		System.out.println("a");//这个是打印字符串a
		
		//注意，byte类型的取值范围在-128~127之间
		//a = 128;//这样定义是错误的，超过了byte的取值范围
		
		int n = 200;
		long l = 300;
		
		//注意：，默认情况下小数是使用double进行存储的，如果想要使用float进行存储，需要在后面添加一个字母f
		// 因为float可能会丢失精度，所以建议使用double类型
		float f = 3.14f;
		double d = 4.12222222;
		
		//注意：char类型只能存储一个字符或者汉字
		char ch = 'a';
		char ch1 = '你';//中文也是支持的
		
		boolean b1 = true;
		boolean b2 = false;
		
	}

}
