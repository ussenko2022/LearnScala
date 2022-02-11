package horstman.example
import scala.io.Source
object str135_1 extends App{

  val source1 = Source.fromURL("https://yandex.ru", "UTF-8")

  println(source1.mkString)
}
