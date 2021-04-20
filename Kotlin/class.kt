class StudentDetails{
var id=0;
var name:String?=null;
fun getid():Int{
    return id;
}
fun getname():String?{
    return name;
}
fun setid(id:Int){
    this.id=id;
}
fun setname(name:String){
    this.name=name;
}
}
fun main(){
    var obj=StudentDetails();
    obj.setid(156)
    obj.setname("Swetha")
    print("Name: ${obj.getname()} Id: ${obj.getid()}")
}
