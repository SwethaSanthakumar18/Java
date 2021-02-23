class Intern extends Tasks{   
  void run(){System.out.println("It's the duty of the intern to complete all the tasks before deadline");}  
  public static void main(String args[]){  
  Intern obj = new Intern();  
  obj.run(); //derived class
  Tasks obj1 = new Tasks();
  obj1.run(); //base class
  Tasks obj2 = new Intern();
  obj2.run(); //derived class
  }  
}  
