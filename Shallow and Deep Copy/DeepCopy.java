import java.util.*;
class DeepCopy{
   int[] arr;
   public DeepCopy(int[] new_arr){
      arr = new int[new_arr.length];
      for (int i = 0; i < arr.length; i++){
         arr[i] = new_arr[i];
      }
   }
   public void display_data(){
      System.out.println(Arrays.toString(arr));
   }
   public static void main(String[] args){
      int[] new_arr = {56, 89, 91};
      DeepCopy d = new DeepCopy(new_arr);
      d.display_data();
      new_arr[0] = 65;
      d.display_data();
   }
}