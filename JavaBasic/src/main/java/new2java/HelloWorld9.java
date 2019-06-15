package new2java;

import java.util.Arrays;

public class HelloWorld9 {
    
    //完成 main 方法
    public static void main(String[] args) {
    int [] scores = { 89 , -23 , 64 , 91 , 119 , 52 , 73};
    
        score(scores);
    	
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    /*	要求：

	1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73

	2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入

	3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
    */
    private static void score(int[] scores) {
		// TODO Auto-generated method stub
    	Arrays.sort(scores);
    	int num =0;
    	for (int i = scores.length-1; i >=0 ; i--) {
			
			if(scores[i] < 0 ||scores[i]>100) 
				continue;
			
			num++;
			
			if (num>3) {
				break;
				
			}
			System.out.println(scores[i]);
		}
	}
    
    
    
    
    
    
    
    
    
}