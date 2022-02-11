package horstman.example
class UnitConversion {

}

object inchesToCentimeters extends UnitConversion{
  def apply(inch:Double) = inch * 2.54
}

object milesToKilometers  extends UnitConversion{
  def apply(miles:Double) = miles * 1.60934
}

object gallonsToLiters  extends UnitConversion{
  def apply(gallon:Double)  =  gallon * 4.5461
}