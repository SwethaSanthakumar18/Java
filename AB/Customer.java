public class Customer
{ 
public String customerName;
public long customerMobileNo;
public String customerEmail;

public Customer(){}

public Customer(long customerMobileNo,String customerEmail) 
{      
this.customerMobileNo = customerMobileNo;    
this.customerEmail = customerEmail;    
}

@Override
public String toString() {
return new StringBuffer("").append(this.customerMobileNo).append(",").append(this.customerEmail).toString();
} 
}