package horstman.example
class BankAccount {
  var balance:BigInt = 0
  def deposit():BigInt = balance
  def withdraw(sum:BigInt)  {
    balance -= sum
  }
}
