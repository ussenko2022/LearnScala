package horstman.example
class Point (myX:Int, myY:Int) extends java.awt.Point{
  this.x = myX
  this.y = myY

}

object Point {
  def apply(x:Int, y:Int) = new Point(x,y)
}
