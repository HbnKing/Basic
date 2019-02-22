/**
  *
  * @author wangheng
  * @create 2019-02-20 下午7:31
  * @desc
  *
  **/
object Fuction {

  def main(args: Array[String]): Unit = {
    sayHelloWorld("name",17)

    println(sum(10))

    println(fab(10))
    //参数顺序
    //未命名参数 必须在前面
    //参数 指定名  默认 值

    println(familyname("wh"))
    println(familyname("wh",lastName = "lastname"))
    println(familyname(lastName = "hhh",firstname = "fisrstname"))

    /**
      *变长参数
      *
      */

    println(sum(1,2,3,5))

    //1 to  5 返回的是一个rang  使用 ：_*  得到 每个元素
    println(sum(1 to 5: _*  ))

    println(sum2(1 to 5: _*  ))


    println( )
  }


  /**
    *
    * @param name
    * @param int
    *
    * def  定义函数
    * name  age  参数名
    * 后面 跟着 类型
    * unit  是 返回类型
    */

  def sayHelloWorld(name: String ,age: Int) = {

    if(age>18){
      println("audlt, age is" + age)
    }else{
      println("O  my  children  " +age)
    }
  }

  //可以不设置返回类型
  def  sum(n:Int): Int ={
    var result:Int = 0 ;
    for(i <- 0 to n){
      result +=i
    }

    result

  }

  /**
    * 递归调用
    *
    * @param n
    * @return
    */
  def  fab(n :Int):Int={

    if(n <=0) 1
    else

    fab(n-1)+fab(n-2)
  }


  /**
    *
    * @param firstname
    * @param middleName
    * @param lastName
    *
    */
  def  familyname(firstname :String ,middleName :String="",lastName:String=""){
    println("your name is  " + firstname + middleName + lastName)

  }


  /**
    * 变长参数
    *  sum(num :Int*)
    *  类型后面加 *
    *
    * @param num
    */
  def  sum(nums :Int*)={

    var result = 0
    for(num <- nums){
      result+= num

    }
    result
  }

  def sum2(nums:Int*): Int ={
    if(nums.length == 0) 0
    else nums.head + sum2(nums.tail:_*)

  }

  /**
    * 过程
    *
    * 没有使用 = 连接 这样的额函数 没有返回值
    * 称之为 过程
    */

  //会返回
  def  sayhello(name :String) = "hello , " +name

  //不会返回
  //过程
  def  sayhello2(name :String){println("hello , " +name);"hello , " +name}

  //不会返回
  //声明Unit
  def  sayhello3(name :String) :Unit = "hello , " +name

}
