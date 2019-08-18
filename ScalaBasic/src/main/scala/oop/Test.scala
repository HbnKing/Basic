package oop

import oop.Inner.Inners

import scala.collection.mutable.ArrayBuffer


object Test {


  def main(args: Array[String]): Unit = {

    var student = new Student
    println(student.age)
    println(student.name)
    student.setAge(19)
    println(student.age)



    println("student2")
    //getter  he  setter

    var  student2 = new Student2
    println(student2.age)
    student2.age_=(19)
    println(student2.age)


    println("S3")

    /**
     * 生成两种风格的getter  setter
     */
    var s3 = new Student3
    s3.name_=("newNAME")
    s3.name

    s3.setName("newName")
    s3.getName


    println("S4")

    var s4 = new Stduent4("leo")
    s4.name
    s4.getName

    println("construction")

    var  c1 = new Constrcut("leo")


    val  c2 = new Construct2("leo" ,32)



    println("Inner  class")

    val  inner1 = new InnerClass().inners
    val inner2 = new InnerClass().inners

    /**
     * 使用 泛型 来测试内部类
     * ArrayBuffer [T]
     *
     */

    val  arrays = new ArrayBuffer[]()
    println(inner1)
    println(inner2)







  }
}
