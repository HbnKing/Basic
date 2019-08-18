package objects

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午1:18
  * @desc
  *
  * object 的 apply  方法
  * 接收参数 创建对象
  **/
object ObjectApply {

  def apply(name :String) = new ObjectApply(name)

}

class ObjectApply(name :String){
}
