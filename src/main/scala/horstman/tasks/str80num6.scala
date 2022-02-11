package horstman.tasks

import java.util.Calendar._

object str80num6 extends App {
  var dayOfWeek =
  scala.collection.mutable.LinkedHashMap(
      "Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY,
      "Sunday" -> SUNDAY,
      )
  for ((k, v) <- dayOfWeek){
      println(s"$k - $v")
  }
}
