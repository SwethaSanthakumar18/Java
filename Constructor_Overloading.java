class ConstructorOverloading{
 String name;
 String version;
 long downloads;
 int size;
 double rating;
 boolean ad;
ConstructorOverloading(String n,String v, long d)
    {   
    name=n;
    version =v;
    downloads=d; 
    }    
ConstructorOverloading(String n,String v, long d, int s, double r,boolean a)
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
    ConstructorOverloading a1 = new ConstructorOverloading("Teleport.Video","1.0.20201016",10000);  
    ConstructorOverloading a2 = new ConstructorOverloading("Setmore Appointments","3.0.8.20210212",100000,24,4.5,false);
    a1.display();   
    a2.display(); 
   }  
} 
