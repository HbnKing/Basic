package homework;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.soap.Text;

import org.omg.CORBA.PUBLIC_MEMBER;



public class ChangeWordInDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoChange test =new DoChange();
		try {
			test.changeToString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class DoChange{
	TreeMap<String, ArrayList<String>> map =new TreeMap<String, ArrayList<String>>();
	FileReader fr;

	
	public void changeToString() throws IOException{
		
		fr =new FileReader("anagram.txt");
		BufferedReader br = new BufferedReader(fr);
		
		char[] ch;
		String line = null;
		
		while((line = br.readLine()) !=null){
			ch =line.toCharArray();
			Arrays.sort(ch);
			String line2 = String.valueOf(ch);   //转为按顺序排列
			
			paixu(line2,line);     //转为key  value  值  
			//System.out.println(line2 +"\t"+ line);
		}
		//输出结果
		if(map != null){
			Collection<ArrayList<String>> set = map.values();
			Iterator<ArrayList<String>> inter =set.iterator();   //获取key值的集合
			while(inter.hasNext()){
				ArrayList<String> list = inter.next();
				int num = list.size();
				if(num>1){
				 Iterator<String> itr = list.iterator();  
				  while(itr.hasNext()){  
			            String str = itr.next();  
			            System.out.print(str);
			            System.out.print("\t");
			            }
				  System.out.println();
				   }
				
					}
				   }
			}
	
	private void paixu(String line2, String line) {
		// TODO Auto-generated method stub
		String strkey=line2;
		String strvalue= line;
		ArrayList<String> value =new ArrayList<String>();
		if(map.containsKey(strkey)){
			
			value.addAll(map.get(strkey));
			value.add(strvalue);
			
			map.replace(strkey, value);
		}else{
			value.add(strvalue);
			map.put( strkey, value);
		}	
	}
}

