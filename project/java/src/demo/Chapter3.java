package demo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time.dotest() ;
			
	}

	private static class Time extends Date{
		private  int a;
		public static void dotest() {
			
		// TODO Auto-generated method stub
			Date riqi = new Date();
			System.out.println(riqi);
			GregorianCalendar d = new GregorianCalendar();
			
			int today = d.get(Calendar.DAY_OF_MONTH);
			int month = d.get(Calendar.MONTH);
			int week  = d.get(Calendar.DAY_OF_WEEK);//��ȡ����Ϊ���ܵĵڼ���
			
			System.out.println(d);
			int firstdayweek =d.getFirstDayOfWeek();
			System.out.println(month+"��"+today+"��; ���ܵ�"+week+"��");//GregorianCalendar��ȡ��ʱ�俪ʼΪ0�� ���Ϊ11��
			System.out.println(firstdayweek);
			
		}
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
	}

	private static void Test(){
		// TODO Auto-generated method stub
		for(int i = 10;i>0;i--)
			System.out.println("��ֵ"+i);
		int [] arr = {1,3,57,8,4,3,234,3};
		int [] aar2 =arr;
		int [] arr1 =null;
		System.out.println("off");
	}
	
}
