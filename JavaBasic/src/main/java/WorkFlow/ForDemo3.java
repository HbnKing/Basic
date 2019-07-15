package WorkFlow;

/**
 * for练习题
 * 2：统计1-100中6的倍数的个数
 * @author 徐葳
 *
 */
public class ForDemo3 {
	public static void main(String[] args) {
		int count = 0;//记录次数
		for(int x=1;x<=100;x++) {
			if(x%6==0) {
				count++;//出现一次+1
			}
		}
		
		System.out.println("count="+count);
	}

}
