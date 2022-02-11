package horstman.tasks

import scala.collection.immutable.HashMap

object str80num8 extends App{
  def minmax(values: Array[Int]) ={
    HashMap(values.min -> values.max)
  }

  print(minmax(Array(1,2,3,4,5,6,7,8,9,10)))
}
