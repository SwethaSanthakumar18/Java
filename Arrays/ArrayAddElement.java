import java.util.Arrays; 
public class ArrayAddElement {
public static void main(String[] args) {
   int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int index = 2;
   int value = 5;
  System.out.println("Original Array : "+Arrays.toString(arr));     
  for(int i=arr.length-1; i > index; i--){
    arr[i] = arr[i-1];
   }
   arr[index] = value;
   System.out.println("New Array: "+Arrays.toString(arr));
 }
 }