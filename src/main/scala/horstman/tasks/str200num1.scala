package horstman.tasks

import scala.collection.immutable.HashMap

object str200num1 extends App {
"""
    |1. Напишите функцию values(fun: (Int) => Int, low: Int, high:
    |Int), возвращающую коллекцию из значений в указанном диапазоне.
    |Например, вызов values(x => x * x, -5, 5) должен вернуть коллекцию пар (-5, 25), (-4, 16), (-3, 9), ..., (5, 25).
    |
    |""".stripMargin

  def values(fun: (Int) => Int, low: Int, high: Int): List[(Int, Int)] = {
    (low to high).map(x => x -> fun(x)).toList
  }

  def values2(fun: (Int) => Int, low: Int, high: Int): List[(Int, Int)] = {
    ((low to high) zip (low to high).map(fun)).toList
  }

  println(values(x=> x * x, -5, 5 ))
  println(values2(x=> x * x, -5, 5 ))
  println(values(x=> x * -1, -5, 5 ))
  println(values2(x=> x * -1, -5, 5 ))
  println(values(x=> x + x, -5, 5 ))
  println(values2(x=> x + x, -5, 5 ))
}
