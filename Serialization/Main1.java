import java.io.*;  
class Main1{  
 public static void main(String args[]){  
  try{  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("app.txt"));  
 App a1=(App)in.readObject();  
  System.out.println(a1.name+" "+a1.version+" "+a1.downloads+" "+a1.size+" "+a1.rating+" "+a1.ad);  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}