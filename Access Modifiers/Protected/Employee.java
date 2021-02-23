public class Employee{  
private int noOfEmployees;     
public int getNoOfEmployees() {
 return noOfEmployees;
}

public void setNoOfEmployees(int noOfEmployees) {
 this.noOfEmployees = noOfEmployees;
}
protected void displayEmployeeDetails()
   {
    System.out.println("Number of Employees:" +noOfEmployees);    
   }    

}  