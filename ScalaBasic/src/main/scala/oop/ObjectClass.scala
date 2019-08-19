package oop

import objects.{Dog, ObjectApply, Person, Season, Students, Teacher}

/**
  *
  * @author wangheng
  * @create 2019-02-22 下午3:03
  * @desc
  * 定义一个简单的类
  * field  的 getter  和 setter
  * constructor
  * 内部类的介绍
  *
  **/
object ObjectClass {


  def main(args: Array[String]): Unit = {
    val  helloWorld = new HelloWorld()
    helloWorld.sayHello()
    println(helloWorld.getName)

    println(helloWorld.address)


    println(helloWorld.school)
    //helloWorld.school_=("不知道")




    var  s = new Students("")
    //s.name
    //s.name_=""
    //s.setName("")
    //s.getName

    var t = new Teacher("leo")
    t.setName("")
    t.getName

    var  ss = new School("")
    var  s1 = new School("name")
    var  s2 = new School("name",10)

    /**
      * 主构造方法
      */

    var  ccc = new City("iu")

    println("-------------")
   // var  dog = Dog

    //new Dog  如果 属性内 引用了 objec  Dog 的属性 在调用的时候 才会初始话 objectdog
    //在执行本类对象
    var dog2 = new Dog
    println("........")
    dog2.say


    var applys = ObjectApply("lucy")



    println(Season(0))
    println(Season.withName("spring"))
    for(ele <- Season.values){
      println(ele)
    }



    val  p = new Person("leo")
    println(p.sayHello("leo"));
  }
}
