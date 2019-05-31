import scala.beans.BeanProperty

/**
  *
  * @author wangheng
  * @create 2019-02-22 下午4:52
  * @desc
  *
  * java  风格的 getter  和 setter
  **/
class Students extends  {

  /**
    *@BeanProperty
    * 修饰 后 会自动生成 java  风格 的getter  setter
    */
  @BeanProperty var name :String = ""

}




class School{
  private  var  name =""
  private var num = 0

  /**
    * 构造方法
    * 之间的互相调用
    * 第一行 必定要调用主构造 函数
    * this()
    * @param name
    */
  def this(name:String){
    //调用主 构造方法
    this()
    this.name = name;
  }


  def  this(name:String,num :Int){
    this(name)
    this.num = num
  }

}

class  Teacher(@BeanProperty var name :String)


class City(var name:String = ""){
  println("name is" +name)
  var age = 0
  def  this(name :String,num  :Int){
    this(name)
    this.age = num

  }
}

