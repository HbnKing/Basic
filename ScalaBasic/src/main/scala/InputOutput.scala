/**
  *
  * @author wangheng
  * @create 2019-02-20 下午4:16
  * @desc
  *
  **/
object InputOutput {

  def main(args: Array[String]): Unit = {
    checkInputOupt

  }

  def checkInputOupt{

    println("please  show your name ")
    val  name = readLine()

    println("please show your age ")
    val age = readInt()

    if(age <18){
      println("you are  so young")
    }else{

      println("good man")
    }
    println("this is your message ")

    println("your name is "+ name +" your age  is " +age)


  }

}
