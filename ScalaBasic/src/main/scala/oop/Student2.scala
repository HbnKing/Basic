package oop


/**
 * 示例 2
 *
 * 主要为 getter
 * 和 setter
 */
class Student2 {
  /**
   * 私有属性
   */
  private var myAge = 18


  private var height = 0 ;


  /**
   * setter 方法
   * @param newValue
   *
   * 注意 这个得我方法名是"age_="
   * 并且是无返回的过程
   */
  def  age_=(newValue: Int) {
    if(newValue >0)  myAge = newValue
    else println("data format error ")
  }

  /**
   * getter  方法
   * 有 "="表示有返回
   * @return
   */
  def age = myAge


  /**
   * 针对 private[this]
   * 属性 类的内部可以使用
   * 外部不能使用
   * @param student2
   * @return
   */
  def taller(student2: Student2) ={
    this.height>student2.height
  }





}
