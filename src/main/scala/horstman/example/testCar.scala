package horstman.example
object testCar extends App{


  var myCar1 = new Car("tesla", "model X")
  var myCar2 = new Car("Audi", "100", 1989)
  var myCar3 = new Car("Reno", "Logan", "03 544 HX KZ")
  var myCar4 = new Car("Audi", "A4",2005, "03 666 AHA KZ")

  var cars = Array(myCar1,myCar2, myCar3, myCar4)

  for (car <- cars){
    println(car.info)
    println("-")
  }


}
