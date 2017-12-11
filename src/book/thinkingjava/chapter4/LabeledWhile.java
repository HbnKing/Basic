package book.thinkingjava.chapter4;

import  static net.mindview.util.Print.*;

/**
 * 一般continue 退回内层循环的开头 ,并继续执行
 * 带标签的continue 会到达标签的位置 ,并重新进入紧接在哪个标签的位置的循环
 * break 会中断当前的循环
 * 带标签的break  会中断并 跳出 标签所指的循环  .
 * 
 * @author HENC
 *
 */
public class LabeledWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 0;
		outer:   
		while(true) {
			print("outer while loop");
			while(true ) {
				i++;
				print("i= "+i);
				if(i == 1 ) {
					print("continue");
					continue ;
				}
				if(i == 3 ) {
					print("continue outer");
					continue outer;  //跳出循环  到达outer   位置  且继续循环
				}
				if(i == 5 ) {
					print("break");
					break ;
				}
				if(i == 7 ) {
					print("break  outer");
					break  outer;   //跳出循环  到达outer   位置  且不再循环
				}
			}
			
		}
		
		
	}

}
