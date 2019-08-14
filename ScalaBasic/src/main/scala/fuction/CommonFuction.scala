package fuction

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午7:59
  * @desc
  *
  *     常用的 一些 scala  高阶 函数
  *
  **/
object CommonFuction {


  def main(args: Array[String]): Unit = {


    Array(1,2,3,4,5).map(_*2)

    (1 to 9).map("*" * _ ).foreach( println _ )

    (1 to 9).filter(_ %2 ==0).foreach( println _ )

    (1 to  9) .reduceLeft(_ * _)  //1*2 *3 *4


    Array(1,3,6,9,1,23,4,56,7,8).sortWith(_<_)



  }

}
