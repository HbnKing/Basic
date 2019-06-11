## String类常用方法(字符与字符串)
```
public class StringDemo{
public static void main(String args[]){
String str="hello";
char c=str.charAt(0);//取出指定索引的字符 System.out.println(c);
} }
```
//字符数组与字符串的转换
 ```
public class StringDemo{
public static void main(String args[]){ String str="hello";
char[] data=str.toCharArray(); for(int x=0;x<data.length;x++){
System.out.println(data[x]+"、"); }
} }
```
```
public class StringDemo{
public static void main(String args[]){
String str="hello";
char[] data=str.toCharArray();
for(int x=0;x<data.length;x++){ data[x]-=32;
}
System.out.println(new String(data)); System.out.println(new String(data,1,2));
} }
```
判断一个字符串是否有数字组成 
```
public class StringDemo{
public static void main(String args[]){ 
String str="1231234a123"; 
if(isNumber(str)){
System.out.println("字符串由数字组成!");

 }else{ System.out.println("字符串由非数字组成!");
} }
public static boolean isNumber(String temp){ char[] data=temp.toCharArray();
for(int x=0;x<data.length;x++){
if(data[x]>'9'||data[x]<'0'){ return false;
} }
return true; }
}
```

大小写转换
```
public class StringDemo{
public static void main(String args[]){
String str="helloworld";
byte[] data=str.getBytes();
for(int x=0;x<data.length;x++){ data[x]-=32;//将小写字母变为大写形式; }
System.out.println(new String(data)); System.out.println(new String(data,5,5));
} }
```
判断两个字符串大小
```
public class StringDemo{
public static void main(String args[]){
String stra="hello";
String strb="heLLo"; 
System.out.println(stra.equals(strb)); 
System.out.println(stra.equalsIgnoreCase(strb)); 
System.out.println(stra.compareTo(strb));
} }
```

| No|方法名称|类型|描述|
| ------ | ------ | ------ | ------ |
|  1|  String(char[] value)|  构造|   将字符数组变为String类对象| 
|    2| String(char[] value, int offset, in t count)|  构造| 将部分字符数组变为String| 
|  3| public char charAt(int index)|  普通| 返回指定索引对应的字符信息| 
| 4| public char toCharArray()|  普通|  将字符串以字符数组的形式返回| 
 |5|public String(byte[] bytes)|构造   |将全部字节数组变为字符串   | 
 |6|public String(byte[] bytes,int offset,i nt length)| 构造 |将部分字节数组变为字符串
 |7|public byte[] getBytes()|普通|将字符串变为字节数组|
|8|public byte[] getBytes(String charse tName)throws UnsupportedEncodingException|普通|进行编码转换|
|9|public boolean equals(String anO bject)|普通|进行相等判断，它区分大小写|
|10|equalsIgnoreCase(String anotherSt ring)| 普通|进行相等判断，不区分大小写|
|11|compareTo(String anotherString)|普通|判断两个字符的大小(按照字 符编码比较)，此方法的返回 值有如下三种结果: 1、=0，表示要比较的两个字 符串内容相等; 2、>0，表示大于的结果 3、<0，表示小鱼的结果|


## String类常用方法(字符串查找)

| No|方法名称|类型|描述|
| ------ | ------ | ------ | ------ |
|12 |public boolean contains(String s) |普通 |判断指定的内容是否存在|
|13 |public int indexOf(String str) |普通|由前向后查找指定字符串的位置，如果查找到了则返回(第 一个字母)位置的索引，如果找不到返回-1|
|14 |public int indexOf(String str, int fromIndex) |普通 |由指定位置从前向后查找指定字符串的位置，找不到返回-1|
|15 |public int lastIndexOf(String str)| 普通| 由后向前查找指定字符串的位置，找不到返回-1|
|16 |public int lastIndexOf(String str, int fromIndex) |普通| 从指定位置由后向前查找，找不到返回-1 |
|17 |public boolean startsWith(String prefix) |普通|判断是否以指定的字符串开头，如果是返回true，否返回fal se|
|18 |public boolean startsWith(String prefix,int t offset)  |普通 |从指定位置开始，判断是否以指定的字符串开头，如果是返回true，否返回false|
|19 |public boolean endsWith(String suffix) |普通 |判断是否以指定的字符串结尾|
|24 |public String[] split(String regex) |普通| 按照指定的字符串进行全部拆分|
|25 |public String[] split(String regex, int limit) |普通|按照指定的字符串进行部分拆分，最后的数组的长度就是由l imit决定的，即:前面拆，后面不拆。|
|26|public String concat(Sting str)|普通|字符串连接，和"+"类似|    
|27|public String toLowerCase()|普通|转小写|     
|28|public String toUpperCase()|普通|转大写|     
|29|public String trim()|普通|去掉字符串左右两边的空格，中间的空格保留|      
|30|public int length()|普通|取得字符串长度|      
|31|public String intern()|普通|数据入池|
|32|public boolean isEmpty()|普通|判断是否空字符串(不是null，而是""),长度0|
```

public class StringDemo{
public static void main(String args[]){
String str="helloworld"; System.out.println(str.indexOf("world")); System.out.println(str.indexOf("l")); System.out.println(str.indexOf("l",5)); System.out.println(str.lastIndexOf("l")); System.out.println(str.lastIndexOf("xxxx"));
} }
```
//自从Java 1.5有了contains后，在整个Java里面contains已经成了查询的代名词。
```
public class StringDemo{
public static void main(String args[]){
String stra="helloworld"; if(stra.indexOf("world")!=-1){
System.out.println("可以查询到数据"); }
String strb="helloworld"; if(strb.contains("world")){
System.out.println("可以查询到数据"); }
} }
```
```
public class StringDemo{
public static void main(String args[]){
String str="##@@hello**"; System.out.println(str.startsWith("##")); System.out.println(str.startsWith("@@",2)); System.out.println(str.endsWith("**"));
} }
```
## String类常用方法(字符串替换)
//正则，regex
```
public class StringDemo{
public static void main(String args[]){ String str="helloworld";
String resultA=str.replaceAll("l","_"); String resultB=str.replaceFirst("l","_"); System.out.println(resultA); System.out.println(resultB);
} }
```
## String类常用方法(字符串截取)
```
public class StringDemo{
public static void main(String args[]){
String str="helloworld";
String resultA=str.substring(5); String resultB=str.substring(0,5); System.out.println(resultA); System.out.println(resultB);
} }
```
| No|方法名称|类型|描述|
| ------ | ------ | ------ | ------ |
|20 |public String replaceAll(String regex, String |普通 |用新的内容替换掉全部旧的内容 replacement)|
|21 |public String replaceFirst(String regex, Strin |普通 |替换首个满足条件的内容 g replacement)|
|22 |public String substring(int beginIndex) |普通| 从指定索引截取到结尾| 
|23 | public String substring(int beginIndex, int endIndex)//1和2重载，substring第二个s没有大写| 普通 |截取部分子字符串的数据|


 
## String类常用方法(字符串拆分)
 

        24
```
public String[] split(String regex)
public class StringDemo{
public static void main(String args[]){
String str="张三:20|李四:21|王五:22|"; String result []=str.split("\\|");
for(int x=0;x<result.length;x++){
String temp[]=result[x].split(":");//“:”也要注意中英文一致
System.out.println("姓名:"+temp[0]+",年龄:"+temp[1]); }
} }
public class StringDemo{
public static void main(String args[]){
String str="hello world nihao mdln";
String result[]=str.split(" ",3);//" "和""是不一样的 for(int x=0;x<result.length;x++){
System.out.println(result[x]); }
} }
public class StringDemo{
public static void main(String args[]){
String str="192.168.1.2";
String result[]=str.split("\\.");//如果不加\\就拆不开，因为regex for(int x=0;x<result.length;x++){
System.out.println(result[x]); }
} }//如果是一些敏感字符(正则标记)严格来讲是拆分不了的，需要用转译字符\\
```
## String类常用方法(其他操作)

| No|方法名称|类型|描述|
| ------ | ------ | ------ | ------ |
  |25 |public String[] split(String regex, int limit) |普通|按照指定的字符串进行部分拆分，最后的数组的长度就是由l imit决定的，即:前面拆，后面不拆。|
  |26|public String concat(Sting str)|普通|字符串连接，和"+"类似|    
  |27|public String toLowerCase()|普通|转小写|     
  |28|public String toUpperCase()|普通|转大写|     
  |29|public String trim()|普通|去掉字符串左右两边的空格，中间的空格保留|      
  |30|public int length()|普通|取得字符串长度|      
  |31|public String intern()|普通|数据入池|
  |32|public boolean isEmpty()|普通|判断是否空字符串(不是null，而是""),长度0|
 ```
 public class StringDemo{
public static void main(String args[]){
String stra="hello";
String strb="hello "+"world"; String strc="hello world"; System.out.println(stra==strc); System.out.println(strb==strc);
} }
public class StringDemo{
public static void main(String args[]){
String stra="hello";
//String strb=stra+"world";//和下一句效果相同 String strb=stra.concat("world");
String strc="hello world"; System.out.println(stra==strc); System.out.println(strb==strc);
} }
public class StringDemo{
public static void main(String args[]){
String str="(*(*Hello(*(*";
System.out.println(str.toLowerCase()); System.out.println(str.toUpperCase());//所有的非字母数据不会进行任何的转换操作
} }
public class StringDemo{
public static void main(String args[]){

 String str=" hello world "; System.out.println("【"+str+"】"); System.out.println("【"+str.trim()+"】");//去掉字符串两端的空格
} }
public class StringDemo{
public static void main(String args[]){
String str="helloworld";
System.out.println(str.length());//和数组对象的区别是多了() }
}
public class StringDemo{
public static void main(String args[]){
String str="helloworld"; System.out.println(str.isEmpty()); System.out.println("".isEmpty());
} }
public class StringDemo{
public static void main(String args[]){
String str="hEllO";
System.out.println(initcap(str)); }
public static String initcap(String temp){
return temp.substring(0,1).toUpperCase()+temp.substring(1).toLowerCase();
} }
```


| No.| 方法名称 | 类型 |  描述 |  
| ------ | ------ | ------ | ------ |
|1 |String(char[] value) |构造| 将字符数组变为String类对象|
|2 |String(char[] value, int offset, int count)| 构造 |将部分字符数组变为String|
|3 |public char charAt(int index) |普通 |返回指定索引对应的字符信息|
|4 |public char toCharArray() |普通 |将字符串以字符数组的形式返回|
|5 |public String(byte[] bytes) |构造 |将全部字节数组变为字符串|
|6 |public String(byte[] bytes,int offset,int lengt |构造 |将部分字节数组变为字符串 h)|
|7 |public byte[] getBytes() |普通 |将字符串变为字节数组|
|8 |public byte[] getBytes(String charsetName)t |普通 |进行编码转换 hrows UnsupportedEncodingException|
|9 |public boolean equals(String anObject) |普通 |进行相等判断，它区分大小写|
|10 |equalsIgnoreCase(String anotherString) |普通 |进行相等判断，不区分大小写判断两个字符的大小(按照字符编码比较)，此方法的返回值有如下三种结果:|
|11 |compareTo(String anotherString) |普通 |1、=0，表示要比较的两个字符串内容相等;2、>0，表示大于的结果 3、<0，表示小鱼的结果|
|12 |public boolean contains(String s) |普通 |判断指定的内容是否存在|
|13 |public int indexOf(String str) |普通|由前向后查找指定字符串的位置，如果查找到了则返回(第 一个字母)位置的索引，如果找不到返回-1|
|14 |public int indexOf(String str, int fromIndex) |普通 |由指定位置从前向后查找指定字符串的位置，找不到返回-1|
|15 |public int lastIndexOf(String str)| 普通| 由后向前查找指定字符串的位置，找不到返回-1|
|16 |public int lastIndexOf(String str, int fromIndex) |普通| 从指定位置由后向前查找，找不到返回-1 |
|17 |public boolean startsWith(String prefix) |普通|判断是否以指定的字符串开头，如果是返回true，否返回fal se|
|18 |public boolean startsWith(String prefix,int t offset)  |普通 |从指定位置开始，判断是否以指定的字符串开头，如果是返回true，否返回false|
|19 |public boolean endsWith(String suffix) |普通 |判断是否以指定的字符串结尾|
|20 |public String replaceAll(String regex, String |普通 |用新的内容替换掉全部旧的内容 replacement)|
|21 |public String replaceFirst(String regex, Strin |普通 |替换首个满足条件的内容 g replacement)|
|22 |public String substring(int beginIndex) |普通| 从指定索引截取到结尾| 
|23 | public String substring(int beginIndex, int endIndex)//1和2重载，substring第二个s没有大写| 普通 |截取部分子字符串的数据|
|24 |public String[] split(String regex) |普通| 按照指定的字符串进行全部拆分|
|25 |public String[] split(String regex, int limit) |普通|按照指定的字符串进行部分拆分，最后的数组的长度就是由l imit决定的，即:前面拆，后面不拆。|
|26|public String concat(Sting str)|普通|字符串连接，和"+"类似|    
|27|public String toLowerCase()|普通|转小写|     
|28|public String toUpperCase()|普通|转大写|     
|29|public String trim()|普通|去掉字符串左右两边的空格，中间的空格保留|      
|30|public int length()|普通|取得字符串长度|      
|31|public String intern()|普通|数据入池|
|32|public boolean isEmpty()|普通|判断是否空字符串(不是null，而是""),长度0|
     