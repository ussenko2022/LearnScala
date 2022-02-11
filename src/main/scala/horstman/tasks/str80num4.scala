package horstman.tasks


object str80num4 extends App{
  var result = collection.mutable.SortedMap("" -> 0)
  val in = new java.util.Scanner(new java.io.File("C:\\Users\\BREGIS_ACER\\IdeaProjects\\Sec\\src\\main\\scala\\myfile.txt"))
  while (in.hasNext()) {
    val word = in.nextLine().split(" ").toBuffer
    for (i <- word)  {
      if (result.contains(i)) result(i) +=1 else result(i) = 1

    }


  }
  result -= ""
  print(result)
}
