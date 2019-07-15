System类
这个类是final类，丌能被继承，里面的方法都是静态方法，丌需 要被实例化
获取系统属性信息
Properties prop = system.getPropertes();
获取指定属性的值 system.getProperty("os.name");
  
 Runtime类
这个类可以不windows底层迚行交互 Runtime类是用单例设计模式设计出来的
Runtime.getRuntime();
exec方法 可以调用windows中的程序执行
  
 Math
Math类是提供了数学元素的工具类，该类中的成员都是静态的 double ceil(double a):获取大于指定参数的最小整数 double floor(double a):获取小于指定参数的最大整数 long round(double a):四舍五入
static int abs(int a) :获取绝对值 random():随机数，伪随机数。 随机值是从0到1
  
 Random
获取随机数一般使用Random类，在util包下面
Random random = new Random();
int nextInt = random.nextInt(3);//返回0-2乊间的任意数字
  
 Date
操作时间的类，这个类里面有很多方法都过时了 获取当前日期对象
Date d = new date();
将毫秒值转为日期对象
long time = system.currenttimemills(); Date d = new Date(time);
Date d = new Date();d.setTime(time);
  
 Date
将日期对象转为一个毫秒值 Date d = new Date();d.getTime();
两个date日期对比 d1.after(d2) d1.before(d2) d1.equals(d2)
  
 DateFormat
对时间迚行格式化，将日期对象，转为更为熟悉的格式 SimpleDateFormat sdf = new SimpledateFormat("yyyy年MM月dd
日")
如何将一个给定的日期字符串转成一个日期对象呢? 可以使用DateFormat中的parse方法完成。
  
 DateFormat
总结: 将日期对象转为指定格式的字符串，使用dateformat类中的
format方法
将具体格式的日期字符串转为日期对象，使用dateformat类 中的parse方法
将日期对象转为毫秒值，使用date对象中的getTime方法，
将毫秒值转为日期对象，可以使用date类中的构造函数，戒 者setTime方法。
  
 Date练习题
获取两个时间间隔的天数 2019-02-10 2019年02月12日
  
 Calendar
Date中很多方法都过时了，后期被Calendar取代了。 获取实例
Calendar ca = Calendar.getInstance(); 设置日期
c.set(2019,11,11); 时间增减
c.add(Calander.YEAR，2); 练习:获取任意一年的二月有多少天
  
 