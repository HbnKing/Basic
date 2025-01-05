
package muke;
public class HelloWorld5 {
    public static void main(String[] args) {
        
		// 创建对象，对象名为hello
		HelloWorld5 hello = new HelloWorld5();
		
        // 调用方法，传入两门课程的成绩
		hello.calcAvg(94, 81);
	}

	
	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分
	 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 */
    
    private void calcAvg(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println((double) (i+j)/2);
	}
}
