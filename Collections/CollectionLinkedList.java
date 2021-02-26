import java.util.*;  
class CollectionLinkedList{  
public static void main(String args[]){  
LinkedList<Integer> list=new LinkedList<Integer>(); 
list.add(10);
list.add(20);  
list.add(30);  
list.add(40);
list.add(50);  
list.add(60);
list.add(70);  
list.add(80);    
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
list.addFirst(00);  
System.out.println("After invoking addFirst() method: "+list);  
list.addLast(90);  
System.out.println("After invoking addLast() method: "+list);  
  
}  
}  