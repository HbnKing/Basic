package highfuction


/**
 * 闭包
 * 函数 在变量不处于 其有效作用域时还能对 变量进行访问
 */
object ClosePackage {


  def main(args: Array[String]): Unit = {

    sayHi("leo")
    sayFuck("leo")

  }

  def  greeting(msg :String) = (name :String)=>{println(  msg+","+name)}

  val  sayHi = greeting("Hi")

  val  sayFuck  =greeting("fuck")

}
