interface MyInterface  {  
    var id: Int             
    fun todo(task:String,dur: Int):String  
    fun display() {  
println("Interfaces in Kotlin")  
    }  
}  
class Intern1 : MyInterface {  
    override var id: Int = 11024  
    override fun todo(task:String,dur: Int):String{   
        return "Intern1 has been assigned to learn $task for the next $dur days" 
    }  
}  
  
fun main(args: Array<String>) {  
val obj = Intern1()  
obj.display()  
println("Intern Id = ${obj.id}")  
println(obj.todo("Java", 3))  
}  