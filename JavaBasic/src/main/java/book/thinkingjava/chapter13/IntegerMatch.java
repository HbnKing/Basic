package book.thinkingjava.chapter13;

/**
 * 正则匹配的基本练习
 * @author Wangheng
 *
 */
public class IntegerMatch {

	public static void main(String[] args) {

		System.out.println("-12345".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d++"));
		System.out.println("-233".matches("-?\\d+"));
		
		/**
		 * -? 表示前面可能有一个负号
		 * d++ 表示有一个或者多个
		 * |表示或者的意思
		 */
	}

}
