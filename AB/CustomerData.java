import java.io.*; 
import java.util.*; 

public class CustomerData extends UpdateCustomerDetails{
public HashMap<String, Long> customermap = new HashMap<String, Long>();

public String customerName;
public long customerMobileNo;
public String customerEmail;

UpdateCustomerDetails u=new UpdateCustomerDetails();

public String customerNameToBeUpdated;

void createCustomer() throws IOException{ 
Scanner sc = new Scanner(System.in);
System.out.println("------------------------------------------");
System.out.println("           CREATING NEW CUSTOMER          ");
System.out.println("------------------------------------------");
System.out.println("Enter the Customer name");
customerName = sc.nextLine();
System.out.println("Enter the Customer's Email ID");
customerEmail = sc.nextLine();
System.out.println("Enter the Customer's mobile number");
customerMobileNo = sc.nextLong();
}

void displayCustomerData() throws IOException{

System.out.println("------------------------------------------------------------");
System.out.printf("%10s %20s %25s","CUSTOMER NAME", "MOBILE NUMBER", "EMAIL-ID");
System.out.println();
System.out.println("------------------------------------------------------------");
customerDataReader = new BufferedReader(new FileReader(customerDataFilePath));
while ((line = customerDataReader.readLine()) != null)
{
String[] parts = line.split(",", 3);
if (parts.length >= 3)
{
name = parts[0];
mobile = parts[1];
email= parts[2];
mobileNo=Long.parseLong(mobile);  
System.out.format("%10s %20d %25s",name,mobileNo,email);
System.out.println();
} 
}
System.out.println("------------------------------------------------------------");
}


void updateCustomerData()throws IOException{

System.out.println("---------------------------------------------");
System.out.println("            UPDATE EXISTING CUSTOMER         ");
System.out.println("---------------------------------------------");
System.out.println("Enter the Customer's name");
Scanner update = new Scanner(System.in);
customerNameToBeUpdated = update.nextLine();
if(existingCustomerName.contains(customerNameToBeUpdated)){
System.out.println("1.Update Customer Mobile Number");
System.out.println("2.Update Customer Email ID");
System.out.println("Please enter your choice:");
int customerChoice=sc.nextInt();
switch(customerChoice){
case 1:
u.updateMobileNo(customerNameToBeUpdated);
break;
case 2:
u.updateEmail(customerNameToBeUpdated);
break;
default:
System.out.println("Invalid Choice");
break;
}}
else{
System.out.println("Customer Does not exist");
}
}
public static void main(String args[]) throws IOException
{  /* Map<String,Customer> map=new HashMap<String,Customer>();    
String filePath = "C:/Users/Admin/Desktop/Intern/Java/AB/customerdata.txt";
CustomerData a1=new CustomerData(); 	
a1.createCustomer();
String str = Long.toString(a1.checknum);
ValidateMobile v = new ValidateMobile();
ValidateEmail v1=new ValidateEmail();
if(v.isValidMobile(str) && v1.isValidEmail(a1.checkemail)){
long b=Long.parseLong(str);  
String a= a1.customerName;
String c=a1.checkemail;
Customer a2=new Customer(b,c);         
map.put(a,a2);    
try { 
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw1=new PrintWriter(bw);
for (Map.Entry<String, Customer> entry : map.entrySet()) {  
pw1.println(entry.getKey() + ","+ entry.getValue()); 
} 
pw1.close();
}
catch(IOException e1)
{
System.err.println(e1);
}}else{
System.out.println("Invalid Mobile or Email ID");

}*/
CustomerData a1=new CustomerData(); 
a1.existingCustomerData() ;
a1.displayCustomerData();
a1.updateCustomerData();
a1.displayCustomerData();
/*
CustomerData a1=new CustomerData(); 	
a1.displayCustomerData();
a1.updateCustomerData();*/
}
}