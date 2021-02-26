import java.util.*;  
public class CollectionPriorityQueue{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Swetha");  
queue.add("Miki");  
queue.add("Roshini");  
queue.add("Divya");  
System.out.println(queue.element());  
System.out.println(queue.peek());  
System.out.println("Iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();   
System.out.println("After removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  