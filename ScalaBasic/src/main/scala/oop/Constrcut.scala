package oop


/**
 * 学习 scala  语法的构造函数
 * 定义多个 辅助构造函数
 * 他们之间可以互相调用
 *
 *
 */
class Constrcut {

  private  var name =""
  private var age = 0

  def this(name :String){
    // 需要先调用 主要构造方法
    this()
    this.name = name
  }

  def this( name:String ,age :Int){
    // 调用其他的构造函数
    this(name)
    this.age = age
  }

}
