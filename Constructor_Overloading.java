class Constructor_Overloading{
 String name;
 String version;
 long downloads;
 int size;
 double rating;
 boolean ad;
Constructor_Overloading(String n,String v, long d)
    {   
    name=n;
    version =v;
    downloads=d; 
    }    
Constructor_Overloading(String n,String v, long d, int s, double r,boolean a)
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
    Constructor_Overloading a1 = new Constructor_Overloading("Teleport.Video","1.0.20201016",10000);  
    Constructor_Overloading a2 = new Constructor_Overloading("Setmore Appointments","3.0.8.20210212",100000,24,4.5,false);
    a1.display();   
    a2.display(); 
   }  
} 