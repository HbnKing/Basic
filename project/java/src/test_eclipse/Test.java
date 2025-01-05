package test_eclipse;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str1 = "hello"+"xxx";
			String  str2 = "hello"+"xxx";
			System.out.println(str1 ==str2);
			String str3 ="world";
			String str4 = "helloworld";
			System.out.println(str1 ==str2);
			
			str1 =str1+str3;
			str2 =str2+str3;
			//System.out.println(str1);
			//System.out.println(str2);
			System.out.println(str1 ==str2);
			System.out.println(str1==str4);
			}

}
