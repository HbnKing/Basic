package currying


/**
 *
 */
object Curry {



  def  sum0(a :Int ,b :Int) = {a + b}


  def  sum1(a :Int) = (b:Int) =>{a +b }


  def  sum2(a:Int)(b:Int) = { a  + b }

}
