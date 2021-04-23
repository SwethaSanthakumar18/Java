fun main(args: Array<String>){  
  
    val map1 = mapOf<Int,String>(1 to "Swetha", 2 to "Kaarthick", 3 to "Divya",4 to "Roshini",5 to "Shaf")  
    for(key in map1.keys){  
        println(map1[key])  
    }  
    val map2: Map<Int, String> = mapOf<Int,String>(1 to "Harish",2 to "Chanakya", 4 to "Kittu", 3 to "Navin")  
    for(key in map2.keys){  
        println("$key = ${map2.get(key)}")  
    }  
    println(map1.getValue(4))  
    println(map1.contains(6))
    println(map1.containsKey(2))  
    println(map1.containsValue("Swetha"))  
    println(map1.get(1))
    println(map1.getOrDefault(3, "Roshini"))  
    for(itr in map1.asIterable()){  
          println("key = ${itr.key} value = ${itr.value}")  
      }  
    for(itr1 in map1.iterator()){  
          println("key = ${itr1.key} value = ${itr1.value}")  
      }  
    for(m in map1.minus(4)){  
          println(map1[m.key])  
      }
    
    for(p in map1.plus(Pair(6, "Ranjeet"))){  
          println("Element at key ${p.key} = ${p.value}")  
      }  
}  