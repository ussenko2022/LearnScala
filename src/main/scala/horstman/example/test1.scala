package horstman.example
import scala.io.StdIn
import scala.util.Try
object test1 extends App {
  val result =
    for (a <- Try { StdIn.readLine("a: ").toInt };
         b <- Try { StdIn.readLine("b: ").toInt })
      yield a / b
print(result.toString)
}