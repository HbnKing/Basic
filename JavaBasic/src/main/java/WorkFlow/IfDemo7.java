package WorkFlow;

/**
 * if练习题
 * 需求：实现一个翻译功能，用户输入数字，我们给用户提供这个数字对应的英文单词，只提供1-5之内的。
 * 分析：由于用户输入的数字是不确定的，所以需要定义一个变量，通过判断变量的值来返回对应的单词
 * 
 * 增加需求：在之前判断语句的打印语句中增加用户输入的数字
 * @author 徐葳
 *
 */
public class IfDemo7 {
	
	public static void main(String[] args) {
		//接收用户输入的数字
		int num = 5;
		
		/*if(num==1) {
			System.out.println("one");
		}
		
		if(num==2) {
			System.out.println("two");
		}*/
		
		if(num==1) {
			System.out.println(num +" 对应的翻译是：one");
		}else if(num==2) {
			System.out.println(num +" 对应的翻译是：two");
		}else if(num==3) {
			System.out.println(num +" 对应的翻译是：three");
		}else if(num==4) {
			System.out.println(num +" 对应的翻译是：four");
		}else if(num==5) {
			System.out.println(num +" 对应的翻译是：five");
		}else {
			System.out.println(num+" 输入错误！");
		}
		
		
	}

}
