import java.util.*;  
public class CollectionHashSet{  
public static void main(String args[]){  
HashSet<String> set=new HashSet<String>();  
set.add("Swetha");  
set.add("Miki");  
set.add("Divya");  
set.add("Roshini");    
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  