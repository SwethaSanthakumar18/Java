class Intern {  
    companion object {  
        fun task1(): String {  
            return "Complete 150 mins of learning every week"  
        }  
    }  
}  
fun Intern.Companion.task2() {  
println("Complete 1 hour of typing practice everyday")  
}  
fun main(args: Array<String>) {  
val instance = Intern.task1() 
println(instance)
Intern.task2() 
}  