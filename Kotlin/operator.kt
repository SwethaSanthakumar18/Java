fun main(args : Array<String>) {  
var a=10;  
var b=5;  
//Arithmetic    
println(a+b);  
println(a-b);  
println(a*b);  
println(a/b);  
println(a%b);  
//Relational    
val max = if (a > b) {  
        println("a is greater than b.")  
        a  
    } else{  
        println("b is greater than a.")  
        b  
    }  
    println("max = $max") 
//Assignment
a+=b  
    println("a+=b :"+ a)  
    a-=b  
    println("a-=b :"+ a)  
    a*=b  
    println("a*=b :"+ a)  
    a/=b  
    println("a/=b :"+ a)  
    a%=b  
    println("a%=b :"+ a)
  //Unary
  var flag = true  
    println("+a :"+ +a)  
    println("-b :"+ -b)  
    println("++a :"+ ++a)  
    println("--b :"+ --b)  
    println("!flag :"+ !flag)   
//Logical
    var c=15  
    var result: Boolean  
    result = (a>b) && (a>c)  
    println("(a>b) && (a>c) :"+ result)  
    result = (a>b) || (a>c)  
    println("(a>b) || (a>c) :"+ result)  
    result = !flag  
    println("!flag :"+ result)  
//Bitwise
    println("a.shl(b): "+a.shl(b))  
    println("a.shr(b): "+a.shr(b))  
    println("a.ushr(b:) "+a.ushr(b))  
    println("a.and(b): "+a.and(b))  
    println("a.or(b): "+a.or(b))  
    println("a.xor(b): "+a.xor(b))  
    println("a.inv(): "+a.inv())          
}