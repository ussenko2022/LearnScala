package horstman.example

object str225num1 extends App{
  val palindromicSquares = (100000 to 100000000).view
    .map(x => x * x)
    .filter(x => x.toString == x.toString.reverse)

  println(palindromicSquares.take(1000).mkString(","))

}
