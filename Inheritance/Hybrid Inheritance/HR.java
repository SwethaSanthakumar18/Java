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

}