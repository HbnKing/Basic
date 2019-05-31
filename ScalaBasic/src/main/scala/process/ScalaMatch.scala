package process

import java.io.{FileNotFoundException, IOException}

/**
  *
  * @author wangheng
  * @create 2019-03-06 下午2:57
  * @desc
  *
  *
  * match  {case   值 =>  语法}
  * 只要有一个分支匹配中 就不会 继续匹配
  * 与 java 的 break  不同
  **/
object ScalaMatch {

  def main(args: Array[String]): Unit = {

      getLevel("E")

    //var e = new IllegalArgumentException("xxx")
    var e = new FileNotFoundException("eeee")
    processException(e)



  }


  def  getLevel(grade:String)={
    grade match {
      case "A" =>println("Exellent")
      case "B" =>println("Good")
      case "C" =>println("just so so")
      case "D" =>println("Ai ,  ")
        //  if守卫  可以 对  case 的情况 细化
      case "E" if  grade.length>0  =>println("xxx")
      case  _grade =>println("xxxx")
      case _ =>println("you  need  work  harder ")
    }
  }



  //  case  变量 ：值类型 =>代码
  def  processException(e:Exception){
    e  match {
      case  e :IllegalArgumentException =>{
        println("IllegalArgumentException")
      }
      case e :FileNotFoundException =>println("cannot  find  that  file")

      case e1:IOException =>println("io")
    }

  }
}
