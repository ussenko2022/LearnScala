package horstman.example
class Car(val marka:String, val model:String) {
  private var year:Int = -1
  private var regNum:String = ""

  def this(marka:String,  model:String,  year:Int) {
    this(marka, model)
    this.year = year
  }
    def this(marka:String,  model:String, regNum:String){
    this(marka, model)
      this.regNum = regNum
  }
  def this(marka:String,  model:String, year:Int, regNum:String){
    this(marka, model)
    this.regNum = regNum
    this.year = year
  }

  def info = s"Марка: $marka \nМодель: $model \nГод выпуска: ${if (year == -1) "Не указан" else year} \nРегистрационный номер: $regNum"
}
