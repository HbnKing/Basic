package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��Ҫ��ϰio��
 * ��ȡ,д�보��
 * 
 *��ȡ�ַ�,תΪint   ��ȡʱ��ǿתΪchar
 *1
 *������ȡ    --while()�жϲ�Ϊ�վͼ�����ȡ,���Ҳ������
 *2
 *fr.read()��ȡ�����ֽ�   fr.read(chs)��ȡchs �ַ������ȵ��ַ�
 *�����ȡ�����ʾ,   
 *���ת��char[]������   �ڶ�char[]   תstring���н�ȡ
 *
 *----------------------
 *�����ļ�����
 *-------------
 * ʹ��buffer ������������ȡ��д��
 * 
 * -------------------
 * buffer ����
 * 
 */
public class IOstream {

	public static void main(String[] args) {
		//write1();
		//read1();
		//read2();
		//copy();
		//bufferWriteDemo();
		//bufferReadDemo();
		copyWithBuffer();
		
	}

	private static void copyWithBuffer()  {
		// TODO Auto-generated method stub
		FileReader fr =null;
		FileWriter fw =null;
		try {
			 fr = new FileReader("IOstream.txt");
			 fw = new FileWriter("copyWithBuffer.txt");
			 BufferedReader br = new BufferedReader(fr);
			 BufferedWriter bw = new BufferedWriter(fw);
			 
			 String line  = null;
			while ((line = br.readLine())!=null) {
				
				 bw.write(line);
				 bw.flush();
			}
			 
			//fr.close();
			//fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fr != null){     ///���ر���Դ
				try {
					fr.close();
					fw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

	private static void bufferReadDemo() {
		// TODO Auto-generated method stub
		FileReader fr =null;
		try {
			fr = new FileReader("io_buffer.txt");
			BufferedReader br = new BufferedReader(fr);   
			
			String line =null;
		
			
			while((line = br.readLine()) !=null){
				System.out.println(line);
				
		}
			fr.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	private static void bufferWriteDemo() {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			fw = new FileWriter("io_buffer.txt");
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("abcdefg");
			bw.newLine();
			bw.write("ddd");
			
			for(int i=1;i<6;i++){
				bw.write("aa"+i);
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

	private static void copy() {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			 fr = new FileReader("IOstream.txt");
			 fw = new FileWriter("IOstream_copy.txt");
			int len = 0;
			char[] chs = new char[1024];
			while((len= fr.read(chs)) != -1){
				fw.write(chs, 0, len);
				//fw.flush();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null){     ///���ر���Դ
				try {
					fr.close();
					fw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	private static void read2() {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try {
			fr = new FileReader("IOstream.txt");
			char [] chs = new char [4];  //����һ���ĸ����ȵ��ַ���,���ļ���ö���1024��������	
			int num =0;
			while ((num =fr.read(chs)) !=-1){
			//System.out.println(chs);   //���������ʽ���,����������,��ȡʱ��chs�󲿷�û�б�����,������һ�ε�ֵ
			System.out.println("����Ϊ"+num+"����Ϊ:"+new String(chs,0,num));              //������תΪ�ַ���,Ȼ����ݶ�ȡ�ĵ���num���Ƚ��н�ȡ
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {  //fr.read()�쳣
			// TODO Auto-generated catch block
			e.printStackTrace();  
		}finally {
			if(fr !=null){   //fr ��ָ��,��Ϊ��
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	
	}

	private static void read1() {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr = new FileReader("IOstream.txt");
			
				//int num= fr.read();   //fr.read();��ȡ����һ���ַ�ת�ɵ�Unicode����
			int num =0;					
			while((num= fr.read()) !=-1){		//����ȡ�����ַ���ֵ����-1ʱ��ͼ���
				//System.out.println(num);
				System.out.println((char)num);    //�ٽ����num תΪ�ַ�(char)
					//fr.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {  //fr.read()�쳣
			// TODO Auto-generated catch block
			e.printStackTrace();  
		}finally {
			if(fr !=null){   //����ȡ��ϵ�ʱ��Ϊ��
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

	private static void write1() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("IOstream.txt");
			fw.write("abABcccccccc");            //����д�����
			
			//fw.flush();						//ˢ����
			fw.write("iiiiiiiiiiiii");			
			//fw.flush();		
			
			fw.close();                       //�ر���Դ,��ȡ��д��ռ�ô�������Դ����,ʹ��close();֮����Բ���flush();
												//ʹ����Ϻ�Ӧ���ر�.����һֱռ�ûᵼ��һЩ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
