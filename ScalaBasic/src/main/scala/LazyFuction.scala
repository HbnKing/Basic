import  scala.io.Source._
/**
  *
  * @author wangheng
  * @create 2019-02-21 下午6:16
  * @desc
  *
  **/
object LazyFuction {


  def main(args: Array[String]): Unit = {
    /**
      * lazy 修饰 的
      * 惰性求值
      * 只有在 使用的时候 才会调用
      * 即使当前文件不存在也不会报错
      * 只有在使用
      *
      * 则只有在第一次使用该变量时，
      * 变量对应的表达式才会发生计算。
      * 这种特性对于特别耗时的计算操作特别有用，
      * 比如打开文件进行IO，进行网络IO等。
      */
    lazy val  line  = fromFile("README.md").mkString

    println(line)

  }




}
