package horstman.example
import java.time.LocalDate

object  date_interpolator extends App {

  implicit class date_interpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      //println(sc.parts(0))
      var ar: Array[String] = sc.parts(0).split("-")
      LocalDate.of(ar(0).toInt, ar(1).toInt, ar(2).toInt)

    }


  }
var dateTest: LocalDate = date"2000-07-15"
  print(dateTest)
}

