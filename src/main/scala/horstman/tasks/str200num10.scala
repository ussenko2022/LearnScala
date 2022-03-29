package horstman.tasks

object str200num10 extends App {
  """10. Реализуйте абстракцию управления потоком выполнения unless,
    |действующую подобно if,
    |но с инвертированным толкованием логического условия. Требуется ли оформить первый
    |параметр как параметр, вызываемый по имени? Необходим ли
    |здесь карринг?""".stripMargin



    def unless(condition:Boolean)(block: => Unit) {
      if (!condition){
        block
      }
    }

  unless (1 == 1) {
    println(1)
  }
}
