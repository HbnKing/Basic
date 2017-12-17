package book.thinkingjava.chapter5;

/**
 * 可变参数(Object...args)
 * @author HENC
 *
 */
public class NewVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray( new Integer(47), new Float(3.14),
				new Double(11.11),22);
		printArray("one","two","three");
		printArray( new A(),new A(),new A());
		printArray((Object [] ) new Integer[] {1 ,2,3});
		printArray();

	}
	static void printArray(Object...args) {
		for(Object o:args) 
			System.out.print (o +" ");
		System.out.println();
		
		
	}

}
class A{}
