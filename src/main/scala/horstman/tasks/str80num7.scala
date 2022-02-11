package horstman.tasks
import scala.jdk.CollectionConverters._
object str80num7 extends App {
  val propKeys = Array("java.runtime.name", "sun.boot.library.path", "java.vm.version" , "java.vm.vendor" , "java.vendor.url" , "path.separator", "java.vm.name" )
  val props: scala.collection.Map[String, String] = System.getProperties.asScala
  var len = 0
  for ((k, _) <- props if propKeys.contains(k)) if (k.length > len) len = k.length
  println(len)
  for ((k, v) <- props if propKeys.contains(k)) println(s"$k ${" " * (len - k.length) } | $v")
}
