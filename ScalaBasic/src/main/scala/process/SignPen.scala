package process

/**
  *
  * @author wangheng
  * @create 2019-03-08 下午6:07
  * @desc
  *
  **/

class SignPen {
  def write(content: String) = println(content)
}

object  SignPen{

  implicit val signPen = new SignPen

  def signForExam(name: String) (implicit signPen: SignPen) {
  signPen.write(name + " come to exam in time.")
}
}


