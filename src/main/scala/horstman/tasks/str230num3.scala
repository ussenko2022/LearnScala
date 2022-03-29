package horstman.tasks


import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object str230num3 extends App {
  """3. Напишите функцию, удаляющую каждый второй элемент из
    |ListBuffer. Попробуйте два способа. Вызовите remove(i) для
    |всех четных индексов i, начиная с конца списка. Скопируйте
    |каждый второй элемент в новый список. Сравните производительность обоих способов.""".stripMargin

    def getEven(arr:ListBuffer[Int]): ListBuffer[Int] ={
      val arr2 = ListBuffer[Int]()
      for (i <- arr.indices) if (arr(i) % 2 == 0) arr2.append(arr(i))
      arr2
    }

  val arr = ListBuffer(1,2,3,4,5,6,7,8,9,10)
  println(getEven(arr))
}
