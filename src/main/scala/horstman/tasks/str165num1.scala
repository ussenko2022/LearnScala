package horstman.tasks

import java.awt.geom.Ellipse2D
trait RectangleLike{
  this:Ellipse2D.Double=>
  def translate(x:Double = this.x,y:Double = this.y, w:Double = this.width, h:Double = this.height){
    this.x = x
    this.y = y
    this.width = w
    this.height = h
  }
  def grow(x:Double = 0,y:Double = 0, w:Double = 0, h:Double = 0 ){
    this.x += x
    this.y += y
    this.width += w
    this.height += h
  }
  def consoleInfo(): Unit = {
    println("x: " + this.getX + " | y: " + this.getY + " | w: " + this.getWidth + " | h: " + this.getHeight)
  }
}

object str165num1 extends App {
    val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike
    egg.translate()
    egg.consoleInfo()

    egg.translate(0,0)
    egg.consoleInfo()

    egg.translate(10, -10)
    egg.consoleInfo()

    egg.grow(10, 20)
    egg.consoleInfo()

    egg.grow(100, 100,100,100)
    egg.consoleInfo()



}
