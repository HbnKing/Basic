package book.thinkingjava.chapter4;

/**
 * 练习 for 循环
 * 展示 char 的24字母里的值
 * @author HENC
 *
 */

public class ListCharacters {
	public static void  main(String[] args) {
		for(char c=0;c<128;c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("value:" +(int)c +
						"character:" +c);
			}
		}
		for(char c=0;c<128;c++) {
			if(Character.isUpperCase(c)) {
				System.out.println("value:" +(int)c +
						"character:" +c);
			}
		}
		
	}

}
