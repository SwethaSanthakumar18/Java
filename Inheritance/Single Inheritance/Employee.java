class Employee extends Company{  
int no_of_employees;     
public int getNo_of_employees() {
 return no_of_employees;
}

public void setNo_of_employees(int no_of_employees) {
 this.no_of_employees = no_of_employees;
}
void display_employeedetails()
   {
    System.out.println("Number of Employees:" +no_of_employees);    
   }    
public static void main(String args[]){  
   Employee e=new Employee();  
   e.setCompany_name("Full Creative");
   e.setCompany_email("info@fullcreative.com");
   e.setCompany_location("Chennai");
   e.setNo_of_employees(10000);
   e.display_companydetails();
   e.display_employeedetails();

}  
}  