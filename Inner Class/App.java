class App{
 String name;
 String version;
 long downloads;
 int size;
 float rating;
 boolean ad;
 private String about;
 class Inner{  
  void msg(){System.out.println("About App" +about);}  
 } 
 App(String n,String v, long d, int s, float r,boolean a, String ab)
    {   
    name=n;
    version =v;
    downloads=d;
    size= s;
    rating=r;
    ad=a;  
    about = ab;
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
    App a1 = new App("Teleport.Video","1.0.20201016",10000,32,4.5f,false,"Host free video meetings from anywhere,anytime");  
App.Inner a2 = a1.new Inner();
a2.msg();    
a1.display();    
   }  
}  