import java.util.*;
public class SmallestAndLargest {
  public static void main(String[] args) 
    {
       
        Integer arr[] = new Integer[]{12, 3, 5, 7, 19}; 
        int k = 2; 
        
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("K'th smallest element in the array: ");
        Arrays.sort(arr);       		
        System.out.print(arr[k-1] + " ");
		System.out.println("K'th largest element in the array:");          
        Arrays.sort(arr, Collections.reverseOrder());  		
        System.out.print(arr[k-1] + " ");
	}
}