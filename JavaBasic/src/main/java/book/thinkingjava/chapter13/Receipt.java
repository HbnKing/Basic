package book.thinkingjava.chapter13;

import java.util.Formatter;

public class Receipt {

	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		f.format("%-15s %5s %10s \n", "Item","QTY","price");
		f.format("%-15s %5s %10s \n", "----","---","----");
	}
	public void print(String name, int qty ,double price) {
		f.format("%-15s %5s %10.2f \n", name ,qty ,price);
		total +=price;
		
	}
	public void printTotal() {
		f.format("%-15s %5s %10.2f \n", "Tax" ,"" ,total*0.06);
		f.format("%-15s %5s %10s   \n", "" ,"" ,"----");
		f.format("%-15s %5s %10.2f \n", "Total" ,"" ,total*1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("jack magic beans" ,4 , 4.25);
		receipt.print("princess", 3, 5.10);
		receipt.printTotal();
	}
	
	/**
	 * d 整数型
	 * c Unicode字符
	 * b boolean值
	 * s String
	 * f 浮点数（十进制）
	 * e 浮点数科学计数
	 * x 整数 十六
	 * h 散列码 十六进制
	 * % 字符%
	 * 
	 */

}
