class Copy_Constructor{
 String name;
 String version;
 long downloads;
 int size;
 double rating;
 boolean ad;
 
 Copy_Constructor(String n,String v, long d, int s, double r,boolean a)
    {   
    name=n;
    version =v;
    downloads=d;
    size= s;
    rating=r;
    ad=a;  
    }  

Copy_Constructor(Copy_Constructor c){  
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
    Copy_Constructor a1 = new Copy_Constructor("Teleport.Video","1.0.20201016",10000,32,4.5,false);
    Copy_Constructor a2 = new Copy_Constructor(a1);  
    a1.display(); 
    a2.display();   
   }  
}  