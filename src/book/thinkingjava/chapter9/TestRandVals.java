package book.thinkingjava.chapter9;

import static net.mindview.util.Print.*;

import java.util.Random;
/**
 * 测试 接口  域的 初始化  
 * @author HENC
 *
 */
public class TestRandVals implements RandVals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(RandVals.RANDOM_INT);
		print(RandVals.RANDOM_LONG);
		print(RandVals.RANDOM_FlOAT);
		print(RandVals.RANDOM_DOUBLE);
		print(RandVals.RANDOM_INT);
		print(RandVals.RANDOM_LONG);
		print(RandVals.RANDOM_FlOAT);
		print(RandVals.RANDOM_DOUBLE);
		print("____________________");
		TestRandVals test = new TestRandVals();
		print(test.RANDOM_INT);
		print(test.RANDOM_LONG);
		print(test.RANDOM_FlOAT);
		print(test.RANDOM_DOUBLE);
		print(test.RANDOM_INT);
		print(test.RANDOM_LONG);
		print(test.RANDOM_FlOAT);
		print(test.RANDOM_DOUBLE);
		
	}

}

interface RandVals{
	Random RAND =new Random();
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong()*10;
	float RANDOM_FlOAT = RAND.nextFloat()*10;
	double RANDOM_DOUBLE = RAND.nextDouble()*10;
	
}

class OtherClass{
	static Random RAND =new Random();
	static int RANDOM_INT = RAND.nextInt(10);
	static long RANDOM_LONG = RAND.nextLong()*10;
	static float RANDOM_FlOAT = RAND.nextFloat()*10;
	static double RANDOM_DOUBLE = RAND.nextDouble()*10;
}
