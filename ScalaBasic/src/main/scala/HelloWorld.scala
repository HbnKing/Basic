

/**
  *
  * @author wangheng
  * @create 2019-02-22 下午3:06
  * @desc
  *
  * scala  的 类 不需要 声明为 public
  * 直接 写 class  类名 就可以了
  **/
class HelloWorld {

  private var  name = "leo"

  def sayHello(){println("Hello, "+name)}

  /**
    * 方法 可以带括号 也可以 不带括号
    * 定义时不带，则 调用时 不能带括号
    * @return
    */
  def getName = name


  // 定义不带private的var field，此时scala生成的面向JVM的类时，会定义为private的name字段，并提供public的getter和setter方法
  // 而如果使用private修饰field，则生成的getter和setter也是private的
  // 如果定义val field，则只会生成getter方法
  // 如果不希望生成setter和getter方法，则将field声明为private[this]


  //系统生成的 getter  和 setter是private  无法再外部使用
  private  var  age = 16
  //var helloWorld = new HelloWorld
  //helloWorld.age
  //helloWorld.age = 17
  //只会生成getter
  val address = "address"


  private[this] var _school: String = "school"

  /**
    * 自定义的 getter  和 setter  方法
    * @return
    */
   def school: String = _school

  //school_=  这个setter  中间 不能有空格
  private def school_=(value: String): Unit = {
    _school = value
  }


  /**
    * 修饰为 private[this]  类内部也不可以访问
    * private[this]  隔离级别更高
    * @param s
    * @return
    */
  def compareSchool(s :  HelloWorld) = {
    //this._school.compareTo(s._school)
  }

  def  compareAge(ag :HelloWorld)= {

    this.age >ag.age
  }

}
