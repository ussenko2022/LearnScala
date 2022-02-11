package horstman.tasks

object str80num9 extends App{
  def lteqgt(values: Array[Int], v: Int): Unit = {
    var v_min = 0
    var v_max = 0
    var v_equ = 0
    for (i <- values) {
      if (v < i) v_min += 1
      else if (v > i) v_max += 1
      else  v_equ += 1
    }
    println(s"max=$v_max, min=$v_min, equ=$v_equ")
  }
  lteqgt(Array(1,2,3,4,5,6,7,8,9,10), 5)
}
