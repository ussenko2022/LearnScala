package horstman.example

object testClassTime extends App{
  var testOtherTime = new Time(15,31)
  var testThisTime = new Time(19, 12)
  println(testThisTime.before(testOtherTime))
  println(testOtherTime.before(testThisTime))
  println()

  var testOtherTime2 = new Time2(19,31)
  var testThisTime2 = new Time2(19, 31)
  println(testThisTime2.before(testOtherTime2))
  println(testOtherTime2.before(testThisTime2))
}
