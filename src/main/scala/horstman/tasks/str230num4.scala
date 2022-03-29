package horstman.tasks


object str230num4 extends App {
  """4. Напишите функцию, принимающую коллекцию строк и ассоциативный массив, отображающий строки в целые числа. Она
    |должна возвращать коллекцию целых чисел, значения которых соответствуют строкам в ассоциативном массиве,
    |повторяющимся в исходной коллекции. Например, для Array("Tom",
    |"Fred", "Harry") и Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
    |функция должна вернуть Array(3, 5). Подсказка: используйте
    |flatMap для объединения значений типа Option, возвращаемых
    |методом get.
    |""".stripMargin

    def getValueCollectionRepeatedStrings(arrStr:Array[String], mapStrInt:Map[String , Int]): Array[Int] =
      arrStr.flatMap(mapStrInt.get)


  val testArrStr = Array("Tom", "Fred", "Harry")
  val testMapStrInt = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

  println(getValueCollectionRepeatedStrings(testArrStr, testMapStrInt).toList)
}
