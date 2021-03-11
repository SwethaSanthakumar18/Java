public class LambdaJava {   
   public static void main(String args[]) {
      DisplayMsg d = message -> System.out.println("Hello" + message);
      d.display("Swetha");
      Calculate c = (int a,int b) -> {return a+b;};
      System.out.println("The sum is:" + c.add(39,56));
   }
	
   interface DisplayMsg {
      void display(String message);
   }
   interface Calculate {
      int add(int a, int b);
   }
	
}