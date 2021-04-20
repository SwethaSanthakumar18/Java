class Intern{  
    private var name: String = "Swetha"  
    inner class InternDetails{  
    var role: String = "Android Intern"  
    private var duration: Int = 3  
        fun display(){  
          println("Intern name is ${name}")
          println("Intern Role is ${role}")
          println("Intern Duration is ${duration} months")
        }  
    }  
}  
fun main(args: Array<String>){   
println(Intern().InternDetails().role)
var obj = Intern().InternDetails()  
    obj.display() 
}  