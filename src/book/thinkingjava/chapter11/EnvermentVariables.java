package book.thinkingjava.chapter11;

import java.util.Map;

/**
 * 2018 -01 -29
 * 11章  利用迭代器获取 系统环境变量
 * @author Administrator
 *
 */
public class EnvermentVariables {

	public static void main(String[] args) {

		for(Map.Entry entry :System.getenv().entrySet()  ) {
			//System.getenv().entrySet()  返回一个 map
			System.out.println(entry.getValue() + " : "+entry.getValue()  );
			
		}
	}

}
