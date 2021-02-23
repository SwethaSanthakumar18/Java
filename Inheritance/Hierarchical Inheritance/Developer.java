class Developer extends Employee
{
 int noOfDevelopers;
 long avgSalary;
 int workingHours;
public int getNoOfDevelopers() {
 return noOfDevelopers;
}

public void setNoOfDevelopers(int noOfDevelopers) {
 this.noOfDevelopers = noOfDevelopers;
}
public long getSalary() {
 return avgSalary;
}
public void setSalary(long avgSalary) {
 this.avgSalary = avgSalary;
}
public int getWorkingHours() {
 return workingHours;
}
public void setWorkingHours(int workingHours) {
 this.workingHours = workingHours;
}
void displayDeveloperDetails()
   {
    System.out.println("No of Developers:" +noOfDevelopers);
    System.out.println("Average Pay:" +avgSalary);
    System.out.println("Working Hours:" +workingHours);
    }

}
