package horstman.example
object Name {
  def unapply(input: String) = {
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0, pos), input.substring(pos + 1)))
  }
}
object Number {
  def unapply(input: String): Option[Int] =
    try {
      Some(input.trim.toInt)
    } catch {
      case ex: NumberFormatException => None
      case ex => None
    }
}

object str178_1 extends App{
  val author = "Cay Horstmann 11"
  val Name(first, last) = author // Вызовет Name.unapply(author)
  println(first, last)


  println("123".toIntOption)

}
