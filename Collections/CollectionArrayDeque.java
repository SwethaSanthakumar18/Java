import java.util.*;  
public class CollectionArrayDeque{  
public static void main(String[] args) {  
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Swetha");  
deque.add("Harish");  
deque.add("Miki");   
for (String str : deque) {  
System.out.println(str);  
}  
}  
}  