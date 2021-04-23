fun main(){
    var x=2
    when (x) {
    1 ->{ 
         println("x == 1")
         x+=10
         println("$x")
         }
    2 -> {
         println("x == 2")
         x-=10
         println("$x")
    }
     else -> 
        { 
        println("x is neither 1 nor 2")
        }
}
}