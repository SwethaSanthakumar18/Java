public class Cust{ 
public String customerName;
public long customerMobileNo;
public String customerEmail;
public String name;
public String mobile;
public String email;
public long m;
public String[] parts =new String[100];
public String[] namearr = new String[100];
public Cust(){}
public Cust(long customerMobileNo,String customerEmail) {      
this.customerMobileNo = customerMobileNo;    
this.customerEmail = customerEmail;    }
@Override
public String toString() {
return new StringBuffer("").append(this.customerMobileNo).append(",").append(this.customerEmail)
.toString();
} }