package horstman.tasks

object str200num4 extends App {
 """4. Предыдущая реализация должна предусматривать специальный случай, когда n < 1.
    |Покажите, как избежать этого с помощью foldLeft.
    |(Ознакомьтесь с описанием foldLeft в Scaladoc.
    |Этот метод напоминает reduceLeft, за исключением """.stripMargin

  val factorial = (n:Int) => (1 to n).foldLeft(1)(_*_)

  println(factorial(-1))
  println(factorial(1))
  println(factorial(0))
  println(factorial(5))
}
