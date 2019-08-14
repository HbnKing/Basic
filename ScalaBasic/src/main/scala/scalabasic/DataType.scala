package scalabasic


/**
 * scala  基本数据类型
 * 与java  基本数据类型一致
 * 但是不区分包装和 非包装类
 */
object DataType {
  def main(args: Array[String]): Unit = {

    val  a :Int = 130
    print(a)
    val b :Short = 12;
    print(b)

    val c:Byte = 'c'
    val d :Long = 2134248
    val float1:Float = 1.2f
    val double1 :Double = 12.3

    val flag1:Boolean  = true

    val cc :Char ='A'


    //理解 1+1
    // 1 这个对象使用 .+()   fuction

    1+1
    1.+(1)


    /**
     * scala  没有++  / --  操作
     * 但是提供了+=  / -=  的 操作
     */


    var value:Int = 100
    value +=10
    value -=10




  }

}
