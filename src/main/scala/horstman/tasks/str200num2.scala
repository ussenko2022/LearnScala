package horstman.tasks

object str200num2 extends App {
  """2. Как получить наибольший элемент массива с помощью метода
    |reduceLeft?""".stripMargin

  println((1 to 911).reduceLeft((a, b) => if (a > b) a else b))


  val max: (Int, Int) => Int = (a, b) => if (a > b) a else b
  println((100 to 12414).reduceLeft(max))
}
