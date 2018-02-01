package book.thinkingjava.chapter12;

public class ExceptionSilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		System.out.println("xxxxxxxxxx");
		try {
			throw new RuntimeException();
		}finally{
			return ;
			//本来不处理会自动抛出异常 
			//加入 return ;后 就没有任何输出了
		}
		
		//此处不能添加任何代码
		//System.out.println("qqqqqqqqq");
	}

}
