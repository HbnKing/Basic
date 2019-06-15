package new2java;

public class HelloWorld2 {
    
    public static void main(String[] args) {
		// 创建对象，对象名为hello
		 HelloWorld2 hello = new HelloWorld2();
        
		// 调用方法
		HelloWorld2.showMyLove();
		HelloWorld2.showMyLove();
	}

	/*
	 * 定义无参无返回值的方法
	 */
	public   static    void showMyLove() {
		System.out.println("我爱慕课网!");
	}
}