package process

import scala.collection.mutable

/**
  *
  * @author wangheng
  * @create 2019-03-06 上午10:43
  * @desc
  *
  **/
object ScalaList {

  def main(args: Array[String]): Unit = {

    //List  代表的是不可变序列

    var list = List(1,2,3,4,5,6,7)
    //class scala.collection.immutable.$colon$colon
    println(list.getClass)


    //  使用:: 在头部 添加一个元素
    println(0::list)

    while (list !=Nil){
      println(list.head)

      list = list.tail
    }


    println("LinkedList   代表的是 可变集合  ")
    var  linkedList = mutable.LinkedList[Int](1,2,23,44,66)
    //使用 ele  .next  可以 调用他的头部 和 尾部


    println(linkedList.elem)
    println(linkedList.head)

    // LinkedList
    // 案例   每个元素 值 乘以2
    //  隔一个元素 值 乘以 2
    println("LinkedList   案例一  ")
     while (linkedList.next !=Nil){
      println(linkedList.elem)

      linkedList.elem = linkedList.elem*2

      linkedList = linkedList.next

    }










  }
}
