package horstman.example
import scala.collection.mutable

object str76_1 extends App{
  var myMap = scala.collection.mutable.LinkedHashMap("Paper" -> 220)
  myMap("Table") = 2100
  for (i <- 0 to 100){
    myMap((i * 100).toChar.toString ) = i * 1000
  }

  var myMap2:mutable.LinkedHashMap[Int, String]  = for ((k, v) <- myMap) yield (v,k)
  print(myMap2)

}
