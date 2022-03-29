package horstman.tasks

object str200num7 extends App {
  """7. Получить последовательность пар очень просто, например
    |val pairs = (1 to 10) zip (11 to 20)
    |Теперь представьте, что необходимо что-то сделать с такой
    |последовательностью, например вычислить суммы значений
    |элементов пар. Для этой цели нельзя использовать
    |pairs.map(_ + _)
    |Функция _ + _ принимает два параметра типа Int, а не пару
    |(Int, Int). Напишите функцию adjustToPair, принимающую
    |функцию типа (Int, Int) => Int и возвращающую эквивалентную функцию, оперирующую парой.
    |Например, вызов adjustToPair(_ * _)((6, 7)) должен вернуть 42.
    |Затем воспользуйтесь этой функцией в комбинации с map для
    |вычисления сумм элементов в парах.""".stripMargin


  val pairs = (1 to 10) zip (11 to 20)
  println(pairs)
  def adjustToPair(op: (Int, Int) => Int)(pair: (Int,Int)): Int ={
    op(pair._1, pair._2)
  }

  println(adjustToPair(_ * _)((6, 7)))
  println(pairs.map(adjustToPair(_+_)))

}
