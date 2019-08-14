package process

/**
  *
  * @author wangheng
  * @create 2019-02-28 下午8:25
  * @desc
  *
  **/
object SAM {


  def main(args: Array[String]): Unit = {
    import java.awt.event._

    import javax.swing._

    val button = new JButton("Click")
    button.addActionListener(new ActionListener {
      override def actionPerformed(event: ActionEvent) {
        println("Click Me!!!")
      }
    })

    implicit def getActionListener(actionProcessFunc: (ActionEvent) => Unit) = new ActionListener {
      override def actionPerformed(event: ActionEvent) {
        actionProcessFunc(event)
      }
    }
    button.addActionListener((event: ActionEvent) => println("Click Me!!!"))

  }
}
