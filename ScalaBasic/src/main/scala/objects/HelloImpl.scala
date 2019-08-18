package objects


abstract class Hello(val message :String) {

  def  sayHello(name :String) :Unit
}


/**
 * 继承抽象类 并实现他的方法
 * Hello("xx")  传入的是message  的 值
 */
object HelloImpl extends Hello("hello"){
  override def sayHello(name: String): Unit = println(message+", "+name)
}