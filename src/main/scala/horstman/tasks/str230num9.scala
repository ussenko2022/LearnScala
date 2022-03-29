package horstman.tasks

object str230num9 extends App {
  """9. Компилятор Scala трансформирует выражение for/yield
    |for (i <- 1 to 10; j <- 1 to i) yield i * j
    |в вызовы flatMap и map, как показано ниже:
    |(1 to 10).flatMap(i => (1 to i).map(j => i * j))
    |Объясните, когда используется flatMap. Подсказка: что получится в результате выполнения (1 to i).map(j => i * j), когда i
    |принимает значения 1, 2, 3?
    |Что случится, если в выражении for/yield использовать три
    |генератора?""".stripMargin


}
