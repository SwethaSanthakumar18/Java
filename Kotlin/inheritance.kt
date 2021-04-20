open class Details{
public var id=0;
public var name:String?=null;
public var loc:String?=null;
}
class CompanyDetails:Details(){
    public fun addDetails(name:String, loc:String){
        this.name=name;
        this.loc=loc;
    }
    public fun viewDetails(){
        println("Company Name : $name Location: $loc");
    }
}
class InternDetails:Details(){
    public fun addDetails(id:Int,name:String){
        this.id=id;
        this.name=name;
    }
    public fun viewDetails(){
        println("Intern Id: $id Name: $name");
    }
}
fun main(){
    var obj =CompanyDetails();
    obj.addDetails("Ful Creative","Chennai");
    var obj1=InternDetails();
    obj1.addDetails(11024,"Swetha")
    obj.viewDetails();
    obj1.viewDetails();
}