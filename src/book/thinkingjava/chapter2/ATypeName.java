package book.thinkingjava.chapter2;

/*
 * 创建数据类型 类  
 * ATypeName a = new ATypeName();
 */
public class ATypeName {
	String typeName;
	ATypeName(){
	this.typeName= "this is a typeName";
	}
	
	public static void main(String[] args){
		ATypeName a = new ATypeName();
		//String t = a.typeName;
		System.out.println(a.typeName);
		
	}

}
