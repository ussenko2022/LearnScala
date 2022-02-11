package horstman.tasks

object str68num1 extends App {
  var n = 100
  var arr:Array[Int] = new Array[Int](n)
    for (i <- 0 until n) arr(i) = i
  println(arr.mkString("-"))
}

