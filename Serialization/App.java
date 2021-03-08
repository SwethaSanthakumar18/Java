import java.io.Serializable;
public class App implements Serializable{
 String name;
 transient String version;
 static long downloads;
 transient int size;
 float rating;
 boolean ad;
 
 public App(String n,String v, long d, int s, float r,boolean a)
    {   
    name=n;
    version =v;
    downloads=d;
    size= s;
    rating=r;
    ad=a;  
    }    
    void display()
   {
    System.out.println("App Name:" +name);
    System.out.println("Version:" +version);
    System.out.println("Downloads:" +downloads);
    System.out.println("Size:" +size);
    System.out.println("Rating:" +rating);
    System.out.println("Ad:" +ad);    
   }  
}  