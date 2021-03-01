import java.util.*;  
class CollectionLinkedHashMap{  
 public static void main(String args[]){  
   LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
      map.put(100,"Swetha");    
     map.put(101,"Miki");    
     map.put(102,"Divya"); 
map.put(103,"Roshini");   
       System.out.println("Keys: "+map.keySet());  
       System.out.println("Values: "+map.values());    
       System.out.println("Key-Value pairs: "+map.entrySet());  
map.remove(102);
System.out.println("Key-Value pairs: "+map.entrySet());  
 }  
}  