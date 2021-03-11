 public class App implements AppInterface{ 
 String name;
 String version;
 long downloads;
 int size;
 float rating;
 boolean ad;
  
    public void display3(String n,String v, long d, int s, float r,boolean a)
   {
    System.out.println("App Name:" +n);
    System.out.println("Version:" +v);
    System.out.println("Downloads:" +d);
    System.out.println("Size:" +s);
    System.out.println("Rating:" +r);
    System.out.println("Ad:" +a);    
   }  
   
    public static void main(String[] args) {  
    	App a1 = new App();  
        a1.display1(); 
        AppInterface.display2();
        a1.display3("Teleport.Video","1.0.20201016",10000,32,4.5f,false); 
    }  
}