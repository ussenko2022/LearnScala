package horstman.tasks

import scala.collection.mutable.ArrayBuffer

object  str68num6 extends App{
  var arr:ArrayBuffer[Int] = ArrayBuffer(1, 0, -1,0,  2,0,  -2,3, -3,4, -4,5, -5,6, -6,7, -7,8, -8,9, -9,10, -10, 0)
  for (i <- arr.sorted.reverse) println(i)

}
