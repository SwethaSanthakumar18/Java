class StringBufferJava{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Harish");  
sb.append("Chanakya"); 
System.out.println(sb);
sb.insert(2,"Harish");
System.out.println(sb); 
sb.replace(0,7,"Harish");  
System.out.println(sb);
sb.delete(2,6);  
System.out.println(sb);
sb.reverse();  
System.out.println(sb);


StringBuffer sb1=new StringBuffer();  
System.out.println(sb1.capacity()); 
sb.append("Hello");  
System.out.println(sb1.capacity()); 
sb.append("Harish Chanakya");  
System.out.println(sb1.capacity());
}  
}  