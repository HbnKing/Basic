package book.thinkingjava.chapter15;

import net.mindview.util.Generator;

public class BasicGenerator<T> implements Generator {

	public Class<T> type;
	public BasicGenerator(Class<T> type) {this.type = type;}
	
	@Override
	public Object next() {
		try {
			return  type.newInstance();
			}catch(Exception e) {
			throw new RuntimeException(e);
			}
	}
	public static <T> Generator<T> create(Class<T> type){
		
		return new BasicGenerator<T>(type);
	}

}
