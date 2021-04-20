abstract class Tasks{  
    abstract fun todo(task:String,dur: Int):String  
}  
  
class Intern1 : Tasks() {  
    override fun todo(task:String,dur: Int):String{   
        return "Intern1 has been assigned to learn $task for the next $dur days" 
    }  
}  
class Intern2 : Tasks() {  
    override fun todo(task:String,dur: Int):String{ 
         return "Intern2 has been assigned to learn $task for the next $dur days" 
    }  
}  
fun main(args: Array<String>) {  
var obj:Tasks = Intern1()  
val objint = obj.todo("Java", 3)  
println("$objint")  
var obj1:Tasks = Intern2()  
val obj1int = obj1.todo("Kotlin", 7)  
println("$obj1int")  
}  