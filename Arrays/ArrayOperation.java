import java.util.Arrays;
public class ArrayOperation {
      public void sum() {
      float[] rating = {1.9f,2.9f,3.4f,3.5f,4.8f,4.2f,3.9f,2.3f,1.7f};
      for (int i = 0; i < rating.length; i++) {
         System.out.println(rating[i] + " ");
      }
      float total = 0;
      for (int i = 0; i < rating.length; i++) {
         total += rating[i];
      }
      System.out.println("Total is " + total);}
      public void max() {
      float[] rating = {1.9f,2.9f,3.4f,3.5f,4.8f,4.2f,3.9f,2.3f,1.7f};
      float max = rating[0];
      for (int i = 1; i < rating.length; i++) {
         if (rating[i] > max) max = rating[i];
      }
      System.out.println("Maximum Rating is " + max);  
   }
public void min() {
      float[] rating = {1.9f,2.9f,3.4f,3.5f,4.8f,4.2f,3.9f,2.3f,1.7f};
      float min = rating[0];
      for (int i = 1; i < rating.length; i++) {
         if (rating[i] < min) min = rating[i];
      }
      System.out.println("Minimum Rating is " + min);  
   }
   
public void sort()
{   
float[] rating = {1.9f,2.9f,3.4f,3.5f,4.8f,4.2f,3.9f,2.3f,1.7f}; 
Arrays.sort(rating);   
System.out.println("Elements of array sorted in ascending order: ");   
for (int i = 0; i < rating.length; i++)   
{       
System.out.println(rating[i]);   
}   
}  
public static void main(String[] args){
ArrayOperation a = new ArrayOperation();
a.sum();
a.max();
a.min();
a.sort();
}

}