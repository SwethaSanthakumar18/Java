class Person<T>(age: T){  
var age: T = age  
init {  
this.age= age  
println(age)  
    }  
}  
fun main(args: Array<String>){  
var ageInt: Person<Int> = Person<Int>(30)  
var ageString: Person<String> = Person<String>("40")  
}  