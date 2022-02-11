package horstman.example
object testPerson extends App {
  val myPerson = new Person("Fred Smith")
  println(s"${myPerson.lastName} | ${myPerson.firstName}")
}
