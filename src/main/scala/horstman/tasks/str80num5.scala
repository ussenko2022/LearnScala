package horstman.tasks

import scala.jdk.CollectionConverters._
object str80num5 extends App{
  var result:scala.collection.mutable.Map[String, Int] =
    new java.util.TreeMap[String, Int].asScala
  val in = new java.util.Scanner(new java.io.File("C:\\Users\\BREGIS_ACER\\IdeaProjects\\Sec\\src\\main\\scala\\myfile.txt"))
  while (in.hasNext()) {
    val words = in.nextLine().split(" ").toBuffer
    for (i <- words)  {
      if (result.contains(i)) result = result+ (i -> {result(i) + 1})
      else result = result + (i -> 1)
    }
  }
  result = result - ""
  print(result)
}