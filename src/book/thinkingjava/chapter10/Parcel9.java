package book.thinkingjava.chapter10;

import innerclasses.Destination;

/**
 * Parcel9 
 *  用final 修饰 外部引用  
 * @author HENC
 *
 */
public class Parcel9 {

	/**
	 * 由传入的参数  dest 来让他 执行初始化操作  .;
	 * @param dest
	 * @return
	 */
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
			
		};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}

}
