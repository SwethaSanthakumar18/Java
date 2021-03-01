import java.util.*;  
class CollectionMap{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Swetha");  
  map.put(104,"Miki");  
  map.put(102,"Divya");  
 Set set=map.entrySet();  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
map.entrySet()  
      .stream()  
      .sorted(Map.Entry.comparingByKey())  
      .forEach(System.out::println);  
map.entrySet()  
      .stream()  
      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
      .forEach(System.out::println); 
map.entrySet()  
      .stream()  
      .sorted(Map.Entry.comparingByValue()) 
      .forEach(System.out::println);  
map.entrySet()  
     .stream()  
     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
     .forEach(System.out::println);

 }  
}  