import java.util.* ;
class ShallowCopy{
   int[] arr;
   public ShallowCopy(int[] new_arr){
      arr = new_arr;
   }
   public void display_data(){
      System.out.println(Arrays.toString(arr) );
   }
   public static void main(String[] args){
      int[] new_arr = {56, 89, 91};
      ShallowCopy s = new ShallowCopy(new_arr);
      s.display_data();
      new_arr[0] = 65;
      s.display_data();
   }
}