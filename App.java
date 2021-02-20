class App{
 String name;
 String version;
 long downloads;
 int size;
 float rating;
 boolean ad;
 
 App(String n,String v, long d, int s, float r,boolean a)
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
   
    public static void main(String args[]){  
    App a1 = new App("Teleport.Video","1.0.20201016",10000,32,4.5f,false);  
    a1.display();    
   }  
}  