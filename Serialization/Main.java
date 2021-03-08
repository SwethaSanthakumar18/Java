import java.io.*;  
class Main{  
 public static void main(String args[]){  
  try{   
  App a1 = new App("Teleport.Video","1.0.20201016",10000,32,4.5f,false);  
  FileOutputStream fout=new FileOutputStream("app.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  out.writeObject(a1);  
  out.flush();   
  out.close();  
  System.out.println("success");  
  }catch(Exception e){System.out.println(e);}  
 }  
}  