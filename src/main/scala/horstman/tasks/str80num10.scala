package horstman.tasks

object str80num10 extends App{
  var cort = "Hello".zip("World")
  for ((k,v) <- cort) {
    println(s"$k  $v")
  }

}
