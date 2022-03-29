package horstman.tasks

object str200num3 extends App {
  """3. Реализуйте функцию вычисления факториала с помощью методов to и reduceLeft без применения цикла или рекурсии"""


  //val fact: Int => Int = a => (1 to a).reduceLeft(_ * _)


  def factorial(n:Int): Int ={
    val fact = (nn:Int) => (1 to nn).reduceLeft(_ * _)
    assert(n >= 0, "n не может быть меньше нуля")
    if (n == 0) 1 else fact(n)

  }


  println(factorial(5))
  println(factorial(0))
  println(factorial(1))
  println(factorial(-5))
}
