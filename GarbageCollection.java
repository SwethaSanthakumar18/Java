public class GarbageCollection
{ 
    public static void main(String[] args) 
    { 
        GarbageCollection t1 = new GarbageCollection(); 
        GarbageCollection t2 = new GarbageCollection(); 
        t1 = null; 
        System.gc(); 
        t2 = null; 
        Runtime.getRuntime().gc(); 
    } 
    @Override
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
} 