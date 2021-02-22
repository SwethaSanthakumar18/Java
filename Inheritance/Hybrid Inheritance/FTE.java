class FTE extends Intern
{
 boolean performance;
public boolean getPerformance() {
 return performance;
}

public void setPerformance(boolean performance) {
 this.performance = performance;
}
   public void convert_fte()
   {
      if(performance==true){
	System.out.println("Congratulations! You have been converted to FTE");
       }
      else{
        System.out.println("Sorry!");
}
   }
  
public static void main(String args[])
  {
     
     Intern i = new Intern();
     Developer d = new Developer();
     HR h = new HR();
     i.setNo_of_employees(10000);
     i.display_employeedetails();
     d.setNo_of_employees(20000);
     d.display_employeedetails();
     h.setNo_of_employees(30000);
     h.display_employeedetails();
   i.setIntern_name("Swetha");
   i.setIntern_email("swetha.santha@anywhere.co");
   i.setIntern_id(110024);
   i.setIntern_duration(3);
   d.setNo_of_developers(3000);
   d.setSalary(50000);
   d.setWorking_hours(8);
   h.setNo_of_hrs(150);
   h.setSalary(40000);
   h.setWorking_hours(8);
   h.setAvg_no_of_interviews(15);
   i.display_interndetails();
   d.display_developerdetails();
   h.display_hrdetails(); 
   FTE f = new FTE();
 f.setPerformance(true);
     f.convert_fte();

  }
}