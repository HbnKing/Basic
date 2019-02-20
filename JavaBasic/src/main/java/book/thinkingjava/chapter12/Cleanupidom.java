package book.thinkingjava.chapter12;

/**
 *  异常和构造器
 * @author Wangheng
 *
 */
public class Cleanupidom {

	public static void main(String[] args) {
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			
		}finally {
			nc1.dispose();
		}
		
		System.out.println("*************");
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		
		try {
			
		}finally {
			nc2.dispose();
			nc3.dispose();
		}
		
		System.out.println("*************");

		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					
				}finally {
					nc5.dispose();
				}
			}catch(ConstructionException e) {
				System.out.println(e);
			}finally {
				nc4.dispose();
			}
		}catch(ConstructionException e2) {
			System.out.println(e2);
		}

		
	}
	
}

class NeedsCleanup{
	private static long counter = 1;
	private final long id = counter++;
	public void dispose() {
		System.out.println("NeedsCleanup " +id +"dispose()");
	}
}

class ConstructionException extends  Exception{}
class NeedsCleanup2 extends NeedsCleanup{
	public NeedsCleanup2() throws ConstructionException {
		
	}
}
