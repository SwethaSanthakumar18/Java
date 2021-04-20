
fun myFun(name: String,salary: Int, fn: (String,Int) -> String): Unit {  
    val result = fn(name,salary)  
    println(result)  
}  
  
fun main(args: Array<String>){  
    val fn:(String,Int)->String={name,salary->"$name receives a stipend of Rs.$salary"}  
    myFun("Swetha",15000,fn)  
}  