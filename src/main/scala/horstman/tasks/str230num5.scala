package horstman.tasks

object str230num5 extends App {
  """5. Реализуйте функцию, действующую подобно mkString, используя reduceLeft.""".stripMargin

    def customMkString(lst:List[String], sep:String): String = lst.reduceLeft(_ + sep +  _)



  println(List("1","2","3","4","5").mkString("|"))
  println(List(1,2,3,4,5).mkString("|"))
  println(customMkString(List("1","2","3","4","5"), "|"))
}
