class Developer extends Employee
{
 int no_of_developers;
 long avg_salary;
 int working_hours;
public int getNo_of_developers() {
 return no_of_developers;
}

public void setNo_of_developers(int no_of_developers) {
 this.no_of_developers = no_of_developers;
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
void display_developerdetails()
   {
    System.out.println("No of Developers:" +no_of_developers);
    System.out.println("Average Pay:" +avg_salary);
    System.out.println("Working Hours:" +working_hours);
    }

}