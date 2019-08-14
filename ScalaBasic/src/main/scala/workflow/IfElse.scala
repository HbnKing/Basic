package workflow

object IfElse {

  def main(args: Array[String]): Unit = {

    var age:Int = 30

    if(age >35) print("35了 还找工作")else print("可以来试试")

    //  if  else  返回变量  并赋值

    val  res :Int = if(age>35) 1 else  0

    print(res)

    var isOK:Int = -1

     if(age >35) isOK = 1 else isOK = 0
    print(isOK)


    /**
     * 自动类型推断
     * 可以返回多种类型
     */
    val isAudlit =  if(age >18) "Audlit" else 0
    print(isAudlit)  //这里返回的是 Any类型

    //没有返回值得情况

    // 这种返回的是 unit  类似于 java  中的 null  和 void

    if(age >18) "Audlit"
    if(age >18) "Audlit" else ()

    //  if  多行编写

    val res3 = if(age >18){
      val  data = "adfa"
      //  最后一个值 为 返回值
      data

    }else{

      val data = 12
      data
    }


    print(res3)








  }

}
