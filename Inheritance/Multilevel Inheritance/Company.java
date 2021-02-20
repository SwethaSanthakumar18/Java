class Company
{
 String company_name;
 String company_email;
 String company_location;
public String getCompany_name() {
 return company_name;
}

public void setCompany_name(String company_name) {
 this.company_name = company_name;
}
public String getCompany_email() {
 return company_email;
}

public void setCompany_email(String company_email) {
 this.company_email = company_email;
}
public String getCompany_location() {
 return company_location;
}

public void setCompany_location(String company_location) {
 this.company_location = company_location;
}  
void display_companydetails()
   {
    System.out.println("Company Name:" +company_name);
    System.out.println("Email:" +company_email);
    System.out.println("Location:" +company_location);
    }
}

