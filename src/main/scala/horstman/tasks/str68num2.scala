package horstman.tasks



object str68num2  extends App {
var arr:Array[Int] = Array(1,2,3,4,5,6,7,8,9,10)
var arr2 =  for (i <- arr.indices if (i % 2 == 0) && (i < arr.length -1)) yield (arr(i+1), arr(i))
  println(arr2.toArray.mkString("-"))
}

