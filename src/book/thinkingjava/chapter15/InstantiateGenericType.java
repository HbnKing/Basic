package book.thinkingjava.chapter15;


/**
 * 尽量创建类型实例
 * @author Wangheng
 *
 */
public class InstantiateGenericType {
	public static void main(String [] args) {
		ClassAsFactory<Employee> fe = 
				new ClassAsFactory<Employee>(Employee.class);
		
		System.out.println("ClassAsFactory<Employee>  succeed" );
		
			try {
				ClassAsFactory<Integer> f1 = 
						new ClassAsFactory<Integer>(Integer.class);
			}catch(Exception e) {
				System.out.println("failed");
			}
			/*ClassAsFactory<Employee>  succeed
			failed*/
		
			//只是因为 Integer 没有默认的构造器   
			//建议使用显示的工厂  并限制其类型 ，使其只能接受 实现了这个工厂的类
	}
	
	
	public static void main() {}
}

class Employee{}
class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}