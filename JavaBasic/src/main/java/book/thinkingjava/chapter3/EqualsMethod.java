package book.thinkingjava.chapter3;

public class EqualsMethod {
	public static void main(String[] args) {
		Integer i1 = new Integer(48);
		Integer i2 = new Integer(48);
		//比较的是对象的引用
		System.out.println(i1==i2); //false
		System.out.println(i1!=i2); //true
		//比较的是实际值
		System.out.println(i1.equals(i2)); //true
		//非基本类型比较 
		Value v1 = new  Value();
		Value v2 = new Value();
		v1.a = v2.a = 100;
		//自定义的类没办法直接用equals()方法比较
		
		System.out.println(v1.equals(v2)); //没有重写equals返回值为false
		
	}

}

class Value{
	int a;

	
	//自定义类需要比较 就需要重写equals
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
			return true;
		if((obj == null) || (obj.getClass() != this.getClass()))  
			return false;  
		        // object must be Test at this point  
			Value test = (Value)obj;  
			return a == test.a;
			        
	}
	

	
}
