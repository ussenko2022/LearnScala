package horstman.example
object str139_1 extends App {
  @SerialVersionUID(42L) class Person(val name:String) extends Serializable

  var fred = new Person("fred")
  import java.io._
  val out = new ObjectOutputStream(new FileOutputStream("C:/1.obj"))
  out.writeObject(fred)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("C:/1.obj"))
  val savedFred = in.readObject().asInstanceOf[Person]
  print(savedFred.name)
}