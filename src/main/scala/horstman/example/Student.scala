package horstman.example
import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long){
  def info = s"ID: $id, NAME: $name"

}