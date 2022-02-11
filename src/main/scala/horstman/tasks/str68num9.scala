package horstman.tasks

import scala.collection.mutable.ArrayBuffer

object str68num9 extends App{
  var arrBuff = ArrayBuffer(-1,1,2,3,-4,2,6,-7,3,5,-8)
  var arr0 = for (i <- arrBuff.indices if arrBuff(i) < 0 && i > 0) yield i

  for (i <- arr0.reverse) {
    arrBuff.remove(i)
  }

  println(arrBuff.toString())
}
