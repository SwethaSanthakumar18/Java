class JavaThread extends Thread{  
public void run(){  
System.out.println("Running..");  
}  
public static void main(String args[]){  
JavaThread t1=new JavaThread();  
t1.start();  
 }  
}  