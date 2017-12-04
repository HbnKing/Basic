package demo;

import java.util.ArrayList;

import javax.swing.text.ChangedCharSetException;

public class Usefulfunc {
		public static void main(String[] args) {
			String [] strs = new String [10];
			strs[0] ="hello";
			//strs[1] = null;
			strs[2] = "world";
			System.out.println(strs.length);
			for(String i:strs)
				
				System.out.println(i);
			
			
			
			
			
			/*
			int x =  10;
			doubledo(x);
			
			String str = "hello";
			
			
			str = Changed(str);
					
			System.out.println(x);
			System.out.println(str);*/
		}

		private static  String Changed(String str) {
			// TODO Auto-generated method stub
			String str1 =str;
			str = str1 +"world";
			return str;
			
		}

		private static void doubledo(int x) {
			// TODO Auto-generated method stub
			x =x *3;
			System.out.println("xxx");
		}
	
	
}
