class Intern{  
    fun isPassed(learningTime: Int): Boolean{  
        return learningTime>150  
    }  
}  
fun Intern.isExcellent(learningTime: Int): Boolean{  
    return learningTime > 500  
}  
fun main(args: Array<String>){  
val obj = Intern()  
val passingStatus = obj.isPassed(90)  
println("Intern's learning status is $passingStatus")  
  
val excellentStatus = obj.isExcellent(695)  
println("Intern's learning status is $excellentStatus")  
}
