package book.thinkingjava.chapter10;

/**
 * 10.9
 * 内部類的繼承
 * @author HENC
 * 内部類的 構造器 必須指向 其外圍對象的引用
 * 引用必須被初始化 
 * 
 */
public class InheritInner extends WithInner.Inner{
	//No enclosing instance of type WithInner is available due to some intermediate constructor invocation
	// !InheritInner(){	}
	InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new  WithInner();
		InheritInner ii = new  InheritInner(wi);
	}
}

class WithInner{
	//一個内部類
	class Inner{}
}
