import java.util.Arrays;
import java.util.*; 
import java.util.Iterator;
public class ArrayPrint{

public void method1()
{
int[] arr1 = {2,5,46,12,34};
System.out.print("Method 1:\n");
for(int i=0; i<arr1.length; i++){
    System.out.print(arr1[i]);
}
}
public void method2()
{
int[] arr2 = {2,5,46,12,34};
System.out.print("\nMethod 2:\n");
for(int i: arr2){
    System.out.print(i);
}
}

public void method3()
{
System.out.print("\nMethod 3:\n");
int[] arr3 = {2,5,46,12,34};
System.out.println(Arrays.toString(arr3));
}

public void method4()
{
System.out.print("\nMethod 4:\n");
Integer[] oneDimensionalArr = {2,5,46,12,34};
System.out.println(Arrays.deepToString(oneDimensionalArr));
} 

public void method5()
{
System.out.print("\nMethod 5:\n");
Integer[] intArray = {2,5,46,12,34};
System.out.println(Arrays.asList(intArray));
}

public void method6()
{
System.out.print("\nMethod 6:\n");
Integer[] intArray = {2,5,46,12,34};
List<Integer> list = Arrays.asList(intArray);
Iterator<Integer> it = list.iterator();
while(it.hasNext()) {
    System.out.print(it.next());
}
}
public void method7()
{
System.out.print("\nMethod 7:\n");
Integer[] intArray = {2,5,46,12,34};
Arrays.stream(intArray).forEach(System.out::print);
}

public static void main(String [] args){
ArrayPrint a=new ArrayPrint();
a.method1();
a.method2();
a.method3();
a.method4();
a.method5();
a.method6();
a.method7();
}
}