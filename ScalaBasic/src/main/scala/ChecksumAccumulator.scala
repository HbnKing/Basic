/**
  *
  * @author wangheng
  * @create 2019-02-28 上午11:45
  * @desc
  *
  **/
import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) {
    sum += b
  }
  def checksum(): Int = ~(sum & 0xFF) + 1
}


/**
  * object  与 class 类似
  * 但是不能定义 构造参数 和 不能new
  *   也可以继承 抽象类，并覆盖 抽象类的方法
  */
object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      println("s:"+s+" cs:"+cs)
      cs
    }

  def main(args: Array[String]) {
    println("Java 1:"+calculate("Java"))
    println("Java 2:"+calculate("Java"))
    println("Scala :"+calculate("Scala"))
  }
}