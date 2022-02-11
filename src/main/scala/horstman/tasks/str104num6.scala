package horstman.tasks

object str104num6 extends Enumeration {
    val Spades = Value("♠")
    val Hearts = Value("♥")
    val Clubs = Value("♣")
    val Diamonds = Value("♦")

  def contains[A](list: List[A], item: A): Boolean = {
    //list.foldLeft(false)((r, c) => if (c.equals(item) || r) true else false)
    list.foldLeft(false)((r, c) => c ==item  || r)
  }

  def isRed(card:str104num6.Value) =
    if (contains(List(Hearts, Diamonds), card) )
      true
    else
      false
}