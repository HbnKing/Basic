package book.thinkingjava.chapter5;

public class SimpleEnumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spicness howHot = Spicness.MEDIUM;
		//创建enum  类时  会自动添加tostring() 方法
		//还会创建ordinal() static values() 方法
		System.out.println(howHot);
		
		for(Spicness s: Spicness.values())
			System.out.println(s + ",ordinal "+s.ordinal());
		//	ordinal()  取值 和定义时的顺序保持一致
		/*MEDIUM
		NOT,ordinal 0
		MILD,ordinal 1
		MEDIUM,ordinal 2
		HOT,ordinal 3
		FLAMING,ordinal 4*/
	
	}

}
