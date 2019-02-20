package book.thinkingjava.chapter9;

/**
 * 接口组合 中的 的方法重名问题  可能带来的问题 
 * 继承和  接口 重名   
 * 接口和接口重名 
 * @author HENC
 *
 *继承和  接口相同方法  以继承  为主  
 *继承和  接口  同名不同返回类型和参数  各自实现各自方法
 *
 *多个接口相同 方法 会写一个 
 *多个接口  同名  同参数不同返回类型 会报错 
 *多个接口 同名  同返回类型  不同参数   可以共存
 *
 */

interface I1{ void f();}
interface I2{ int f(int i);}
interface I3{ int f();}
interface I4{ int f();}

class C{ 
	public int f() {return 1;}
}
class C2 implements I1,I2{

	@Override
	public void f() {
		// TODO Auto-generated method stub
	}

	@Override
	public int f(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}

class C3 extends C implements I2{

	@Override
	public int f(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class C4 extends C implements I3{
	
}

public class SameMethodInterface {

}
