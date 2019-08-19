package highfuction


/**
 * 示例 将  函数 赋值给变量
 */
class Fuction2Var {


  def main(args: Array[String]): Unit = {

    sayHelloFuc("leo")

  }


  def  sayHello(name :String){println("Hello , "+name)}


  /**
   * 将方法 赋值给变量
   * 必须在 方法名称后面加上 空格和 下划线
   */
  val sayHelloFuc = sayHello _


}
