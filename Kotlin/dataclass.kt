data class Intern(var name: String, var id: Int)  
  
fun main(agrs: Array<String>) {  
val obj = Intern("Swetha", 11024) 
println(obj) 
val obj1 = Intern("Swetha", 11024)  
println(obj==obj1)  
println(obj.equals(obj1))  
val obj2 = obj1.copy()  
println(obj2)
val obj3 = obj1.copy(name = "Miki")  
println(obj3)  
}  