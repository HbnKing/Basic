package fuction

import java.io.IOException

/**
  *
  * @author wangheng
  * @create 2019-02-21 下午6:43
  * @desc
  *
  * 异常处理
  *
  **/
object Exception {


  def main(args: Array[String]): Unit = {

    /**
      *
      * catch  Excepiton
      * 涉及到 模式匹配
      *
      */
    try {
      throw new IllegalArgumentException("x  should  ")

    }catch {
      // 如果是异常 但是没有被捕获 则 程序 退出 ，比如 抛出ioexception
      case _:IllegalArgumentException =>println("sorry")
    }finally {
      println("release  resource !")

    }


    try {
      //throw new IllegalArgumentException("x  should  ")
      throw new IOException("io exception")

    }catch {
      case _:IllegalArgumentException =>println("sorry")
      case _:IOException =>println("sorry  io  exception")
    }finally {
      println("release  resource !")

    }

  }

}
