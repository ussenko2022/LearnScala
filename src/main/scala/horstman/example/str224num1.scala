package horstman.example

object str224num1 extends App{
  def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)
  val tenOrMore = numsFrom(10)
  tenOrMore.tail.tail.tail
  println(tenOrMore)

  val squares = numsFrom(1).map(x => x * x)
  squares.tail.tail.tail
  println(squares)
  squares.take(1).force
  println(squares)

  //squares.force // Нет!
}
