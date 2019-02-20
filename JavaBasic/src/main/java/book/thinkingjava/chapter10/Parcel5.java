package book.thinkingjava.chapter10;

import innerclasses.Destination;

/**
 * 内部类  定义在方法内部  
 * 这样这个类 只能被该方法使用   
 * @author HENC
 *
 */
public class Parcel5 {

	public Destination destination(String S) {
		//类定义在方法 内  
		//PDestination 类时  Destination 方法的一部分   而不是 parcel5的一部分
		//除了此方法外 不能访问PDestination类
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			public String readLabel() {
				return label;
			}
		}
		
		return new PDestination(S);
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("tasmania");
	}
	

}
