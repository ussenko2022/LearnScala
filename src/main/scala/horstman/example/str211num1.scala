package horstman.example

object str211num1 extends App {

  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List(2, 1, 3, 4, 5)
  val list3 = list1 :: list2
  println(list3)

  val set1 = Set(1, 2, 3, 4, 5, 9)
  val set2 = Set(1, 2, 3, 4, 5, 6, 7, 8)
  val set3 = set1 &~ set2
  println(set3)


  val lst = 1 :: 3 :: Nil

  println(lst.forall(_ == 3))


  println(lst.toArray)

  def ulcase(s: String) = Vector(s.toUpperCase(), s.toLowerCase())

  println(List(Vector("PETER", "peter"), Vector("PAUL", "paul"), Vector("MARY", "mary")))
  println(List("PETER", "peter", "PAUL", "paul", "MARY", "mary"))


  println("-3+++4".collect { case '+' => 1; case '-' => -1 }) // Vector(-1, 1)

  val arr1 = (Map[Char, Int]() /: "Mississippi") {
    (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
  }

  println(s"arr1 = ${arr1}")



}
