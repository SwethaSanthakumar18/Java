import java.util.*;  
class CollectionArrayList{  
public static void main(String args[]){  
ArrayList<Integer> list=new ArrayList<Integer>(); 
System.out.println("Is ArrayList Empty: "+list.isEmpty());  
list.add(10);
list.add(20);  
list.add(30);  
list.add(40);
list.add(50);  
list.add(60);
list.add(70);  
list.add(80);   
Iterator itr=list.iterator();  
System.out.println("Display the array of numbers:");
while(itr.hasNext()){  
System.out.println(itr.next()); }
System.out.println("Is ArrayList Empty: "+list.isEmpty()); 
list.remove(7);
list.remove(1);
Iterator itr1=list.iterator();  
System.out.println("After using remove() method:");
while(itr1.hasNext()){  
System.out.println(itr1.next()); 
} 
ArrayList<String> list2=new ArrayList<String>();  
  list2.add("Swetha");  
  list2.add("Miki");  
  list2.add("Divya");
  list2.add(3,"Harish");  
  list2.add("Roshini");
System.out.println("After using add() method with index: "+list2);     
  list2.retainAll(list2);  
Iterator itr3=list2.iterator();  
while(itr3.hasNext()){  
System.out.println("After using retainAll() method:" +itr3.next());
ArrayList<String> list3=new ArrayList<String>();    
   list3.add("Harish");    
   list3.add("Chanakya");     
   list2.addAll(list3);  
   System.out.println("After using addAll() method:" +list2);
 list2.addAll(0, list3);   
           System.out.println("After invoking addAll() method with index: "+list2);  
list2.removeAll(list3);  
System.out.println("After using removeAll() method: "+list2);   
list2.removeIf(str -> str.contains("Divya"));   
System.out.println("After using removeIf() method: "+list2);  
list2.clear();  
System.out.println("After using clear() method: "+list2); 
  
}  
}  
}  