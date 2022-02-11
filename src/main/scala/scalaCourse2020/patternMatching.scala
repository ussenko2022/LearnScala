package scalaCourse2020

import scala.annotation.tailrec
import scala.util.Random

object PatternMatching extends App{
  def reverse (list: List[Int]) : List[Int]={
    @tailrec
    def rev(target:List[Int], remains:List[Int]): List[Int]={
      remains match {
        case head :: tail =>
          rev(head :: target, tail)
        case Nil =>
          target
      }
    }
    rev(Nil, list)
  }

  def reverseListsInListFor (list: List[List[Int]]) ={
    var res : List[List[Int]] = Nil
    for (i <- list) {
      res = reverse(i)::res
    }
    res
}

  @tailrec
  def drop(list:List[Int], n:Int) : List[Int] = {
  if (n > 0 && list.nonEmpty){
    drop(list.tail, n - 1)
  }else{
    list
  }
}

  def apply(list : List[Int], n:Int) : Int = {
    val rest = drop(list, n)
    if (n < 0 || rest.isEmpty){
      throw new IndexOutOfBoundsException(n.toString)
    }
    rest.head
  }

  //затратный append
  def appendRec(list: List[Int], v : Int) : List[Int] = {
    list match {
      case Nil =>
        v :: Nil
      case head :: tail =>
        head :: appendRec(tail, v)
    }
  }

  //менее затратный append, с 2 reverse
  def appendWithReverse(list: List[Int], v:Int) : List[Int] = {
    reverse(v :: reverse(list))
  }

  val MyListsInList = List(List(1,2,3), List(4,5,6), List(7,8,9), List(10,11), List(12))

  //Превращение в плоский список
  //println(MyListsInList.flatten)
  //println(reverseListsInListFor(MyListsInList).flatten)
  //println(reverseListsInListFor(MyListsInList).flatMap(x => List.fill(2)(x)))


  val MyList = List(1,2,3,4,5,6,7,8,9)
  //println(apply(MyList, 5))

  //println(appendWithReverse(MyList, 10))
  //println(appendRec(MyList, 10))

  val l: List[Double] = List.fill(10)(Random.nextInt(10))
  //println(l)
  //println(l.filter(_%2 ==0))

  //println(l.map(_ * 2))
  //println(l.map(x => x * 2))
  //println(l.map(x => x * x))
  //println(l.map(Math.sqrt))

  val list = List(Some(10 -> 20, 20 -> 30), None,Some(30 -> 40, 40 -> 50) , 1, None)
  //Собрать необходимые элементы с помощью экстрактора и паттерн матчинга
  //println(list collect {
  //  case Some(v1) => v1
  //})

  //Собрать необходимые элементы с помощью экстрактора и цикла
  //println(for {
  //  Some(v) <- list
  //} yield v)

  //Убираем повторяющиеся подряд элементы
  val MyListFoldLeft = List(1,2,3,3,3,4,5,6,6,6,7,8,8,9,10)
  val MyNewListFoldLeft = MyListFoldLeft.foldLeft(List.empty[Int]) {(acc, v) =>
  if (acc.headOption.contains(v)) {
  acc} else {
    v :: acc
  }
  }.reverse

  //println(MyListFoldLeft)
  //println(MyNewListFoldLeft)


}
