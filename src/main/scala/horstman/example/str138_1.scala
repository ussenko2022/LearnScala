package horstman.example
import java.util.stream

object str138_1 extends App {
  import java.nio.file._
  var dirname = "C:/"
  val entries: stream.Stream[Path] = Files.list(Paths.get(dirname)) // или Files.list
  try {
    entries.forEach(a => println(a))
  } finally {
    entries.close()
  }
}
