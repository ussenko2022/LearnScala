package horstman.tasks

object str200num8 extends App {
  """8. В разделе 12.8 «Карринг» был представлен метод corresponds,
    |использующий два массива строк. Напишите вызов corresponds, который проверял бы соответствие длин строк в одном
    |массиве целочисленным значениям в другом.""".stripMargin

  val a = Array("Hello", "World")
  val b = Array(5, 6)
  println(a.corresponds(b)(_.length == _))

}
