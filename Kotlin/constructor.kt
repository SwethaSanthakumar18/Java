class Intern(val name: String, var id: Int, var salary: Int ) {  
}  
fun main(args: Array<String>){  
val obj = Intern ("Swetha", 11024, 15000)  
  
println("Intern Name = ${obj.name}")  
println("Intern Id = ${obj.id}")  
println("Intern Salary = ${obj.salary}")  
}  


/*
class Intern{  
  
    constructor(name: String, id: Int, salary: Int){  
println("Name = ${name}")  
println("Id = ${id}")  
println("Salary = ${salary}")  
    }  
}  
fun main(args: Array<String>){  
val obj = Intern ("Swetha", 11024, 15000)  
  
}  

*/


/*class StudentDetails{
private var id=0;
private var name:String?=null;
    inner class Marks{
      var mark1:Int=0
      var mark2:Int=0
        constructor(mark1:Int,mark2:Int){
            this.mark1=mark1;
            this.mark2=mark2;
        }
        fun viewData(){
            println("Name: $name Id: $id Marks: $mark1,$mark2")
        }
    }
constructor(){}
constructor(id:Int,name:String){
    this.id=id;
    this.name=name;
}
}
fun main(){
    var obj=StudentDetails(156,"Swetha").Marks(97,95);
    obj.viewData();
}
*/