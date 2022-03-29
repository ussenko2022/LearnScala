package horstman.tasks

object str200num9 extends App {
  """9. Реализуйте метод corresponds без карринга. Затем попробуйте
    |вызвать его из предыдущего упражнения. С какими проблемами вы столкнулись?""".stripMargin
  val a = Array("Hello", "World")
  val b = Array(5, 5)

  val b2 = Array(5, 6)
  //println(a.corresponds(b)(_.length == _))



  def correspondsCustom(arr1: Array[String], arr2:Array[Int], p: (String, Int) => Boolean): Boolean = {
    val i = arr1.iterator
    val j = arr2.iterator
    while (i.hasNext && j.hasNext)
      if (!p(i.next(), j.next()))
        return false
    !i.hasNext && !j.hasNext
  }

  println(correspondsCustom(a, b,_.length == _ ))
  println(correspondsCustom(a, b2,_.length == _ ))

}
