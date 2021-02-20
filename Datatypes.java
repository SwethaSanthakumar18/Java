public class Datatypes {
  public static void main(String[] args) {
    byte f = 100;   
    System.out.println("Byte:" +f); 
    System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
    
    short g = 18000; 
    System.out.println("Short:" +g); 
    System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
    
    int a = 18;  
    System.out.println("Integer:" +a);     
    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
    
    long h = 16000000000L; 
    System.out.println("Long:" +h);    
    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
    
    char c = 'H'; 
    char c1 = 65, c2 = 66, c3 = 67; 
    System.out.println("Char:" +c);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);      
    System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
    
    float b = 18.16f;    
    System.out.println("Float:" +b);
    System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
    
    double i = 19.99d;
    System.out.println("Double:" +i);
    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
    
    boolean d = true;  
    System.out.println("Boolean:" +d);
     
    String e = "Swetha"; 
    System.out.println("String:" +e);
  }
}
