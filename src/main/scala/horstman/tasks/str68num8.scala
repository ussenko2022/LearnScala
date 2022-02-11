package horstman.tasks

import scala.collection.mutable.ArrayBuffer

object str68num8 extends App{
  var arrBuff = ArrayBuffer(-1,1,2,3,-4,2,6,-7,3,5,-8)
  var arr0 = for (i <- arrBuff.indices if arrBuff(i) < 0) yield i
  arr0 = arr0.reverse
  for (i <- 0 until arr0.length - 1) arrBuff.remove(arr0(i))
  println(arrBuff.toString())
}
