package demo1_car;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarStore [] cars={
				new Bus("奥迪A4",500,4),
				new Bus("马自达6",400,4),
				new PickUpCar("皮卡雪6",450d,4,2),
				new Bus("金龙",800,20),
				new Truck("松花江",400,4),
				new Truck("依维柯",1000,20)};
		
		systemIndex(cars);
	}

	  static void systemIndex(CarStore[] cars) {
		// TODO Auto-generated method stub
		
		welcome();
		
		//使用循环方式将各类车输出
		for(int i=0;i<cars.length;i++){
			//遍历所有的车型  显示
			System.out.println((i+1)+"\t"+cars[i].tostrings());
		}

		System.out.println("****请输入您的租车数量：****");
		
		//调用方法查看  输入的数据是否为数字  确定租车数量
		//carnums();
		
		int num1 = Integer.parseInt(isNums());
		CarStore[] rentcar=new CarStore[num1];
		double price=0;//总价格
		int totalpeople=0;//总人数
		float totalloads=0;//总载货量
		
		for(int i=0;i<num1;i++){
			//将所需要的车辆信息的编号 输入   保存到数组里
			System.out.println("****请输入第"+(i+1)+"辆车的序号：****");
			int numx = Integer.parseInt(isNums());
			rentcar[i]=cars[numx-1];
		}
		//获取金额数
		System.out.println("****请输入天数：****");
		int day=Integer.parseInt(isNums());
		for(int i=0;i<num1;i++){
		price=price+rentcar[i].getRent() *day;
		}
		System.out.println("****您的账单：****");
		System.out.println("已选载人车：");
		
		for(int i=0;i<num1;i++){
			if(rentcar[i].getPeopleNum()!=0){
				System.out.println(rentcar[i].getName()+"\t");
			}
			
			totalpeople=totalpeople+rentcar[i].getPeopleNum();
		}
		
		System.out.println('\n');
		System.out.println("已选载货车：");
		for(int i=0;i<num1;i++){
			if(rentcar[i].getLoad()!=0){
				System.out.println(rentcar[i].getName()+"\t");
			}
					
			totalloads=totalloads+rentcar[i].getLoad();
		}
	
		
				System.out.println('\n');
				System.out.println("共载客："+totalpeople+"人");
				System.out.println("共载货："+totalloads+"吨");
				System.out.println("租车总价格："+price+"元");
				System.out.println('\n');
				System.out.println("****感谢您的惠顾，欢迎再次光临！****");

	}
	private static  String isNums() {
		// TODO Auto-generated method stub
		Scanner in1=new Scanner(System.in);
		String nums=in1.nextLine();
		Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(nums);
		if (isNum.matches()) {
			
		return nums;
				
			
		}else {
			System.out.println("****输入请重新输入：****");
			isNums();
		}
		in1.close();
		return "0";
		
	}

	private static void welcome(){
		System.out.println("欢迎使用老大租车系统");
		System.out.println("请输入 -Y- 进入系统 ,输入-N- 退出,按enter键完毕");
		@SuppressWarnings("resource")
		Scanner in1=new Scanner(System.in);
		String is=in1.next();
		if(is.length()!=1){
			System.out.println("请重新输入");
			
		}
		else if(is.length()==1) {
			char ch= is.toUpperCase().toCharArray()[0];
			
			if(ch==78){
				System.out.println("****欢迎下次光临！****");
				System.exit(0);
			}else if (ch==89) {
				System.out.println("****您可租车的类型及价目表****");
				System.out.println("序号"+"\t车名"+"\t日租金（元/天）"+"\t载客数（人））"+"\t载货量（吨");
			}else {
				System.out.println("****您的输入有误,请重新输入****");
				welcome();
			}
			
		}
	}

}
