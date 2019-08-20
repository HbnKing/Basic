package highfuction


/**
 *
 * scala  之匿名函数
 *
 * （参数 ：参数类型） => 函数体
 */
class AnonymousFunctions {

  def main(args: Array[String]): Unit = {




    sayHelloFuc("leo")

    greeting(sayHelloFuc,"leo")

    sayHello2("fuck you")

  }

  /**
   * 函数 没有用函数名
   * 直接赋值给变量
   */
  var  sayHelloFuc = (name : String)=>println("hello , " +name)

  /**
   * map 中为一个
   * 匿名函数
   */
  Array(1,2,2,3,4,5,6,7).map((num:Int) => num*num )

  Array(1,2,2,3,4,5,6,7).map(num =>num*num )

  /**
   * 高阶用法  函数接收函数
   *func:(String)=>Unit
   * 接收一个返回值为Unit 且 参数为 String 的 函数
   * name:String
   *
   *
   */


  def  greeting(func:(String)=>Unit , name:String): Unit ={
    func(name)
  }


  /**
   * 将 函数作为返回值 使用
   *
   */


  def  greeting2(msg :String) = (name :String) => println(msg + " , " +name)


  val  sayHello2 = greeting2("hello")

  /**
   * 高阶 函数之 类型推断
   *
   * 对于 只有一个参数的 且 该参数在函数体内 只使用一次的
   * 可以使用下划线替代
   *
   */








}
