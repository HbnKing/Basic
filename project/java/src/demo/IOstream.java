package demo;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.DefaultEditorKit.CopyAction;

/*
 * 主要练习io流
 * 读取,写入炒作
 * 
 *读取字符,转为int   读取时再强转为char
 *1
 *单个读取    --while()判断不为空就继续读取,并且不断输出
 *2
 *fr.read()读取单个字节   fr.read(chs)读取chs 字符串长度的字符
 *多个读取多个显示,   
 *随后转到char[]数组中   在对char[]   转string进行截取
 *
 *----------------------
 *复制文件内容
 *-------------
 * 使用buffer 容器来操作读取和写入
 * 
 * -------------------
 * buffer 复制
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
			if(fr != null){     ///最后关闭资源
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
			if(fr != null){     ///最后关闭资源
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
			char [] chs = new char [4];  //定义一个四个长度的字符串,大文件最好定意1024的整数倍	
			int num =0;
			while ((num =fr.read(chs)) !=-1){
			//System.out.println(chs);   //以数组的形式输出,但是有问题,读取时候chs后部分没有被覆盖,还是上一次的值
			System.out.println("长度为"+num+"内容为:"+new String(chs,0,num));              //将数组转为字符串,然后根据读取的到的num长度进行截取
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {  //fr.read()异常
			// TODO Auto-generated catch block
			e.printStackTrace();  
		}finally {
			if(fr !=null){   //fr 有指向,不为空
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
			
				//int num= fr.read();   //fr.read();读取的是一个字符转成的Unicode编码
			int num =0;					
			while((num= fr.read()) !=-1){		//当读取的数字返回值不是-1时候就继续
				//System.out.println(num);
				System.out.println((char)num);    //再将这个num 转为字符(char)
					//fr.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {  //fr.read()异常
			// TODO Auto-generated catch block
			e.printStackTrace();  
		}finally {
			if(fr !=null){   //当读取完毕的时候为空
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
			fw.write("abABcccccccc");            //进行写入操作
			
			//fw.flush();						//刷新流
			fw.write("iiiiiiiiiiiii");			
			//fw.flush();		
			
			fw.close();                       //关闭资源,读取和写入占用大量的资源类型,使用close();之后可以不用flush();
												//使用完毕后应当关闭.否则一直占用会导致一些错误
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
