package workflow


import scala.util.control.Breaks
import scala.util.control.Breaks._
object Loop {
  def main(args: Array[String]): Unit = {

    /**
     * 1  while do  循环
     * 与java  类似
     *
     */


    var n = 10
    while (n >0){
      println(n)
      n -=1
    }

    /**
     * scala  没有 for  循环
     * 只能使用简易for
     */
    val   m  = 10

    //使用range
    for(i <- 1.to(m).reverse ){
      println(i)
    }

    //使用 until
    //  注意 until  不含 尾部
    // 思考 until  如何
    for(i<-  1 until(m)){
      println(i)
    }

    /**
     *
     * 跳出 循环
     * scala  没有 类似于 java  的 break
     * 但是可以使用  boolean  或者 return  来实现
     * 或者使用 Breaks  的 break  方法
     *
     */

    breakable{
      var n = 10
      for(i <- "Hello world"){
        if(n ==5){
          break
        }
        print(i)
        n -=1
      }

    }

    /**
     * 多重  for  循环
     *  打印 9*9 乘法表
     */

    println()

    for(i<- 1.to(9) ;j<-1.to(9)){

      if(j==9){
        println(i*j)
      }else{
        print(i*j +"  ")
      }

    }


    /**
     * if  守卫
     *
     */

    for(i <- 1 to 20 if i %2==0){
      print(i)
    }

    /**
     * 通过  yield   的 方式 构造 集合
     */
   var  colle =  for(i <- 1 to 20 if i %2 ==0 )yield i
    //scala.collection.immutable.Vector
    println(colle.getClass)

    for(data <- colle){
      println(data)
    }



  }

}
