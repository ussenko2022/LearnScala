package horstman.tasks

object str80num3 extends App{
  var result = collection.immutable.Map("" -> 0)
  val in = new java.util.Scanner(new java.io.File("C:\\Users\\BREGIS_ACER\\IdeaProjects\\Sec\\src\\main\\scala\\myfile.txt"))
  while (in.hasNext()) {
    val word = in.nextLine().split(" ").toBuffer
    for (i <- word)  {
      if (result.contains(i)) result = result+ (i -> {result(i) + 1})
      else result = result + (i -> 1)

    }


  }
  result = result - ""
  print(result)
}
