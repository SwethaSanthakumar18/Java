class Method_Overloading{  
     public int sum(int arr[]) 
     { 
         int sum = 0; 
         int i; 
         for (i = 0; i < arr.length; i++) 
            sum +=  arr[i]; 
         return sum; 
     } 
    public float sum(float arr[]) 
     { 
         int sum = 0; 
         int i; 
         for (i = 0; i < arr.length; i++) 
            sum +=  arr[i]; 
         return sum; 
     } 
public static void main(String[] args){  

int rating[] = {5,4,4,4,2,3,3,5,2,1,3};
float rating1[] ={4.5f,3.2f,4.4f,2.5f,2.1f,3.5f,4.8f};
Method_Overloading a=new Method_Overloading();
System.out.println("Sum of Rating:" +a.sum(rating)); 
System.out.println("Sum of Rating:" +a.sum(rating1));   
}}  