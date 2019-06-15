package String;


public class StringWithRegex {
	public static void main(String[] args) {
		TestRegex();
		
	}

	private static void TestRegex() {
		// TODO Auto-generated method stub
		String str =  "����:20|����:19|����:21";
		String [] strs = str.split("\\|");
				for(String tmp: strs){
					String [] strl = tmp.split(":");
					System.out.println("����: "+strl[0]+"  ����: "+strl[1]);
				}
		
		
	}
	

}
