package book.thinkingjava.chapter2;


/**
 * 打印从命令行获得的三个参数
 * @author HENC
 *
 */
public class CommandArgTest {
	public static void main (String [] arg) {
		//main 方法获得参数  均为string类型    传入参数时 中间空格会自动过滤    
		
		
	String[] args = new String[3];
		
		//判断参数 是否为空  不为空就比较个数
	if(args==null || args.length !=3) {
		System.err.println("参数格式不对");
		System.exit(-1);
	}
	
	System.out.println( args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);
	
	}

}
