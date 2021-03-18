import java.io.*; 
import java.util.*; 
import java.util.Scanner;
public class CustomerData{
HashMap<String, Long> customermap = new HashMap<String, Long>();
public String filePath = "C:/Users/Admin/Desktop/Intern/Java/AB/customerdata.txt"; 
public String customerName;
public long customerMobileNo;
void createCustomer() throws IOException{ 
Scanner sc = new Scanner(System.in);
System.out.println("------------------------------------------");
System.out.println("           CREATING NEW CUSTOMER          ");
System.out.println("------------------------------------------");
System.out.println("Enter the Customer name");
customerName = sc.nextLine();
System.out.println("Enter the Customer's mobile number");
customerMobileNo = sc.nextLong();
customermap.put(customerName,customerMobileNo); 
try { 
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
for (Map.Entry<String, Long> entry : customermap.entrySet()) {  
pw.println(entry.getKey() + ":"+ entry.getValue()); 
} 
pw.close();
}
catch(IOException e)
{
System.err.println(e);
}
System.out.println("Created New Customer Successfully");
} 

void displayCustomerData() throws IOException{
String line;
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split(":", 2);
        if (parts.length >= 2)
        {
            String key = parts[0];
            String value = parts[1];
			long mobile=Long.parseLong(value);  
            customermap.put(key, mobile);
        } else {
            System.out.println("ignoring line: " + line);
        }
    }
 System.out.println("---------------------------------------------------");
					System.out.printf("%25s %20s" , "CUSTOMER NAME", "MOBILE NUMBER");
					System.out.println();
					System.out.println("---------------------------------------------------");
 for (String key : customermap.keySet())
    {
		System.out.format("%25s %20d",key,customermap.get(key));
        System.out.println();
    }
	 System.out.println("---------------------------------------------------");
}


void updateCustomerData()throws IOException{
Scanner sc2 = new Scanner(System.in);
System.out.println("---------------------------------------------");
System.out.println("            UPDATE EXISTING CUSTOMER         ");
System.out.println("---------------------------------------------");
System.out.println("Enter the Customer's name");
String name1 = sc2.nextLine();
Scanner sc3 = new Scanner(System.in);
System.out.println("Enter the Customer's new mobile number");
long num = sc3.nextLong();
    for (String key : customermap.keySet())
    {
        System.out.println(key + ":" + customermap.get(key));
    }

String line;
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split(":", 2);
        if (parts.length >= 2)
        {
            String key = parts[0];
            String value = parts[1];
			long mobile1=Long.parseLong(value);  
			if(key.equals(name1)&& mobile1 != num){
				customermap.remove(key);
			}else{
            customermap.put(key, mobile1);
			customermap.put(name1,num);}
        } 
    }
PrintWriter pw1 = new PrintWriter(filePath);
pw1.print("");
pw1.close();
	for (String key : customermap.keySet())		
    {
	try { 
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw); 
pw.println(key + ":" + customermap.get(key)); 
pw.close();
}
catch(IOException e)
{
System.err.println(e);
}
	}	
	System.out.println("Customer Updated Successfully");
}/*
public static void main(String args[]) throws IOException
{
	CustomerData d = new Customer();
	d.createCustomer();
	d.displayCustomerData();
	d.updateCustomerData();
	d.displayCustomerData();
}*/
}