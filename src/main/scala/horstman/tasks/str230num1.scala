package horstman.tasks

import scala.collection.mutable

object str230num1 extends App {
  """1. Напишите функцию, возвращающую для указанной строки отображение индексов всех символов. Например, вызов
    |indexes("Mississippi") должен вернуть ассоциативный массив,
    |связывающий 'M' со множеством {0}, 'i' – со множеством {1,
    |4, 7, 10} и т. д. Используйте изменяемый ассоциативный массив, отображающий символы в изменяемые множества. Как
    |обеспечить сортировку индексов в пределах множеств?
    |
    |2. Реализуйте предыдущее упражнение с использованием неизменяемого ассоциативного массива символов в списки.""".stripMargin



    def indexes(str: String): Map[Char, mutable.SortedSet[Int]] ={
      var arr = Map[Char, mutable.SortedSet[Int]]()
      val charArray = str.toCharArray
      for (i <- charArray.indices) {
        if (arr.contains(charArray(i))) arr = arr +  (charArray(i) -> {arr(charArray(i)) + i})
        else arr = arr +  (charArray(i) -> {mutable.SortedSet(i)})
      }
      arr
    }

  println(indexes("Mississippi"))

}
