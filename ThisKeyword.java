class ThisKeyword{
 String name;
 String version;
 long downloads;
 int size;
 float rating;
 boolean ad;
 
 ThisKeyword(String name,String version, long downloads, int size, float rating,boolean ad)
    {   
    this.name=name;
    this.version =version;
    this.downloads=downloads;
    this.size= size;
    this.rating=rating;
    this.ad=ad;  
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
    ThisKeyword a1 = new ThisKeyword("Teleport.Video","1.0.20201016",10000,32,4.5f,false);  
    a1.display();    
   }  
}  
