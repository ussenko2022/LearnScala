package horstman.tasks

import scala.collection.mutable.ArrayBuffer

object str230num8 extends App {
  """8. Напишите функцию, превращающую массив значений Double
    |в двумерный массив. Число колонок должно передаваться
    |в виде параметра. Например, для Array(1, 2, 3, 4, 5, 6) и трех
    |колонок функция должна вернуть Array(Array(1, 2, 3), Array(4,
    |5, 6)). Используйте метод grouped.""".stripMargin

    def arrTo2dArrayDouble(arrDouble:Array[Double], n:Int): Array[Array[Double]] ={
      arrDouble.grouped(n).toArray
    }

  val newArr = arrTo2dArrayDouble(Array(1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13,14,15), 2)
  val arrForPrint = newArr.map(_.mkString(", ") )
  println("Array(" + arrForPrint.map("Array("+_ + ")").mkString(", ") + ")")

  println(newArr.map(_.toBuffer).toBuffer)
}
