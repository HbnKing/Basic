package book.thinkingjava.chapter5;

/**
 * 定义枚举类时 会自动创建 tostring() 方法 显示每个enum 实例的名字
 * 创建 ordinal() 方法 表示enum 声明的顺序 
 * static values() 产生这些常量构成的数组
 * @author HENC
 *
 */
public class SimpleEnumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spiciness howHot = Spiciness.MEDIUM;
		//创建enum  类时  会自动添加tostring() 方法
		//还会创建ordinal() static values() 方法
		System.out.println(howHot);
		
		for(Spiciness s: Spiciness.values())
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
