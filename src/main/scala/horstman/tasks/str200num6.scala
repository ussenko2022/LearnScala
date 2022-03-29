package horstman.tasks

object str200num6 extends App {
  """6. Измените предыдущую функцию так, чтобы она возвращала
    |входное значение, соответствующее наибольшему выходному
    |значению. Например, вызов largestAt(fun: (Int) => Int, inputs: Seq[Int]) должен вернуть 5. Не используйте цикл или
    |рекурсию.""".stripMargin

  def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    val max: (Int, Int) => Int = (a, b) => if (a > b) a else b
    inputs.map(fun).reduceLeft(max)
  }


  println(largestAt(x => 10 * x - x * x, 1 to 10))
}
