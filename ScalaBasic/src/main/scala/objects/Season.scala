package objects

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午1:53
  * @desc
  *      scala  实现枚举类
  *      scala  本身没有枚举类型
  *      只能通过实现 继承 Enumeration
  *
  *
  *      注意 VALUE(ID ,NAME)
  *      主键不可重复
  *      main" java.lang.AssertionError: assertion failed: Duplicate id: 0
  *
  *
  **/
object Season  extends Enumeration {

  //val Spring,Summer,Autumn,Winter =values
  val Spring = Value(0,"spring")
  val Summer = Value(1,"summer")
  val Autumn = Value(2,"autumn")
  val Winter = Value(3,"winter")


}
