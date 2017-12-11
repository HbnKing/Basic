package book.thinkingjava.chapter3;

/**
 * 位运算符    按二进制 位计算
 * 移位操作符    数字 在二进制位上左右移动
 * @author HENC
 *
 */
public class URShift {
	public static void main(String [] args) {
		
		int a = 0x2a;  //42
		System.out.println(Integer.toBinaryString(a));
		int b = 21; 
		System.out.println(Integer.toBinaryString(b));
		int c = 0x2b;  //43
		System.out.println(Integer.toBinaryString(c));
		int d= 0x2c;  //44
		System.out.println(Integer.toBinaryString(d));
		
		//两个操作数中位都为1，结果才为1，否则结果为0，例如下面的程序段。
		//两个数各个位数相比  均为1  则为1 ,否则为0;
		System.out.println("位运算符  &:" +(a&b));
		System.out.println("位运算符  &:" +(a&c));
		System.out.println("位运算符  &:" +(c&d));
		
		//或运算符用符号“|”表示，其运算规律如下：
		//两个位只要有一个为1，那么结果就是1，否则就为0，下面看一个简单的例子。
		System.out.println("位运算符  |:" + (a|b));  //这两个数二进制完全不相同 所以直接相加了
		System.out.println("位运算符 | :" + (a|c)) ;
		System.out.println("位于算符  | :"+ (d|c));
		
		//非运算符用符号“~”表示，其运算规律如下：
		//如果位为0，结果是1，如果位为1，结果是0，下面看一个简单例子。
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(~a));
		
		//异或运算符
		//异或运算符是用符号“^”表示的，其运算规律是：
		//两个操作数的位中，相同则结果为0，不同则结果为1。下面看一个简单的例子。
		System.out.println("异或运算符  ^:" + (a^b));  //均不相同 则为1 相加了
		System.out.println("异或运算符  ^:" + (b^c));
		
		
		
	//---------------------------------------
		//移位操作符只能用来处理整数类型 (基本类型的一种) 
		//左移位符 << 能按照操作符右边的位数将操作数向左边移动  (在低位补0).
		//右移位 >>   有符号使用符号拓展   符号为正  则在高位插入0   符号为负 则在高位插入1
		//无符号 右移  >>>  是零拓展   无论正负都在高位 插入0
		// >>=  <<= >>>= 移位个数为右侧的值
		int i =-1;
		int i2 =2;
		int t1 = -16;
		int t2 = 64;
		System.out.println("i 的二进制值" +Integer.toBinaryString(i));
		System.out.println("移位操作符  <<:" + (i<<3)); 
		System.out.println("i 的二进制值" +Integer.toBinaryString(i<<3));
		System.out.println("");
		System.out.println("i2 的二进制值" +Integer.toBinaryString(i2));
		System.out.println("移位操作符  <<:"+ (i2<<3));
		System.out.println("i2 的二进制值" +Integer.toBinaryString(i2<<3));
		System.out.println("");
		System.out.println("t1 的二进制值" +Integer.toBinaryString(t1));
		System.out.println("移位操作符  >>:"+(t1>>3) );
		System.out.println("t1 的二进制值" +Integer.toBinaryString(t1<<3));
		System.out.println("");
		System.out.println("移位操作符  >>:"+(t2>>3) );
		
		
		System.out.println("");
		System.out.println("t1 的二进制值" +Integer.toBinaryString(t1));
		System.out.println("移位操作符  >>:"+(t1>>>3) );
		System.out.println("t1 的二进制值" +Integer.toBinaryString(t1>>>3));
		
		System.out.println("");
		int m = 63;
		System.out.println(Integer.toBinaryString(i));
		i <<= m;
		System.out.println(Integer.toBinaryString(i));
		
		
	}

}
