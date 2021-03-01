import java.util.*;  
public class CollectionHashMap{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();   
   map.put(1,"Candy crush");
   map.put(2,"Teleport video");    
   map.put(3,"Answer connects");   
   map.put(4,"Setmore");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
map.put(1,"Subway surface");
System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
System.out.println("Hashmap after using replace() method");  
     map.replace(1, "Twenty-Twenty");  
     for(Map.Entry m:map.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     } 

 System.out.println("Hashmap after using replace() method");  
     map.replace(1, "Twenty-Twenty", "Instagram");  
     for(Map.Entry m:map.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }   
System.out.println("Hashmap after using replaceAll() method");  
     map.replaceAll((k,v) -> "Whatsapp");  
     for(Map.Entry m:map.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
}  
}  