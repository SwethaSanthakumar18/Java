fun main(args: Array<String>){  
    var list = mutableListOf("Swetha","Miki","Divya","Suba")  
  
    for(element in list){  
        println(element)  
    }  
    list.add("Sri")  
    list.add("Veena")  
    list.add("Shaf")  
  println("List after adding elements")  
  for(element in list){  
        println(element)  
    }  
  var list1: MutableList<String> = mutableListOf<String>()  
  list1.add("Harish")  
    list1.add("Kittu")  
    list1.add("Navin") 
    list1.add(2,"Kaarthick")
    println("List1 after adding elements")  
    for(element in list1){  
        println(element)  
    }  
    println(list1[2]) 
    list.addAll(1,list1) 
    println("List after adding elements of List1")  
    for(element in list){  
        println(element)  
    }  
    list.remove("Swetha")  
    println("List after removing")  
    for(element in list){  
        println(element)  
    }  
    list.removeAt(2)  
    println("List after removing from index")  
    for(element in list){  
        println(element)  
    }  
    list.removeAll(list1) 
    println("List after removing all from another list")  
    for(element in list){  
        println(element)  
    } 
    list.set(2,"Ashok")  
    println("List using set()") 
    for(element in list){  
        println(element)  
    }  
    var list3 = mutableListOf("Swetha","Miki","Divya","Suba","Harish","Ram","Raj")  
    var list4 = mutableListOf("Swetha","Miki","Divya","Suba")  
    list3.retainAll(list4) 
    println("List using retainAll()") 
    for(element in list3){  
        println(element)  
    }  
    println("List clear") 
    list1.clear()  
    println(list1)
    println("List sublist") 
    list.add("Sri")  
    list.add("Veena")  
    list.add("Shaf") 
    println(list.subList(0,2)) } 