fun main(args: Array<String>){  
    try {  
        val data = 20 / 0 
    } catch (e: ArithmeticException) {  
        println(e)  
    }  
    println("Exception Caught")  
    
    
     try {  
        val data = 10 / 5  
        println(data)  
    } catch (e: NullPointerException) {  
        println(e)  
    } finally {  
        println("Finally block")  
    }  
    println("Hello World")  
    
}