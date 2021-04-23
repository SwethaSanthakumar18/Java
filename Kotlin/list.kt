fun main(args: Array<String>){  
    var list = listOf(1,2,3,"Swetha","Divya","Roshini")
     
    for(index in 0..list.size-1){  
        println(list[index])  
    }  
    
    var stringList: List<String> = listOf<String>("Harish","Kittu","Navin")  
    for(element in stringList){  
        println(element)  
    }  
    
    var list1: List<String> = listOf<String>("Harish","Kittu","Navin","Vijay","Rohan","Harish")  
    var list2: List<String> = listOf<String>("Harish","Kittu","Navin")  
    for(element in stringList){  
        print(element+" ")  
    }  
    println()  
    println(list1.get(0))  
    println(list1.indexOf("Harish"))  
    println(list1.lastIndexOf("Harish"))  
    println(list1.size)  
    println(list1.contains("Navin"))  
    println(list1.containsAll(list2))  
    println(list1.subList(2,5))  
    println(list1.isEmpty())  
    println(list1.drop(1))  
    println(list1.dropLast(2))  
}  
