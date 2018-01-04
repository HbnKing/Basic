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
	 * 引用的参数  虽然 可以不写 final 修饰 词   ; 但是他还是要求final;
	 * 同样的  不能修改值。只能打印输出或赋值给其他变量。
	 * @param dest
	 * @return
	 */
	public Destination destination(String dest) {
		//如果我们试图修改 该变量   则会报错 
		//  !dest ="";
		//Local variable dest defined in an enclosing scope must be final or effectively final
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
