/**
  *
  * @author wangheng
  * @create 2019-02-28 上午11:09
  * @desc可以
  *
  * object  和 class  互相访问私有对象
  *
  *
  **/
object Dog {

  /**
    * 通用属性 就放在 object 里面
    * 只会实例化一次
    */
  private val eyeNum =2

  println("dog has " +eyeNum +"eyes")


}


class Dog{
  private  val  legnum = 4
  def  say={
    println("this dog has  " +Dog.eyeNum+"eyes")
  }

}

