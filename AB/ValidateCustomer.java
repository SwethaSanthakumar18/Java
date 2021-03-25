package AppointmentBooking.ValidateDetails;
import java.io.*; 
import java.util.*; 
public class ValidateCustomer
{
	public String validateCustomerName;
	public long validateCustomerMobileNo;
	public boolean validateCustomer;
	public ArrayList<String> existingCustomerName = new ArrayList<String>(); 
	public ArrayList<Long> existingMobileNo = new ArrayList<Long>(); 
	public String customerDataFilePath = "C:/Users/Admin/Desktop/Intern/Java/AB/customerdata.txt";
	public BufferedReader customerDataReader;
	public String line;
	public String[] parts;
	Scanner sc=new Scanner(System.in);

public void validateCustomerDetails() throws IOException
{
	System.out.println("------------------------------");
	System.out.println("       CUSTOMER LOGIN         ");
	System.out.println("------------------------------");
	System.out.println("ENTER USERNAME :");
	validateCustomerName = sc.nextLine();
	System.out.println("ENTER PASSWORD :");
	validateCustomerMobileNo = sc.nextLong();  
    customerDataReader = new BufferedReader(new FileReader(customerDataFilePath));
	while ((line = customerDataReader.readLine()) != null)
	{
	parts = line.split(",", 3);
	if (parts.length >= 3)
	{
	existingCustomerName.add(parts[0]);
	existingMobileNo.add(Long.parseLong(parts[1]));
	} 
	}

	if(existingMobileNo.contains(validateCustomerMobileNo) && existingCustomerName.contains(validateCustomerName))
	{
	validateCustomer=true;
	System.out.println("---------------------------------");
	System.out.println("LOGGED IN CUSTOMER SUCCESSFULLY!!");
	System.out.println("---------------------------------");
	}
	else
	{
    System.out.println("----------------------------------------------------------");
	System.out.println("INVALID CUSTOMER USERNAME AND PASSWORD. PLEASE TRY AGAIN!!");
	System.out.println("----------------------------------------------------------");
	}
}
}
