package horstman.example
object signum extends App{
def sig(x:Int) ={
  if (x > 0) 1
  else if (x < 0) -1
  else if (x == 0) 0
 }

  print(sig(0))
}
