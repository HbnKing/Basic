package stringdemo;


public class StringWithRegex {
	public static void main(String[] args) {
		TestRegex();
		
	}

	private static void TestRegex() {
		// TODO Auto-generated method stub
		String str =  "王五:20|张三:19|赵四:21";
		String [] strs = str.split("\\|");
				for(String tmp: strs){
					String [] strl = tmp.split(":");
					System.out.println("姓名: "+strl[0]+"  年龄: "+strl[1]);
				}
		
		
	}
	

}
