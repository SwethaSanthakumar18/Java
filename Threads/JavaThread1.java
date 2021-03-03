class JavaThread1 implements Runnable{  
public void run(){  
System.out.println("Running...");  
}  
  
public static void main(String args[]){  
JavaThread1 t=new JavaThread1();  
Thread t1 =new Thread(t);  
t1.start();  
 }  
}  