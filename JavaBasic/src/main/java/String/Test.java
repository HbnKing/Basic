package String;

public class Test {
	public static void main(String[] args) {
		// 转义字符的形式 \
		// 注意：不是所有字符都可以转义，只有固定的部分字符可以转义
		System.out.println("\"hello world!\"");
		System.out.println("\\hello world!\\");
		System.out.println("hello\nworld!");
		// 换行符
		/*
		 * linux 换行符：\n
		 * windows 换行符：\r\n 【注意：从windows10开始记事本也支持\n】
		 * 在eclipse中这两种形式都支持
		 */
		
		//注意：转义字符在使用的时候，需要定义在单引号或者双引号中
	}

}
