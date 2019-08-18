import objects.Person

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午3:00
  * @desc
  *
  *
  * 判断 是 哪个类型
  * 因为继承的关系
  * 我们需要知道他 是否能被 转换成某种类型的数据
  *
  **/
object ClassMatch  extends App {


  var p:Person = new Person("")
  var s = new Students
  //isInstanceOf  和 asInstanceOf  不能精准的判断 该 对象是那种类型   本类 和  本类的父类 都会匹配上
  println(p.isInstanceOf[Students])
  println(p.isInstanceOf[Person])
  // 返回的true

  //getClass  和 classOf[Person]  可以精准的获得 他的原始类型
  println(p.getClass)
  println(s.getClass)



  //模式匹配
  //模式匹配 也不能精准的获取 该 类 的 原始值
  //有父类 也会匹配中
  p match {
    case per: Students => println("it  is students")
    case per: Person => println("it  is person")

    case _ => println("unknow  type")
  }




}
