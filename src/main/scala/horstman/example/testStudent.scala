package horstman.example
object testStudent extends App {
  val myStudent = new Student("Fred", 1)
  println(myStudent.info)
  println("-")
  println(myStudent.getName)
  println(myStudent.getId)
  println("-")
  println(myStudent.name)
  println(myStudent.id)

}
