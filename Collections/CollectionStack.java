import java.util.*;  
public class CollectionStack{  
public static void main(String args[]){  
Stack<Integer> stack = new Stack<Integer>();  
stack.push(10);  
stack.push(20);  
stack.push(30);  
stack.push(40);  
stack.push(50);  
stack.pop();  
Iterator<Integer> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  