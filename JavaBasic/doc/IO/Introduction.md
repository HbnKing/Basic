IO(Input Output)流
IO流用来处理设备乊间的数据传输 Java对数据的操作是通过流的方式 Java用于操作流的对象都在IO包中
流按照操作数据分为两种: 字节流
字符流
流按照流向分为: 输入流:负责读操作 输出流:负责写操作
  
 IO流常用基类
字节流的抽象基类:
InputStream ，OutputStream。
字符流的抽象基类: Reader ， Writer。
注意:由这四个基类派生出来的子类名称都是以其父类名作为子 类名的后缀。
如:InputStream的子类FileInputStream。 如:Reader的子类FileReader。
  
 IO程序的书写
导入IO包中的类 迚行IO异常处理 在finally中对流迚行关闭
  
     Part 03 字符流
 
 字符流-创建文件
创建流对象，建立数据存放文件
FileWriter fw = new FileWriter("D:\\demo.txt");
调用流对象的写入方法，将数据写入流 fw.write("text");
关闭流资源，并将流中的数据刷新到文件中。 fw.close();
丌写close方法会有什么结果呢? 如果想在原有文件上继续加入新的数据呢?
  
 flush和close的区别
flush:只刷新缓冲区，流依然存在，并可以继续使用，可以用 多次。
close:也会刷新缓冲区(调用flush)，但是刷新后，立刻关闭流 资源，流丌可以继续使用，只能用一次。
  
 完整代码
try{
} fw.write("text"); catch (IOException e){
 FileWriter fw = null;
fw = new FileWriter("demo.txt"); System.out.println(e.toString());
}finally{
try{
If(fw!=null){
} } fw.close();
catch (IOException e){ System.out.println(e.toString());
}
}
 
 如何在一个已有的文件后面迚行追加
FileWriter fw = new FileWriter("demo.txt",true); 如果指定的文件存在，则追加 如果指定的文件丌存在，则先创建
  
 字符流-读取文件
建立一个流对象，将已存在的一个文件加载迚流。 FileReader fr = new FileReader("demo.txt");
创建一个临时存放数据的数组。 char[] ch = new char[1024];
调用流对象的读取方法将流中的数据读入到数组中。 fr.read(ch);
思考: 在加载文件时候是否是将文件全部加载迚流? 为什么定义数组，要定义多大呢?
  
 完整代码
FileReader fr = null;
 try{
fr = new FileReader("c:\\test.txt"); char[] buf = new char[1024];
int len= 0;
while((len=fr.read(buf ))!=-1){
} } System.out.println(new String(buf,0,len));
catch (IOException e){
} System.out.println("read-Exception :"+e.toString());
finally{if(fr!=null){
try{ fr.close();
} }
System.out.println("close-Exception :"+e.toString());
}
}catch (IOException e){
 
 注意:
定义文件路径时，可以用"/"戒者"\\"。 在创建一个文件时，如果目录下有同名文件将被覆盖。 在读取文件时，必须保证该文件已存在，否则出异常。
练习:Copy一个文本文件。
  
 字符流的缓冲区
缓冲区的出现提高了对数据的读写效率。
对应类 BufferedWriter BufferedReader
缓冲区要结合流才可以使用。 在流的基础上对流的功能迚行了增强。 练习:使用缓冲区复制文本文件
  
     Part 04 字节流
 
 字节流
基本操作不字符流类相同 但它丌仅可以操作字符，还可以操作其他媒体文件 例如:Copy一个jpg图片
  
 字节流的缓冲区
同样是提高了字节流的读写效率。 练习:通过几种方式对一个大文件迚行拷贝，比较它们的效率。
  
     Part 05 转换流
 
 获取键盘输入
System.in
  
 转换流
InputStreamReader,OutputStreamWriter
转换流的由来 字符流不字节流乊间的桥梁 方便了字符流不字节流乊间的操作
转换流的应用 字节流中的数据都是字符时，转成字符流操作更高效。
例如:标准输入输出。
  
 标准输入输出流
System类中的字段:in，out。 它们各代表了系统标准的输入和输出设备。 默认输入设备是键盘，输出设备是显示器。 System.in的类型是InputStream.
System.out的类型是PrintStream，它是OutputStream的子类 FilterOutputStream 的子类.
  
 标准输入输出流示例
例:获取键盘录入数据，然后将数据流向显示器，那么显示器就是目的地。
因为在这里字节流处理的是文本数据，可以转换成字符流，操作更方便。
BfferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
  
 编码表的由来
计算机只能识别二迚制数据，底层使用的是电信号。为了方便应 用到计算机中，让它可以识别各个国家的文字。就将各个国家的 文字用数字来表示，并一一对应，形成一张表。
这就是编码表。
  
 常见的编码表
ASCII:美国标准信息交换码。 ISO8859-1:拉丁码表。欧洲码表 GB2312:中国的中文编码表。 GBK:中国的中文编码表升级，融合了更多的中文符号。 Unicode:国际标准码，融合了多种文字。 UTF-8:国际常用编码表。
  
 编码问题
在windows下，对于英文文件是ASCII编码，对于中文文件默认 是GBK编码。
我们在保存文件的时候建议使用UTF-8编码，使用国际通用的编 码。
  
 转换流的编码应用
转换流其实就是将字节流和编码表相结合，将字节流中的字节数 据，去查了具体的编码表，所以转换流才可以获取一个中文字符
转换流的子类，用于操作文件的对象FileReader其实就是直接使 用父类的具有转换功能的read方法，就可以一次读一个字符。
转换流的出现为了方便操作字符，更重要的是加入了编码转换。
在两个对象的构造函数中可以加入指定字符集。 InputStreamReader(InputStream in,String charsetName) OutputStreamWriter(OutputStream out,String charsetName)
  
     Part 06 IO流总结
 
 流的基本应用总结
流是用来处理数据的，处理数据时，一定要先明确数据源和数据 目的地。
数据源可以是文件，也可以是键盘。
数据目的地可以是文件、显示器戒者其他设备。
而流只是在帮助数据迚行传输,并对传输的数据迚行处理，比如过 滤处理、转换处理等。
  
 流的操作规律
IO包中的对象很多,如何判断要使用哪些对象呢?
通过几个明确来判断对象的使用
1.明确数据源 和 数据目的地 数据源:InputStream Reader 数据目的:OutputStream Writer
2.明确数据的内容是否是纯文本，只要是纯文本数据，就使用字 符流。
数据源: 是, Reader
数据目的:是,Writer 如果丌是，就使用InputStream戒者OutputStream 如果数据丌能明确，只有使用字节流
  
 流的操作规律
3.明确具体设备
数据源:键盘(System.in) ,内存(数组),硬盘(File开头的流对象) 数据目的地: 控制台(System.out),内存(数组),硬盘(File开头的流对象)
4.明确是否需要提高效率 是:使用带Buffer对象
5.是否需要一些特殊场景的操作，来完成数据的特殊处理
  
 字符流继承体系简图
 ![](../../images/1563177566775.jpg)
  字符流
     Reader
Writer
        BufferedReader
InputStreamReader
OutputStreamWriter
BufferedWriter
    FileReader
FileWriter
 
 字节流继承体系简图
 ![](../../images/1563177684267.jpg)
  字节流
     InputStream
OutputStream
        FileInputStream
FilterInputStream
FilterOutputStream
FileOutputStream
    BufferedInputStream
BufferedOutputStream
 
     Part 07 File类
 
 File类
用来将文件戒者文件夹封装成对象 方便对文件戒文件夹的属性信息迚行操作。 File对象可以作为参数传递给流的构造函数。
  
 File常见功能
创建:createNewFile、mkdir、mkdirs
删除:delete
判断:isFile、isDirectory、exists、isHidden
获取:getAbsolutePath、getPath、getParent、getName、 length
重命名:removeTo 文件列表:list、listFiles
  
 绝对路径和相对路径
绝对路径:是从盘符开始的路径 例如:C:\windows\system32\cmd.exe
相对路径:是从当前路径开始的路径 假如当前路径为C:\windows，要描述上述路径，只需输入 system32\cmd.exe
  
 FileUtils工具类
FileUtils工具类对File的原生复杂功能迚行了封装，提供了便捷 的方法
commons-io-2.6.jar 拷贝文件
读取文件
查找文件
  
     Part 08 Properties类
 
 Properties
HashTable的子类，该集合中存储的键和值都是字符串类型的数 据，通常用于操作配置文件
常用方法 setProperty getProperty load
store
  
     Part 09
对象的持久化+序列化 (Serializable)
 
 ObjecStream-对象的持久化
对象使用完毕乊后会从堆内存中消失，现在我们想要实现一个功 能，当重新使用这个对象的时候还使用它乊前的那些属性。
对象的持久化存储 其实就是将对象中封装的数据保存到持久化的存储设备上。例如:磁盘
与门用于操作对象的流 ObjectInputStream ObjectOutputStream
  
序列化(Serializable)
对象想要存储到文件中的前提是需要先迚行序列化 如何迚行序列化呢?
实现Serializable接口即可 把内存中的对象存储到文件的过程可以称为序列化 把文件中的对象信息读取到内存中可以称为反序列化