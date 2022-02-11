package horstman.example

import java.io.PrintStream

trait Logger {
  def log(msg: String) // Абстрактный метод
  def info(msg: String) { log(s"INFO: $msg") }
  def warn(msg: String) { log(s"WARN: $msg") }
  def severe(msg: String) { log(s"SEVERE: $msg") }
}

trait LoggerException extends Exception with FileLogger {
  def log() { log(getMessage()) }
}

class UnhappyException extends {val filename = "savings.log"} with LoggerException { // Наследует трейт
  override def getMessage() = "arggh!"

}

trait ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}
/*
trait FileLogger extends Logger {
  val out = new PrintWriter("app.log") // Часть конструктора трейта
  out.println(s"# ${java.time.Instant.now()}")
  // Так же часть конструктора
  def log(msg: String) { out.println(msg); out.flush() }
}
 */

trait FileLogger extends Logger {
  val filename: String
  lazy val out = new PrintStream(filename)
  def log(msg: String) { out.println(msg) } // override не требуется
}

trait TimestampLogger extends Logger {
  abstract override def log(msg: String) {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}

trait ShortLogger extends Logger {
  val maxLength: Int // Абстрактное поле
  abstract override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else s"${msg.substring(0, maxLength -3)}..."
    )
  }
}

trait Account {
  def withdraw(amount: Double)
  def input(amount: Double)
}

class SavingsAccount (var balance:Double = 0, val valuta: String = "KZT")
  extends {val filename = "savings.log"} with Account with ConsoleLogger {
  def withdraw(amount: Double) {
    if (amount > balance) warn("Недостаточно средств")
    else {
      balance -= amount
      info(s"Списание средств в размере: $amount $valuta")
    }
  }

  def input(amount: Double) {
    balance += amount
    info(s"Пополнение счёта на сумму: $amount $valuta")
  }
  def info(){
    info(s"Баланс: $balance $valuta")
  }
}

object main extends App{
  val acct1 = new SavingsAccount with TimestampLogger with ShortLogger{
    val maxLength = 50
  }
  acct1.input(200)
  acct1.info()
  acct1.input(100)
  acct1.info()
  acct1.withdraw(500)
  acct1.info()
  acct1.withdraw(300)
  acct1.info()


}