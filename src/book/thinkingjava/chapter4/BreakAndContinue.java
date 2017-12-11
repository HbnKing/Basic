package book.thinkingjava.chapter4;

import static  net.mindview.util.Range.*;
/**
 * break continue
 * break  退出整个循环体  
 * continue 退出本次循环
 * @author HENC
 *
 */
public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i = 0 ;i <100 ;i++) {
			if(i == 75 ) break;  //out of loop
			if(i%9 !=0) continue;  //next Iteration
			System.out.println(i);
			
		}	
		System.out.println();
		for(int i : range(100)) {
			if(i == 74 ) break;
			if(i%9!= 0 ) continue;
			System.out.println(i);
		}
		
		System.out.println("********");
		int x = 0;
		while(true) {
			x++;
			int y = x*27;
			if(y == 1269) break; 
			if(x % 10 != 0) continue ;
			System.out.println(x);
		}
		
		System.out.println("********");
		x = 0;
		do {
			x++;
			int y = x*27;
			if(y == 1269) break;
			if(x % 10 != 0) continue ;
			System.out.println(x);
			
		}while(true);
	}
	

}
