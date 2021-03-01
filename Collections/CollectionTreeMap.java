import java.util.*;  
class CollectionTreeMap{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Swetha");    
      map.put(102,"Miki");    
      map.put(101,"Divya");    
      map.put(103,"Roshini");    
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  