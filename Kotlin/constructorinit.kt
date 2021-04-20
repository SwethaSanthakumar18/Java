class Intern(name: String, id: Int, salary: Int) {  
val intern_name: String  
var intern_id: Int
var intern_salary: Int
init{  
intern_name = name.capitalize()  
intern_id = id
intern_salary = salary
  
println("Intern Name = ${intern_name}")  
println("Intern Id = ${intern_id}")  
println("Intern Salary = ${intern_salary}")  
    }  
}  
fun main(args: Array<String>){  
val obj = Intern("Swetha", 11024, 15000)  
  
}  