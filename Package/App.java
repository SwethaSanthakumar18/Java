package package1;  
public class App{
 String name;
 String version;
 long downloads;
 int size;
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
    public void display()
   {
    System.out.println("App Name:" +name);
    System.out.println("Version:" +version);
    System.out.println("Downloads:" +downloads);
    System.out.println("Size:" +size);
    System.out.println("Rating:" +rating);
    System.out.println("Ad:" +ad);    
   }  
   
}  