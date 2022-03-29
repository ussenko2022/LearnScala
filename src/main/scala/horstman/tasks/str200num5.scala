package horstman.tasks

object str200num5 extends App {
  """5. Напишите функцию largest(fun: (Int) => Int, inputs: Seq[Int]),
    |возвращающую наибольшее значение функции внутри заданной последовательности. Например, вызов largest(x => 10 * x
    |- – x * x, 1 to 10) должен вернуть 25. Не используйте цикл
    |или рекурсию""".stripMargin

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    val max: (Int, Int) => Int = (a, b) => if (a > b) a else b
    inputs.map(fun).reduceLeft(max)
  }


  println(largest(x => 10 * x - x * x, 1 to 10))
}
