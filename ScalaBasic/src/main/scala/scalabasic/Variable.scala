package scalabasic


/**
 * 常量与变量
 *
 */
object Variable {

  // 主方法
  def main(args: Array[String]): Unit = {

   // var  可以从新赋值的 变量
    //  自动推断类型
    // 但是不能改变类型
    var data = "12"
    print(data)
    data = "11"
    print(data)
   // data = 23

    //val  修饰的为常量，不可变
    val data2 = "test"
    print(data)
     //不能赋值 新的值
   // data2 = "tt"


    /**
     * 指定数据类型
     * 好处 使用泛型  父类型等
     */
     //只能 定义为 Int
    var data3 : Int  = 11
    data3=123

    //Any  所有类型的父类型
    var data4 :Any = ""
    data4 = 11







  }

}
