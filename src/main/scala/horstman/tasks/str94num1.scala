package horstman.tasks



object str94num1 extends App{
  class Counter {
    private var value: BigInt = 0 // Поля должны инициализироваться
    def increment() { value += 10000000 } // Методы по умолчанию общедоступные
    def current() = value
  }
  var count = new Counter
  while (true) {
    count.increment()
    println(count.current())
  }

}
