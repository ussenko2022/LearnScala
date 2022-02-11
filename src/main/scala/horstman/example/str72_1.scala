package horstman.example
object str72_1 extends App{
  val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8).withDefaultValue(0)
  println(scores.get("Alice1"))
  println(scores("Alice1"))
  println(scores.get("Alice"))
  println(scores("Alice"))
}
