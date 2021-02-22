class HR extends Employee
{
 int no_of_hrs;
 long avg_salary;
 int working_hours;
 int avg_no_of_interviews;

public int getNo_of_hrs() {
 return no_of_hrs;
}

public void setNo_of_hrs(int no_of_hrs) {
 this.no_of_hrs = no_of_hrs;
}

public long getSalary() {
 return avg_salary;
}

public void setSalary(long avg_salary) {
 this.avg_salary = avg_salary;
}

public int getWorking_hours() {
 return working_hours;
}

public void setWorking_hours(int working_hours) {
 this.working_hours = working_hours;
}

public int getAvg_no_of_interviews() {
 return avg_no_of_interviews;
}

public void setAvg_no_of_interviews(int avg_no_of_interviews) {
 this.avg_no_of_interviews = avg_no_of_interviews;
}

void display_hrdetails()
   {
    System.out.println("No of HRS:" +no_of_hrs);
    System.out.println("Average Pay:" +avg_salary);
    System.out.println("Working Hours:" +working_hours);
    System.out.println("Average No of Interviews per day:" +avg_no_of_interviews);
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
  }
}