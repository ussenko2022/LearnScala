package horstman.example

object str190num1 extends App{
  def runInThread(block: => Unit) {
    new Thread {
      override def run() { block }
    }.start()
  }

  runInThread {
    println("Hi")
    Thread.sleep(1000)
    println("Bye")
  }

  (1 to 9).map("x" * _).foreach(println)

  println((1 to 9).reduceLeft(_*_))
  println((1 to 9).foldLeft(1)(_*_))
  println((1 to 9).product)


  println((1 to 9).reduceLeft(_+_))
  println((1 to 9).foldLeft(0)(_+_))
  println((1 to 9).sum)


  val arr = "Mary had a little lamb".split(" ").sortWith(_.length < _.length)
  println(arr.toList)
  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  def myWhile(condition: Boolean)(block: => Unit) {
    if (condition) {
      block
      myWhile(condition)(block)
    }
  }

    var count = 1
    myWhile (count < 100) {

      println(count)
      count+=1
    }

  println(count)


  def mul(a: => Int)(b: =>Int): Int = { a * b }
  println(mul(5 + 5) (4))
}
