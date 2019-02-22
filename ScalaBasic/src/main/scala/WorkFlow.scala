import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
  *
  * @author wangheng
  * @create 2019-02-20 下午3:39
  * @desc
  * scala 流程控制 语句
  *
  **/
object WorkFlow {


  def main(args: Array[String]): Unit = {



    //val result:Any = checkage

    //checkwhile

    //checkfor

    //breakType1()
    //Exception in thread "main" scala.util.control.BreakControl
    //breakType2()

    checkforTwice()

    checkif()


  }


  /**
    * if  else
    */
  def checkage: Any ={
    val  age = 30
    if(age>20)
      1
    else
      println("young man")
      age

    //---
    //这个相当于在  else  什么都不做

    if(age>20)
      1
    else
      ()

    if(age>20)
      1


    /**
      * 复杂操作
      */
    if(age>20){

    }else{

    }

    var a,b,c  = 0
    //一行 里面多行语句 还是要使用分割符号 分开
    if(a <1){b = b+1 ;c = c+1}


  }


  def  checkwhile{
    var n = 10 ;
    while (n>0){
      println(n)
      n = n-1
      //需要导入包  import scala.util.control.Breaks._
      if(n ==5) break;
    }

  }


  def checkfor {
    //打印 1-10
    for(i <- 1 to 10){
      println(i)

    }



    // 使用until  返回是一个rang
    //含头 不含尾
    for(i <- 1 until 10){

      if(i == 4){

        break;
      }
      println(i)
    }


    for(c <- "hello world")
      println(c)
  }




  def breakType1(): Unit ={
    var loop = Breaks
    loop.breakable{
      for (num <- 1 to 10 if (num % 2 == 0)){
        print(" " + num)
        if(num == 10)
          loop.break()
      }
    }
  }

  //会有异常 Exception in thread "main" scala.util.control.BreakControl
  def breakType2(): Unit ={
    var loop = Breaks
    var num = 10
    while (num > 0){
      num -= 1
      print(" " + num)
      if (num == 4){
        loop.break()
      }
    }
  }


  def  checkforTwice(){
    //for 推导式
    for(i <- 1 to 10 )yield(i)

    for(i <- 1 to 9;j <-1 to 9 ){
      if(j == 9){
        println(j*i)
      }else{
        print(i *j +" ")
      }
    }

  }

  //if 守卫
  def  checkif(){
    for(i <- 1 to 10 if(i%2==0) )println(i)

  }










}
