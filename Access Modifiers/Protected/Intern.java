public class Intern
{
 private String internName;
 private String internEmail;
 private int internId;
 private int internDuration;
public String getInternName() {
 return internName;
}

public void setInternName(String internName) {
 this.internName = internName;
}
public String getInternEmail() {
 return internEmail;
}
public void setInternEmail(String internEmail) {
 this.internEmail = internEmail;
}
public int getInternId() {
 return internId;
}
public void setInternId(int internId) {
 this.internId = internId;
}
public int getInternDuration() {
 return internDuration;
}
public void setInternDuration(int internDuration) {
 this.internDuration = internDuration;
}
void displayInternDetails()
   {
    System.out.println("Intern Name:" +internName);
    System.out.println("Email:" +internEmail);
    System.out.println("Id:" +internId);
    System.out.println("Duration:" +internDuration);
    }
public static void main(String [] args){
Employee employee =new Employee();
employee.setNoOfEmployees(10000);
employee.displayEmployeeDetails();
Intern intern =new Intern();
intern.setInternName("Swetha");
intern.setInternEmail("swetha.santha@anywhere.co");
intern.setInternId(110024);
intern.setInternDuration(3);
intern.displayInternDetails();
}
}