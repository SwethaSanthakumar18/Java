import java.util.*;  
public class CollectionVector{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Swetha");  
v.add("Miki");  
v.add("Divya");  
v.add("Roshini");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  