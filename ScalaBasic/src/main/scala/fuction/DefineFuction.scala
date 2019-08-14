package fuction

/**
 * 方法的定义
 * 以  def  开头
 */
object DefineFuction {


  /**
   * 定义一个方法
   * def 开头
   * 方法名  sayHello
   */
  def  sayHello()= {
    print("hello")
  }


  /**
   * 定义参数
   * name  age
   * 还规定他的类型
   *
   * @param name
   * @param age
   */
  @Override
  def sayHello(name :String,age :Int)={
    if(age >18){
      printf("welcome , %s you  are   %d   years  old ",name ,age)
    }else{
      printf("sorry ,%s  you are  to  young  ", name)
    }

  }


  /**
   * 单行函数
   *
   */


  def  sayHello2(name :String) = print("hi ," +name)


  /**
   * 在代码块中定义函数体
   * 示例为求和公式
   *
   */

  def sum(num :Int) ={
    var sum = 0
    for(i <- 1 to num) sum +=i
    sum
  }

  /**
   * 递归函数
   * 注意 递归函数必须明确 返回值得类型
   *
   * 示例为斐波那契数列
   *
   */

  def  fab(num :Int):Int= {
    if(num <=0)1
    else  fab(num-1) + fab(num-2)
  }



}
