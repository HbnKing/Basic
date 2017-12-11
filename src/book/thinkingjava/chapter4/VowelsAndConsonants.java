package book.thinkingjava.chapter4;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * switch  语句是实现多路选择的   
 * 每一个case  后面需要跟一个 break ;如果没有 他会继续执行 其他的case 语句  ,
 * 直到遇到break   为止
 * 注意  default  没有 break   但是加上也是个好习惯 尽管没用
 * 
 * 支持 int char  那样的字符  1.8 以后支持string
 * 
 * 
 * 
 * @author HENC
 *
 */
public class VowelsAndConsonants {
	
	public static void main(String[] args) {
		Random random = new  Random();
		
		for(int i = 0; i<100; i++) {
			int c = random.nextInt(26)  +'a';
			print( (char)c +","+ c +":");
			
			switch(c) {
			case 'a':
			case 'b':print("********");
			case 'c':
			case 'd': 
			case 'u':  //''""  单双引号不同
				print("vowel");
				break;
				
			case 'w':
				print("Sometime a vowel");
				break;
			default : print("consontant");
				break ;
			}
			
			
		}
	}

}
