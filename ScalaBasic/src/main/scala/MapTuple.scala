import scala.collection.{SortedMap, mutable}


/**
  *
  * @author wangheng
  * @create 2019-02-22 上午10:26
  * @desc
  *
  * Map  Tuple
  **/
object MapTuple {

  def main(args: Array[String]): Unit = {

    /**
      * map  默认不可变
      * class scala.collection.immutable.Map$Map3
      * 使用的是 immutable 类
      */
    val  ages = Map("Leo"-> 20 ,"Marry" ->28, "Tom"->12)
    println(ages.mkString)
    println(ages.getClass)

    /**
      * Error:(21, 5) value update is not a member of scala.collection.immutable.Map[String,Int]
      * ages("Leo") = 21
      * 尝试 修改的 时候回报错
      */
    //ages("Leo") = 21


    /**
      * scala.collection.mutable
      */
    val  ages2 = scala.collection.mutable.Map( "Marry" ->28, "Tom"->12,"Leo"-> 20)

    //ages2("Leo") = 21



    println(" Map is " + ages2.mkString)

    /**
      * 创建一个hashMap
      */

    val  age3 = scala.collection.mutable.HashMap[String,Int]("Leo"-> 20 ,"Marry" ->28, "Tom"->12)


    println(age3)

    /**
      * 创建一个空的 map
      */


    val  age4 = new mutable.HashMap[String,Int]()

    /**
      * Error:(56, 17) trait Map is abstract; cannot be instantiated
      * val  age5 = new mutable.Map[String,Int]()
      */
    //val  age5 = new mutable.Map[String,Int]()



    /**
      * 创建一个hashMap
      */

    val  age6 = scala.collection.mutable.HashMap[String,Int]("Leo"-> 20 ,"Marry" ->28, "Tom"->12)


    /**
      * 根据 key  获取 value
      * 不存在会报错
      * Exception in thread "main" java.util.NoSuchElementException: key not found: jack
      * at scala.collection.MapLike$class.default(MapLike.scala:228)
      * at scala.collection.AbstractMap.default(Map.scala:59)
      * at scala.collection.mutable.HashMap.apply(HashMap.scala:65)
      * at MapTuple$.main(MapTuple.scala:79)
      * at MapTuple.main(MapTuple.scala)
      */

    //println(age6("jack"))


    val  jackage = if(age6.contains("jack")) age6("jack") else 0

    val  jackage2 =age6.getOrElse("jack",0)

    /**
      * 添加元素
      * 如果已存在 会覆盖
      * 没有会添加
      */
    age6 +=("Tom" -> 33 ,"gy" ->12)
    println(age6)

    age6 -= "Tom"
    println(age6)

    /**
      * 对 Imuntable  map  的 操作
      * 本身是不可以变的  但是可以生成新的 map
      */


    val  age7 = Map[String,Int]("Tom" -> 33 ,"gy" ->12)

    println(age7.mkString)

    val  age8 = age7 +("Mike"->21,"Tom" -> 18) -"Mike" +("Mike"->18)
    println(age8.mkString)
    println(age8.getClass)


    /**
      * Map 的遍历
      */

    for((key,value)<- age8)println(key +": "+value)
    for((key)<- age8.keySet)println(key )
    for((value)<- age8.values)println(value)

    var age9 = for((key,value)<- age8)yield (value,key)
    println(age9.mkString)
    println(age9.mkString)


    /**
      * Map  的 排序
      * sortedMap 和 LinkedHashMap
      *
      * SortedMap  使用的是 class scala.collection.immutable.TreeMap
      */



    val  age10  = SortedMap[String,Int]("Marry" ->28, "Tom"->12,"Leo"-> 20)
    println(age10.mkString)
    println(age10.getClass)


    /**
      * 维护插入的顺序
      * 覆盖 不影响 插入的顺序
      */
    val  age11 = new mutable.LinkedHashMap[String,Int]()
    age11 += ("wh" ->13)
    age11 += ("ac" ->13)
    age11 += ("ab" ->13)
    age11 += ("ac" ->17)

    println(age11.mkString)




  }

}
