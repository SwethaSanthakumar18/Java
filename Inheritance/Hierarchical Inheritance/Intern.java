class Intern extends Employee
{
 String intern_name;
 String intern_email;
 int intern_id;
 int intern_duration;
public String getIntern_name() {
 return intern_name;
}

public void setIntern_name(String intern_name) {
 this.intern_name = intern_name;
}
public String getIntern_email() {
 return intern_email;
}
public void setIntern_email(String intern_email) {
 this.intern_email = intern_email;
}
public int getIntern_id() {
 return intern_id;
}
public void setIntern_id(int intern_id) {
 this.intern_id = intern_id;
}
public int getIntern_duration() {
 return intern_duration;
}
public void setIntern_duration(int intern_duration) {
 this.intern_duration = intern_duration;
}
void display_interndetails()
   {
    System.out.println("Intern Name:" +intern_name);
    System.out.println("Email:" +intern_email);
    System.out.println("Id:" +intern_id);
    System.out.println("Duration:" +intern_duration);
    }

}