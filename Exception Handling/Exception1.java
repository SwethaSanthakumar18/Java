import java.io.*;  
class Exception1{  
  void check(int workingHours)throws ArithmeticException{
     if(workingHours < 8)  
      throw new ArithmeticException("Not valid");  
     else  
      System.out.println("You have completed your working hours for today");
}
   public static void main(String args[]){  
      Exception1 e=new Exception1();
      e.check(3);  
      System.out.println("End...");  
  }  
}  