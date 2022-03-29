package horstman.tasks

object str230num6 extends App {
  """6. Пусть имеется список lst целых чисел, что означает выражение
    |(lst :\ List[Int]())(_ :: _)? (List[Int]() /: lst)(_ :+ _)? Что
    |можно изменить здесь, чтобы перевернуть список?""".stripMargin

    val lst = List(1,2,3,4,5,6)
    println((lst.reverse :\ List[Int]())(_ :: _))
    println((List[Int]() /: lst.reverse)(_ :+ _))
}
