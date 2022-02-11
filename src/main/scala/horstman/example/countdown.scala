package horstman.example
object countdown  extends App{
 def countdown_def(n:Int){
   for (i <- n to 0 by -1){
println(i)
   }
 }

  countdown_def(100)
}
