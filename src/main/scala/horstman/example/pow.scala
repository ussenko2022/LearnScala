package horstman.example
object pow extends  App {
  def pow(x: Double, n: Int): Double = {
     if (n < 0) {
      1 / (x - n)
    } else if (n % 2 == 1 && n > 0) {
      x * pow(x, n - 1)
    } else if (n % 2 == 0 && n > 0) {
      val y = pow(x, n / 2)
      y * y
    }
   else {
         1
    }
  }

  print(pow(2, 3))
}
