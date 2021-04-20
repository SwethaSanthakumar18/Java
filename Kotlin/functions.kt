fun main(args: Array<String>){  
    var number = 25  
    var result = Math.sqrt(number.toDouble())  
    println("Square root of $number is $result")  
    sum()
    val result1 = sum(5, 6)  
    print(result1) 
}  
fun sum(){  
    var num1 =5  
    var num2 = 6  
    println("Sum = "+(num1+num2))  
}  
fun sum(number1: Int, number2:Int): Int{  
    val add = number1+number2  
    return add  
}  