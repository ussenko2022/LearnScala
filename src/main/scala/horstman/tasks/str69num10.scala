package horstman.tasks



object str69num10 extends App{
  var arr = java.util.TimeZone.getAvailableIDs.toIterable
  var arrRes = for (i <- arr if (i.take(8) == "America/")) yield i.drop(8)
  arrRes = arrRes.toArray.sorted
  print(arrRes.toString())

}
