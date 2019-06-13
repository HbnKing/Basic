## 数组
数组是引用数据类型。是用来存储同一种类型数据的集合。也就是说数组就是一个容器。
一旦数组的初始化完成，数组在内存中所占的空间就会被固定下来，数组的长度就不能变了。
数组可以给其中的元素从0开始编号，方便操作这些元素。这个编号叫索引，可以叫下标、角标。
### 1.1.   数组变量的声明
首先必须声明数组变量，才能在程序中使用数组。数组变量的声明有两种格式：
元素类型[] 数组名;   // 首选的方法
元素类型 数组名[];  // 效果相同，但不是首选方法
推荐使用第一种格式。

数组是引用类型，而类也同样是引用类型，所以如果是对象数组的话表示一个引用类型里面嵌套了其他的引用类型。在之前使用的数组都属于基本数据类型的数组，但是所有的引用数据类型 也同样可以定义数组。这样的数组叫对象数组。
如果要想定义对象数组(以类为例)，可以采用如下的形式完成:
动态初始化:
1、声明并开辟对象数组:类名称 对象数组名称[]=new 类名称[长度] 2、分步完成:
|-声明对象数组:类名称 对象数组名称[]=null;
|-开辟对象数组:对象数组名称=new 类名称[长度]; 举例:Book books []=new Book[3];
### 1.2.   数组对象的初始化
要想使用数组，必须对数组进行初始化。数组初始化，就是为数组的数组元素分配内存空间，并且为每个数组元素赋初始值。只有初始化了之后，数组才能使用。
数组的初始化方式有两种：
静态初始化：初始化的时候有程序员显示指定每个数组元素的初始值，有由系统决定数组的长度。
动态初始化：初始化时，程序员只指定了数组的长度，由系统为数组元素分配初始值。
* （1）静态初始化
静态初始化的格式是这样的：
数组名 = new 元素类型[]{元素，元素，……};
元素的类型和声明数组的时候的元素类型是一致的，也可以是声明数组时的元素类型的子类型。数组元素被紧跟在[]（中括号）后的的花括号中。
静态初始化还可以简写成这样：
元素类型[] 数组名 = {元素，元素，……};
 
* （2）动态初始化
动态初始化只定义了数组的长度，有系统为数组的每个元素指定初始值。动态初始化的格式是这样的：
数组名 = new 元素类型[元素个数或数组长度];
其中中括号中的元素个数或数组长度的类型是int类型。同样，这里的元素类型和声明时的元素类型是相同的，或是声明时的元素类型的子类型。
执行动态初始化的时候，只需要指定数组的长度，系统会自动为数组元素分配初始值。初始值的分配规则是这样的：
元素类型是Byte、short、int、long，那么初始值是0；
元素类型是float、double，那么初始值是0.0；
元素类型是char类型，那么初始值是’\u0000’；
元素类型是boolean，那么初始值是false；
元素类型是类、接口、数组，那么初始值是null。
### 1.3.   数组元素的访问
数组最长用的用法是访问数组元素，包括对数组元素进行赋值和取出数组元素的值。访问数组元素是通过在数组应用变量后紧跟着一个中括号（[]），中括号里是数组元素的索引值，这样就可以访问数组元素了。索引值也称为下标、角标。访问到数组元素之后，就可以把元素当成一个变量使用，可以通过这个变量进行赋值或取值的操作，这个变量的类型就是定义数组时使用的类型。
数组索引是从0开始的，也就是说数组的第一个元素的索引值是0，最后一个元素的索引值是数组的长度减1。
①　取出元素：
int[] a = {1,2,3};
              System.out.println(a[0]);
②　对数组的元素进行赋值：
a[1]=9;
              System.out.println(a[1]);
③　如果访问元素时，指定的索引值小0或大于等于数组的长度，在编译的时候不会出错，但是在运行的时候出现数组下标越界异常。
设置索引值为-1：
a[-1] = 10;
出现异常：ArrayIndexOutOfBoundsException: -1。
设置索引值为3：
a[3] = 10;
出现异常：ArrayIndexOutOfBoundsException: 3。
这个异常信息后跟着的就是越界的索引值。
 
数组的长度是通过length属性来获取的，获取了数组的长度，就可以通过循环对数组进行遍历。这里，遍历就是对数组的每个元素进行访问的意思。
for(int i=0;i<a.length;i++){
                     System.out.println(a[i]);
              }
              
              
### 1.4.  数组的定义与使用

//排序，当你困了又睡不着的时候，就赶快滚起来学习，一般来说会更困，所以坚持到特别困就去睡觉，保证你睡的又快又好。如果不困，那么问题解决了。好好学习吧。 public class Array{
public static void main(String args[]){ int data[]=new int[]{2,1,0,9,5,13,7,6,8}; print (data);
sort(data);
print (data); }
public static void sort(int arr[]){ for(int x=0;x<arr.length;x++){
for(int y=0;y<arr.length-1;y++){ if(arr[y]>arr[y+1]){
int t=arr[y];
arr[y]=arr[y+1];
arr[y+1]=t;
} }
} }
public static void print(int temp[]){ for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+",");
}
System.out.println(); }
}
————————————————————— public class Array{
public static void main(String args[]){ int data[]=new int[]{1,2,3,4,5,6,7,8,9}; print (data);
reverse(data);
print(data); }
public static void reverse(int arr[]){ int len=arr.length/2;//转置的次数 int head=0;//头部索引
int tail=arr.length-1;//尾部索引 for(int x=0;x<len;x++){
int temp=arr[head]; arr[head]=arr[tail]; arr[tail]=temp; head++;
tail--;
} }
public static void print(int temp[]){ for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+",");
}
System.out.println(); }
}
————————————————————— public class Array{
   
 public static void main(String args[]){
int data[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}}; print(data);
reverse(data);
print(data);
}
public static void reverse(int arr[][]){
for(int x=0;x<arr.length;x++){ for(int y=0;y<arr[x].length;y++){
if(x!=y){
int temp=arr[x][y]; arr[x][y]=arr[y][x]; arr[y][x]=temp;
} }
} }
public static void print(int temp[][]){ for(int x=0;x<temp.length;x++){
for(int y=0;y<temp[x].length;y++){ System.out.print(temp[x][y]+"、");
} System.out.println(); }
} }
—————————————————————


\\数组拷贝
public class Array{
public static void main(String args[]){
int dataA[]=new int[]{1,2,3,4,5,6,7,8};
int dataB[]=new int[]{11,22,33,44,55,66,77,88};
System.arraycopy(dataA,4,dataB,2,3); print(dataB);
}
public static void print(int temp[]){
for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+"、"); }
System.out.println();
} }
————————————————————— \\Java排序
public class Array{
public static void main(String args[]){ int data[]=new int[]{6,3,9,23,2,45}; java.util.Arrays.sort(data); print(data);
}
public static void print(int temp[]){
for(int x=0;x<temp.length;x++){ System.out.print(temp[x]+"、");
}
System.out.println(); }
}