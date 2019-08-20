package highfuction

object Fuctions {

  def main(args: Array[String]): Unit = {
    println("hello")

    Array(1,2,3,4,5,6,7,8,9).map(2*_).foreach(println _)
    (1 to 9).map("*" * _).foreach(println(_))


    (1 to 20 ).filter( _%2 == 0 ).foreach( println )

    // 相乘操作
    (1 to  9 ).reduceLeft(_ * _)


    Array(1,4,6,3,2,1,3,5,7,9,0).sortWith(_<_).foreach(println(_))


  }


}
