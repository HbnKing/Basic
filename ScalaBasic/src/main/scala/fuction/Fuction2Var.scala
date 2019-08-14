package fuction

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午7:07
  * @desc
  *      直接将 方法   赋值 给 变量
  *
  *      函数也可以不需要命名
  *
  *
  **/
object Fuction2Var {

  def main(args: Array[String]): Unit = {


    def  sayHello(name :String) = "hi "+name

    var sayHelloFuction = sayHello _

    println(sayHelloFuction("leo"))

    /**
      * 函数不需要命名
      * 匿名函数
      */


    var  sayHello2 = (name:String)=>{println("hi  "+name)}

    sayHello2("leo2")


    /**
      * 高阶函数
      * 将一个 函数作为传入 和 返回
      *
      */

    //经典案例
    Array(1,2,3,4,5,6).map((num:Int)=>println(num*num))


    def greeting(func: (String) => Unit, name: String) { func(name) }
    greeting(sayHello2, "leo")

    //  函数调函数 返回函数

    def getGreetingFunc(msg: String) = (name: String) => println(msg + ", " + name)
    val greetingFunc = getGreetingFunc("hello")  //将 返回函数 赋值给 greetingFunc
    greetingFunc("leo")  //传入 name



    println("-------")
    def greeting2(func: (String) => Unit, name: String) { func(name) }
    greeting2((name: String) => println("Hello, " + name), "leo")
    greeting2((name) => println("Hello, " + name), "leo")
    greeting2(name => println("Hello, " + name), "leo")

    def triple(func: (Int) => Int) = { func(3) }
    triple(3 * _)



  }

}
