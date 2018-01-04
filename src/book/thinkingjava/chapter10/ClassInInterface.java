package book.thinkingjava.chapter10;

/**
 * 接口 内部类 
 * @author HENC
 * 正常情况下  不能再接口内部放置任何代码 ,
 * 但嵌套类可以作为接口的一部分   ,你放在接口中的任何类都是public stsatic 
 * 因为类 是static  这样并不违反接口的规则 ;
 *
 */
public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface{
		@Override
		public void howdy() {System.out.println("howdy");}
		public static void main(String [] args) {
			new Test().howdy();
		}
	}

}
