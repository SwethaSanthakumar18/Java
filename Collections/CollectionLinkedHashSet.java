import java.util.*;  
public class CollectionLinkedHashSet{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
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