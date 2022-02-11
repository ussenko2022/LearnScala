package horstman.example

import horstman.tasks.str104num6

object testOrigin extends App{
  var or = Origin
  or.x = 1
  or.y = 2
 println(or.getLocation)

  var or2 = Point(1,2)
  println(or2)

  println(str104num6.values.toString())

  println(str104num6.isRed(str104num6.Clubs))

}
