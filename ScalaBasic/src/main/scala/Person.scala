/**
  *
  * @author wangheng
  * @create 2019-02-28 下午3:58
  * @desc
  *
  *      scala  与 java 一样 不支持 类的多继承
  *
  *      但是可以继承多个trait
  *
  *
  **/
class Person(val name :String)  extends ScalaTraitHello with ScalaTraitMakeFriends {
  override def sayHello(name: String): Unit = {println("hi my name is"+name)}

  override def makeFriends(p: Person): Unit = {println("hi my name is "+name +"your name  is "+p.name)}
}
