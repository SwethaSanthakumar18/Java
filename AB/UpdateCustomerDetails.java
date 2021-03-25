import java.io.*; 
import java.util.*; 
public class UpdateCustomerDetails
{
	public Map<String,Customer> customerMap=new HashMap<String,Customer>(); 
	public String name;
	public String mobile;
	public String email;
	public long mobileNo;
	
	public long newMobile;
	public String newEmail;
	
	public String customerDataFilePath = "C:/Users/Admin/Desktop/Intern/Java/AB/customerdata.txt"; 
	public String line;
	public String parts[];
	public BufferedReader customerDataReader;
	public BufferedWriter customerDataBufferedWriter;
	public FileWriter customerDataFileWriter;
	public PrintWriter customerDataPrintWriter ;
	public ArrayList<String> existingCustomerName = new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	
	public void existingCustomerData() throws IOException
	{
	int x=0;
	customerDataReader = new BufferedReader(new FileReader(customerDataFilePath));
	while ((line = customerDataReader.readLine()) != null)
	{
	parts = line.split(",", 3);
	if (parts.length >= 3)
	{
	existingCustomerName.add(parts[0]);
	} 
	}
	}

		
	public void updateEmail(String customerName) throws IOException
    {
		System.out.println("Enter the new Email ID");
        newEmail = sc.nextLine();
		customerDataReader = new BufferedReader(new FileReader(customerDataFilePath));
		while ((line = customerDataReader.readLine()) != null)
		{
			parts = line.split(",", 3);
			if (parts.length >= 3)
			{
			name = parts[0];
			mobile = parts[1];
			email= parts[2];
			mobileNo=Long.parseLong(mobile);
			
			if(customerName.equals(name))
			{
				email=newEmail;
				
				Customer customer=new Customer(mobileNo,email);  
				customerMap.put(name,customer);
			}
			else
			{
			Customer customer=new Customer(mobileNo,email);  
				customerMap.put(name,customer);
			}
			} 
		}
		customerDataPrintWriter = new PrintWriter(customerDataFilePath);
		customerDataPrintWriter.print("");
		customerDataPrintWriter.close();
		
		try 
		{ 
		customerDataFileWriter=new FileWriter(customerDataFilePath,true);
		customerDataBufferedWriter=new BufferedWriter(customerDataFileWriter);
		customerDataPrintWriter=new PrintWriter(customerDataBufferedWriter);
		
		for (Map.Entry<String, Customer> entry : customerMap.entrySet()) 
		{  
		customerDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		customerDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }
	
	public void updateMobileNo(String customerName) throws IOException
    {
		System.out.println("Enter the new Mobile Number");
        newMobile = sc.nextLong();
		customerDataReader = new BufferedReader(new FileReader(customerDataFilePath));
		while ((line = customerDataReader.readLine()) != null)
		{
			parts = line.split(",", 3);
			if (parts.length >= 3)
			{
			name = parts[0];
			mobile = parts[1];
			email= parts[2];
			mobileNo=Long.parseLong(mobile);
			
			if(customerName.equals(name))
			{
				mobileNo=newMobile;
				
				Customer customer=new Customer(mobileNo,email);  
				customerMap.put(name,customer);
			}
			else
			{
			Customer customer =new Customer(mobileNo,email);    
			customerMap.put(name,customer);
			}
			} 
		}
		customerDataPrintWriter = new PrintWriter(customerDataFilePath);
		customerDataPrintWriter.print("");
		customerDataPrintWriter.close();
		
		try 
		{ 
		customerDataFileWriter=new FileWriter(customerDataFilePath,true);
		customerDataBufferedWriter=new BufferedWriter(customerDataFileWriter);
		customerDataPrintWriter=new PrintWriter(customerDataBufferedWriter);
		
		for (Map.Entry<String, Customer> entry : customerMap.entrySet()) 
		{  
		customerDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		customerDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }
}