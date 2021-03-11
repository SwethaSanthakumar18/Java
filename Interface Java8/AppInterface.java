interface AppInterface{  
    default void display1(){  
        System.out.println("Default method has been called");  
    }  
    
    static void display2(){
    	System.out.println("Static method has been called");
    }
    
    void display3(String n,String v, long d, int s, float r,boolean a);  
} 