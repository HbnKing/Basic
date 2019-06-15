package String;

import java.util.Scanner;

public class StringwithInitcap {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
			System.out.println("�������ַ���:");
			String str = sc.nextLine();
			//String str ="hello World";
			System.out.println(initcap(str));
		}

		private static String initcap(String str) {
			// TODO Auto-generated method stub
			return  str.substring(0,1).toUpperCase()+str.substring(1);
		}
		
}
