package horstman.example

object str78_1 extends App{
  val symbols = Array("<", "-", ">")
  val counts = Array(2, 10, 2)
  val pairs = symbols.zip(counts)
  println(pairs.toBuffer.toString())
  println(pairs.toMap)
  for ((s, n) <- pairs) Console.print(s * n)
}
