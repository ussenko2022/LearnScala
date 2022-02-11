package horstman.example
class Time2(val hours:Int, val minutes:Int) {
  def min():Int  = hours * 60 + minutes
  assert(hours >= 0, "Hours не может быть отрицательным значением")
  assert(hours <= 23, "Hours не может быть больше 23")
  assert(minutes >= 0, "Minutes не может быть отрицательным значением")
  assert(minutes <= 59, "Minutes не может быть больше 59")
  def before(other:Time2) ={
    if (this.min >= other.min) false
    else true
    }

  }

