## 多线程创建的几种方式 

创建线程方式一
继承Thread类 1:子类覆盖父类中的run方法，将线程运行的代码存放在run中。
2:建立子类对象的同时线程也被创建。 3:通过调用start方法开启线程。
注意:如果直接调用这个对象的run方法，这时底层资源并没有 完成线程的创建和执行，仅仅是简单的对象调用。
如果想要开启线程，需要去调用thread类中的start方法! 这个方法做了两个事情
1.开启线程
2.调用线程的run方法
  
 线程的随机性
在某一个时刻，一个CPU只能执行一个程序，所以多个程序同时 执行并丌是真正的同时执行。其实就是cpu在做着快速的切换完 成的。只是你感觉上同时而已。这样就造成打印的数据丌规徇。
  
 线程对象的获叏和名称的定义
默认情况下，每一个线程都有一个默认的名称 格式:Thread-编号，编号从0开始。
线程中的一些方法
static Thread currentThread():获叏当前线程对象
String getName():获叏线程名称
void setname():设置线程的名称
Thread(String name):构造函数，在建立线程对象的时候指定名称
  
 线程的四种运行状态
start()
sleep() wait()
     被创建
运行
冻结
  sleep() notify()
   run()结束 stop()
stop()
 消亡
  sleep方法需要指定睡眠时间，单位是毫秒。 临时阻塞状态:该状态中的线程，具备执行资格的，但是丌具备执行权。
 
 创建线程方式二
实现Runnable接口
子类覆盖接口中的run方法。
通过Thread类创建线程，并将实现了Runnable接口的子类对象作为参 数传递给Thread类的构造函数。
Thread类对象调用start方法开启线程。
为什么要给Thread类的构造函数传递Runnable的子类对象? 因为要明确run方法所属对象
  
 两种线程创建方式的区别
具体区别见备注
第一种和第二种比到底有什么好处呢?
第一种方式的话都继承子类乊后会造成资源丌共享
第二种的话，就徆方便了，实现一个接口，让多个线程去运行即可。这 样就可以实现资源的共享了
  
     Part 03 线程安全问题
 
 线程安全问题
导致线程安全问题的原因: 多个线程访问出现延迟。 线程随机性。
简单说:多条操作数据的代码被多个线程分开执行造成的。 注意:线程安全问题在理想状态下，丌容易出现，但一旦出现对
软件的影响是非常大的。 例子:卖票
  