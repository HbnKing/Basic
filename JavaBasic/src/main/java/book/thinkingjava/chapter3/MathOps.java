package book.thinkingjava.chapter3;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * 算术运算符
 * @author HENC
 *
 */
public class MathOps {
	public static void main(String[] args) {
		
		Random r = new Random();
		int i, j , k;
		long l = System.currentTimeMillis();
		print(l);
		int a =(int) l;
		print(a);
		int imax = Integer.MAX_VALUE;
		print(imax);
		
		//如果调用.nextInt(),-MaxValue到MaxValue,.nextInt(n)才是0到n.
		j =r.nextInt(100);
		print("j="+j);
		k = r.nextInt(100);
		print("k="+k);
		i= j-k;
		print("j-k=" +i);
		i = j+k;
		print("j+k=" +i);
		i = j/k;
		print("j/k=" +i);
		i = j*k;
		print("j*k=" +i);
		i = j%k;
		print("j%k=" +i);
		
		//float number test
		
		float  o, p , q;
		
		//浮点类型的 生成值在 0-1之间
		p =r.nextFloat();
		print("P="+p);
		q = r.nextFloat();
		print("q="+q);
		o= p-q;
		print("p-q=" +o);
		o = p+q;
		print("p+q=" +o);
		o = p/q;
		print("p/q=" +o);
		o = p*q;
		print("p*q=" +o);
		o = p%q;
		print("p%q=" +o);
		
		long le = System.currentTimeMillis();
		print(le-l);
		
		
	}

}
