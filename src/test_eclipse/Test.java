package test_eclipse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Map<Double , String> maptest = new HashMap<Double,String>();
		
		System.out.println(maptest.size());
		System.out.println(maptest == null);
		maptest.put(1.23457d, "哈哈哈哈");
		double a =1.23456234562345623456234562345623456234562345623456234562345623456234562345623456d;
		System.out.println(a);
		maptest.put(a, "哈哈哈哈你个锤子");
		
		double b = Collections.min( maptest.keySet());
		System.out.println(b);
		System.out.println(maptest.get(a));
		System.out.println(maptest.get(b));
		System.out.println(maptest.size());
		
		
		
			}

}
