package horstman.example
class Time(val hours:Int, val minutes:Int) {
  assert(hours >= 0, "Hours не может быть отрицательным значением")
  assert(hours <= 23, "Hours не может быть больше 23")
  assert(minutes >= 0, "Minutes не может быть отрицательным значением")
  assert(minutes <= 59, "Minutes не может быть больше 59")
  def before(other:Time) ={
    if (this.hours > other.hours) false
    else if (this.hours < other.hours) true
    else if (this.hours == other.hours) {
      if (this.minutes >= other.minutes) false
      else if (this.minutes < other.minutes ) true
    }

  }
}
