package horstman.tasks

import scala.collection.mutable

object str78num1  extends App{
  val skidka_% = 99.0
  val items = mutable.LinkedHashMap("Book" -> 2300.0, "Juice" -> 210.0,"Pencil" -> 50.0)
  val items2 = for ((k, v) <- items) yield (k, v - (v * skidka_% /100.0))
  println(items)
  println(items2)
}
