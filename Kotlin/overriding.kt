open class Company {  
    open var name = "Full Creative"  
    open fun display() {  
println("Company Name is $name")  
    }  
}  
class Intern: Company() {  
    override var name = "Swetha"  
    override fun display() {  
println("Intern Name is $name")  
    }  
}  
class Mentor: Company() {  
    override var name = "Abishek"  
    override fun display() {  
println("Mentor name is $name")  
    }  
}  
fun main(args: Array<String>) {  
val obj = Company()  
    obj.display()  
val obj1 = Intern()  
    obj1.display()  
val obj2 = Mentor()
    obj2.display()
}  