package array

import scala.collection.mutable.ArrayBuffer

/**
  *
  * @author wangheng
  * @create 2019-02-21 下午7:02
  * @desc
  *
  * scala  里面的 array  和 arrayBuffer
  * 可以理解wei  Java 里面 的 array  和 arraylist
  *
  *
  * 数组 和 数组 的遍历
  *
  * Array  长度 不可变的数组
  * Scala  的数组 本质就是 java 的 数组
  **/
object ArrayArrayBuffer {

  def main(args: Array[String]): Unit = {
    //scala  数组的 初始化

    //一个 10长度的 int 数组
    val  a = new Array[Int](10)
    val  b = new Array[String](10)



    //可以直接使用Array() 创建数组  类型自动推断
    // 这个是半生对象的用法
    //这个自动推断为 Any  类型
    val  c = Array("hello",1);
    c(1) = "bb"
    println(c(1))




    /**
      * ArrayBuffer
      * 长度可变的
      * 注意元素的操作
      * 没有add
      * addAll
      * 而是用 +=
      * ++=
      */

    val  ab = ArrayBuffer[Int]()
    ab += 1 ;
    ab += 2
    ab += (2,4,5,6)
    ab ++=Array(7,8,9)

    //从后面截断五个
    ab.trimEnd(5)

    //指定位置插入  插入多个
    //  第一个元素 是位置  第二个以后是 元素 值
    ab.insert(4,9)
    ab.insert(4,9,8,7,6)
    // 指定位置删除
    ab.remove(1,2)
    println(ab)

    ab.toArray  //转换为 array

    val   ac = c.toBuffer  //转换为 buffer
    ac += 1 ;
    println(ac)


    /**
      * 如何遍历
      * 1  通过角标
      * 2 增强for  循环
     *
      */

    for(i <- 0 until ac.length) print(ac(i))
    println()

    for(i <-(0 until ac.length).reverse) print(ac(i))
    println()

    //跳跃
    for(i <- 0 until (ac.length,2)) print(ac(i))
    println()

    for(e <- ac) print(e)


    println()

    val bb = Array(1,2,4,5,7,8,9,6,3)
    println(bb.max +"  "+ bb.min)

    //排序
    scala.util.Sorting.quickSort(bb)
    println(bb.mkString)
    println(bb.mkString(","))


    /**
      * 数组的转换
      * 求他们的平方
     *
      */

    val  cc = Array[Int](1,2,3,4,5,6,7,8,9)
    val cd = for(i <- cc)yield i*i
    println(cd.mkString)

    val ce = ArrayBuffer[Int]()
    ce +=(1,2,3,4,5,6,7,8,9)
    val cf = for(i<-ce)yield i*i
    println(cf.mkString)


    val cg = for(i<-ce if i%2==0)yield i*i
    println(cg.mkString)

    ce.filter(_%2 == 0).map(2*_)
    //val ch = ce.filter(_%2 == 0).map(x =>math.pow(x ,2))
    val ch = ce.filter(_%2 == 0).map(x =>x*x)
    println(ch.mkString(","))

    /**
      *算法 案例
      *移除第一个 负数之后 的 所有负数
      */

    removeFirst()


    val  ee = ArrayBuffer[Int]()
    ee+= (1,2,3,4,5,6,7,-1,-4,3,5,7,-5)

    var isNagative =false

    val  ea = for(ele <-ee if !isNagative || ele >=0 )yield{
      if(ele <0)  isNagative =true ;
      ele
    }

    println(ea.mkString)

  }


  /**
    * 这个删除
    */
  def  removeFirst(): Unit = {
    val  FoundFirst = false
    val a = ArrayBuffer[Int]()

    var length = a.length
    a += (1,2,3,4,5,6,7,-1,-4,3,5,7,-5)
    var index = 0 ;

    while (index < length){
      if(a(index)>=0){

        index+=1
      }else{
        if(FoundFirst == false){FoundFirst==true;index+=1;
        }else{
          a.remove(index);
          length -=1;
        }
      }

    }


  }

}
