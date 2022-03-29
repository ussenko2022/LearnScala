package horstman.example

import scala.jdk.CollectionConverters._
object str226num1 extends App{
  val props:scala.collection.mutable.Map[String, String]  = System.getProperties.asScala

  println(props("java.runtime.name"))
}
