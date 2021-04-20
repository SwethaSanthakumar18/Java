fun main(args: Array<String>) {  
    //Default Argument
    run()  
    run(3)  
    run(3,'a')  
    //run('a')
    //Named-Argument
    run(letter='a')  
}  
fun run(num:Int= 5, letter: Char ='x'){  
    println("Number : $num and Char : $letter")  
}  