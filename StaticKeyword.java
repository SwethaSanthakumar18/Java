class StaticKeyword{
 String name;
 static String version="1.0.20201016";
 long downloads;
 int size;
 double rating;
 boolean ad;
 
 static void update(){  
     version = "1.1.20201016";  
     }  
 StaticKeyword(String n, long d, int s, double r,boolean a)
    {   
    name=n;
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
    StaticKeyword.update();
    StaticKeyword a1 = new StaticKeyword("Teleport.Video",10000,32,4.5,false);
    a1.display();   
   }  
}  
