package horstman.example
import java.time.LocalDate

object strToDate extends App {
  def date(sc: String): Any = {
    try {
      var ar:Array[String] = sc.split("-")
      LocalDate.of(ar(0).toInt, ar(1).toInt, ar(2).toInt)

    }catch {
      case numEx: java.lang.NumberFormatException => println("Error1: " + numEx)
      case dateTimeEx: java.time.DateTimeException => println("Error2: " + dateTimeEx)
      case ex: Throwable => println("ErrorOther: " + ex)
    }

  }
  println(date("2000-04-15"))
}
