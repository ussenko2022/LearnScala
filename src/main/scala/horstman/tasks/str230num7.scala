package horstman.tasks

object str230num7 extends App {
  """7. В разделе 13.10 «Функция zip» выражение (prices zip quantities) map { p => p._1 * p._2 } выглядит несколько грубовато.
    |Мы не можем написать (prices zip quantities) map { _ * _ }, потому
    |что _ * _ – это функция с двумя аргументами, а нам нужна
    |функция, принимающая один аргумент – кортеж. Метод tupled класса Function изменяет функцию с двумя аргументами,
    |превращая ее в функцию, принимающую кортеж. Примените
    |метод tupled к функции умножения так, чтобы можно было
    |применить map к списку пар.""".stripMargin

    val op = (a:Int, b:Int)=> a * b


    val prices = List(200,300,500)
    val quantities = List(5,2,13)
    println((prices zip quantities) map (p => p._1 * p._2))
    println((prices zip quantities) map op.tupled)
    println((prices zip quantities) map ((a:Int, b:Int)=> a * b).tupled)
}
