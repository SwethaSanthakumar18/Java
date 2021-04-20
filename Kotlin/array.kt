fun main(args: Array<String>) {  
val array1 = arrayOf(1,2,3,4)  
var array2: LongArray = longArrayOf(5,10,20,12,15)  
    array1.set(0,5)  
    array1[2] = 6  
  
    array2.set(2,10)  
    array2[3] = 8  
  
    for(element in array1){  
println(element)  
    }  
println()  
    for(element in array2){  
println(element)  
    }  
println(array1.get(0))  
println(array2[2])  
 
var myArray = Array<Int>(5){0}  
  
    for(element in myArray){  
println(element)  
    }   
 for (index in 0..myArray.size-1){  
println(myArray[index])  
    }  
 
}  