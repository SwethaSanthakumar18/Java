public class JavaStrings{  
public static void main(String args[]){  
String s1="Swetha";
char ch[]={'s','w','e','t','h','a','m','i','k','i'};  
String s2=new String(ch); 
String s3=new String("Miki");
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3); 
s1.concat("Miki");
System.out.println(s1);  
s1=s1.concat("Miki");
System.out.println(s1);  

String s4="Harish";  
String s5="Harish";  
String s6=new String("Harish");  
String s7="Chanakya";  
System.out.println(s4.equals(s5));  
System.out.println(s4.equals(s6));  
System.out.println(s4.equals(s7));

String s8="Harish";  
String s9="HARISH";  
System.out.println(s8.equals(s9)); 
System.out.println(s8.equalsIgnoreCase(s9));

System.out.println(s4==s5); 
System.out.println(s4==s6);


System.out.println(s5.compareTo(s6)); 
System.out.println(s6.compareTo(s7));  
System.out.println(s7.compareTo(s6));

String s10="Harish"+"Chanakya";  
   System.out.println(s10);

String s11=39+56+"Harish"+16+18;  
   System.out.println(s11);

String s12="HarishChanakya";  
System.out.println(s12.substring(0,5));
System.out.println(s12.substring(6));
System.out.println(s12.toUpperCase()); 
System.out.println(s12.toLowerCase());
String s13="   HarishChanakya     ";  
System.out.println(s13.trim());

System.out.println(s12.startsWith("Ha"));  
System.out.println(s12.endsWith("ya"));

System.out.println(s12.charAt(0)); 
System.out.println(s12.length());

String s14=new String("Harish Chanakya");  
String s15=s14.intern();  
System.out.println(s15);

int a=10;  
String s16=String.valueOf(a);  
System.out.println(s16+10);  


String s17="Java is a programming language";    
String replaceString=s17.replace("Java","C");
System.out.println(replaceString);
}}