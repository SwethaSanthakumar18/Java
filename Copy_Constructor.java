class CopyConstructor{
 String name;
 String version;
 long downloads;
 int size;
 double rating;
 boolean ad;
 
 CopyConstructor(String n,String v, long d, int s, double r,boolean a)
    {   
    name=n;
    version =v;
    downloads=d;
    size= s;
    rating=r;
    ad=a;  
    }  

CopyConstructor(CopyConstructor c){  
    name=c.name;
    version =c.version;
    downloads=c.downloads;
    size= c.size;
    rating=c.rating;
    ad=c.ad;    
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
    CopyConstructor a1 = new CopyConstructor("Teleport.Video","1.0.20201016",10000,32,4.5,false);
    CopyConstructor a2 = new CopyConstructor(a1);  
    a1.display(); 
    a2.display();   
   }  
}  
