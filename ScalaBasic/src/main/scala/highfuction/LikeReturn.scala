package highfuction


/**
 * scala  return
 * 函数的最后一行语句 的值就是函数的返回值
 * return  用于 在匿名 函数中 返回值给包含匿名函数的带名函数
 * 并作为带名函数的返回值
 *
 * */
object LikeReturn {

  def main(args: Array[String]): Unit = {

    println(greeting("leo"))

  }


  def  greeting(name:String) = {
      def  sayHello(name :String):String  ={
       return "hi , " +name
      }
    sayHello(name)
  }



}
