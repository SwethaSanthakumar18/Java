class StaticBlock { 
    static String app;  
    static { 
        app = "Teleport Video"; 
        System.out.println("Static block called"); 
    } 
    StaticBlock(){ 
        System.out.println("Constructor called"); 
    } 
    public static void main(String args[]) { 
       StaticBlock s1 = new StaticBlock();
       System.out.println(s1.app);  
       StaticBlock s2 = new StaticBlock(); 
       System.out.println(s2.app); 
    } 
} 