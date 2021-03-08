import java.util.Scanner;
public class ShallowCopy1 implements Cloneable {
   private String appName;
   private float rating;
   public ShallowCopy1(String appName, float rating){
      this.appName = appName;
      this.rating = rating;
   }
   public void displayData(){
      System.out.println("App Name : "+this.appName);
      System.out.println("Rating : "+this.rating);
   }
   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the App Name");
      String name = sc.next();
      System.out.println("Enter the rating of the app");
      float rating = sc.nextFloat();
      ShallowCopy1 s = new ShallowCopy1(name, rating);
      System.out.println("Contents of the original object");
      s.displayData();
      System.out.println("Contents of the copied object");
      ShallowCopy1 c = (ShallowCopy1) s.clone();
      c.displayData();
   }
}