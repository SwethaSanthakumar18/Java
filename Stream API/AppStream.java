import java.util.*;  
import java.util.stream.Collectors;  
class AppStream{
 String name;
 String version;
 long downloads;
 int size;
 float rating;
 boolean ad;
 
 public AppStream(String n,String v, long d, int s, float r,boolean a)
    {   
    name=n;
    version =v;
    downloads=d;
    size= s;
    rating=r;
    ad=a;  
    }    
  
    public static void main(String args[]){  
        List<AppStream> list = new ArrayList<AppStream>();  
        list.add(new AppStream("Teleport.Video","1.0.20201016",10000,32,4.7f,false));  
        list.add(new AppStream("Anywhere.app","3.2.2.20210106",5000,20,4.5f,false));
        list.add(new AppStream("Print Anywhere","2.0.70",100000,8,3.7f,false));  
        list.add(new AppStream("Recharge Anywhere","1.5",10000,5,3.9f,false));    
        List<Float> list2 =list.stream()  
                                     .filter(r -> r.rating > 4.0) 
                                     .map(r->r.rating)  
                                     .collect(Collectors.toList()); 
        System.out.println(list2);  
    }  
}  