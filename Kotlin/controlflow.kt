fun main(args: Array<String>) {  
    //If-Else
    val num1 = 10  
        val num2 =20  
        val result = if (num1 > num2) {  
            "$num1 is greater than $num2"  
        } else {  
            "$num1 is smaller than $num2"  
        }  
        println(result)  
        val result1 = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"  
        println(result1)  
        //When
    var number = 4  
    when(number) {  
        1 -> println("One")  
        2 -> println("Two")  
        3 -> println("Three")  
        4 -> println("Four")  
        5 -> println("Five")  
        else -> println("invalid number")  }
    var number1 = 8  
    when(number1) {  
        3, 4, 5, 6 ->  
            println("It is summer season")  
        7, 8, 9 ->  
            println("It is rainy season")  
        10, 11 ->  
            println("It is autumn season")  
        12, 1, 2 ->  
            println("It is winter season")  
        else -> println("invalid input")  }
        
  var number2 = 7  
    when(number2) {  
        in 1..5 -> println("Input in the range 1 to 5")  
        in 6..10 -> println("Input in the range 6 to 10")  
        else -> println("none of the above")  
}  
    //For-loop
    val arr = arrayOf(80,85,60,90,70)  
    for(i in arr){  
        println(i)  
    }  
    //While-loop
    var j = 1  
    while (j<=5){  
        println(j)  
        j++  
    }  
    //break
    for (i in 1..5) {  
        if (i == 3) {  
            break  
        }  
        println(i)  
    }
    //continue
    for (i in 1..3) {  
            println("$i")  
            if (j == 2) {  
                continue  
            }  
            println("Contiued..")  
        }  
}  