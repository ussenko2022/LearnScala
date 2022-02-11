package horstman.example
object unicode extends App {
  def unicode_loop(x:String): Long ={
    var res:Long = 1
    for (i <- x){
      res *= i

    }
    res
  }

  def unicode_noloop(x:String): Long ={
    var res:Long = 1
    res = x.foldLeft(1L)(_ * _.toInt)
    res
  }

  def product_rec(s: String): Long = {
    if (s.toList.isEmpty) 1
    else {
      s.toList.head * product_rec(s.tail)
    }
  }


println(unicode_loop("Hello"))
println(unicode_noloop("Hello"))
println(product_rec("Hello"))
}
