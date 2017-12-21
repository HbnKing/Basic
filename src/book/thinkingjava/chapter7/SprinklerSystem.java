package book.thinkingjava.chapter7;

/**
 * 组合语法 
 * @author HENC
 *对象的初始化可以在
 *1定义的地方 
 *2类的构造器中
 *3在正要 使用这些对象之前
 *4使用实例初始化
 */
public class SprinklerSystem {
	private String value1 ,value2 ,value3,value4;
	private WaterSource  source = new WaterSource(); 
	private int i;
	private float f;
	
	
	//没有赋值的时候初始化会被赋值为NULL  0
	@Override
	public String toString() {
		return "SprinklerSystem [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + ", value4=" + value4
				+ ", source=" + source + ", i=" + i + ", f=" + f + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}

}

class WaterSource{
	private String s;
	WaterSource(){
		System.out.println("WaterSource");
		s= "Costructed";
	}
	public String toString() {
		return s;
	}
}

