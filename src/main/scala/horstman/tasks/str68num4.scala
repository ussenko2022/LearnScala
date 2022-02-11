package horstman.tasks

import scala.collection.mutable.ArrayBuffer

object str68num4  extends App{
    var mainArr = ArrayBuffer[Int]()
    var arr:ArrayBuffer[Int] = ArrayBuffer(1, 0, -1,0,  2,0,  -2,3, -3,4, -4,5, -5,6, -6,7, -7,8, -8,9, -9,10, -10, 0)
    for (i <- arr.indices if arr(i) > 0 ) mainArr.append(arr(i))
    for (i <- arr.indices if arr(i) < 1 ) mainArr.append(arr(i))

    println(mainArr)



}
