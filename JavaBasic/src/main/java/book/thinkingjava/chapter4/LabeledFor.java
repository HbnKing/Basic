package book.thinkingjava.chapter4;

import static net.mindview.util.Print.*;

/**
 * 标签   与 break continue  
 * 跳转至  标签位置  continue 继续迭代 或者  break  不再迭代
 * @author HENC
 *
 */

// For loops with labeled break and labeled continue
public class LabeledFor {
	
	public static void main(String [] args) {
		int i = 0;
		outer:  //cant have statements here
		for(; true ; ) { //infinite loop
			inner:  // cant have statements here
			
			for(; i<10 ; i++) {
				print("i =" +i);
				if(i == 2 ) {
					print("continue");
					continue ;
				}
				if(i == 3 ) {
					print("break");
					i++ ; //Otherwise i never
					break ;
				}
				if(i == 7 ) {
					print("continue outer");
					i++;  //Otherwise i never
					continue outer;  //跳出循环  到达outer   位置  且继续循环
				}
				
				if(i == 8 ) {
					print("break  outer");
					break  outer;   //跳出循环  到达outer   位置  且不再循环
				}
				
				for(int k =0; k<5 ; k++) {
					if(k==3) {
						print("continue inner");
						continue inner;
					}
					
				}
				
				
			}
		}
	}

}
