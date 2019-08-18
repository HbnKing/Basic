package oop

import com.sun.org.apache.bcel.internal.classfile.InnerClass

import scala.collection.mutable.ArrayBuffer


/**
 * 内部类
 * 很重要
 * 两个对象的内部类 不是你同一个内部类
 * 测试使用 ArrayBuffer  来执行
 */

class InnerClass {

  def main(args: Array[String]): Unit = {
   val  inner1 = new InnerClass
    val inner2 = new InnerClass

    val  s1 = inner1.getInners("leo")
    val s2 = inner2.getInners("leo")

    /**
     * 无法加入到一个arrayBuffer  中去
     */

    //inner1.students +=s2
  }


  class   Inners(name :String) {
  }

  val students = new ArrayBuffer[Inners]

  def getInners(name :String): Unit ={
    new Inners(name)
  }
}
