/*class Person (var age: Int = 0) {
  if (age < 0 ) age = 0
}
*/
package horstman.example
class Person (val name: String){
  val firstName: String = name.split(" ")(1)
  val lastName: String = name.split(" ")(0)

}