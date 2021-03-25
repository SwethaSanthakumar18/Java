import java.io.*; 
import java.util.*; 
public class UpdateStaffDetails
{
	public Map<String,Staff> staffMap=new HashMap<String,Staff>(); 
	
	public String name;
	public String password;
	public String mobile;
	public String email;
	public String access;
	public long mobileNo;
	
	public String newPassword;
	public long newMobile;
	public String newEmail;
	public String newAccess;
	
	public String loggedInStaff;
	public String existingLoggedInStaff;
	
	public String staffDataFilePath = "C:/Users/Admin/Desktop/Intern/Java/AB/staffdata.txt";
	public File loginFilePath = new File("C:/Users/Admin/Desktop/Intern/Java/AB/logindata.txt"); 
	public String line;
	public String parts[];
	public BufferedReader staffDataReader;
	public BufferedReader staffLoggedInDataReader; 
	public BufferedWriter staffDataBufferedWriter;
	public FileWriter staffDataFileWriter;
	public PrintWriter staffDataPrintWriter ;
	public ArrayList<String> existingStaffName = new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	
	public void existingStaffData() throws IOException
	{
	int x=0;
	staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
	while ((line = staffDataReader.readLine()) != null)
	{
	parts = line.split(",", 5);
	if (parts.length >= 5)
	{
	existingStaffName.add(parts[0]);
	} 
	}
	staffLoggedInDataReader = new BufferedReader(new FileReader(loginFilePath)); 
	while ((existingLoggedInStaff = staffLoggedInDataReader.readLine()) != null) {
	loggedInStaff =existingLoggedInStaff; 
	}	
	}

	
	public void updatePassword(String staffName) throws IOException
    {
		System.out.println("Enter the new password");
        newPassword = sc.nextLine();
		staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
		while ((line = staffDataReader.readLine()) != null)
		{
			parts = line.split(",", 5);
			if (parts.length >= 5)
			{
			name = parts[0];
			password=parts[1];
			mobile = parts[2];
			email= parts[3];
			access=parts[4];
			mobileNo=Long.parseLong(mobile);
			
			if(staffName.equals(name))
			{
				password=newPassword;
				
				Staff staff=new Staff(password,mobileNo,email,access);  
				staffMap.put(name,staff);
			}
			else
			{
			Staff staff =new Staff(password,mobileNo,email,access);    
			staffMap.put(name,staff);
			}
			} 
		}
		staffDataPrintWriter = new PrintWriter(staffDataFilePath);
		staffDataPrintWriter.print("");
		staffDataPrintWriter.close();
		
		try 
		{ 
		staffDataFileWriter=new FileWriter(staffDataFilePath,true);
		staffDataBufferedWriter=new BufferedWriter(staffDataFileWriter);
		staffDataPrintWriter=new PrintWriter(staffDataBufferedWriter);
		
		for (Map.Entry<String, Staff> entry : staffMap.entrySet()) 
		{  
		staffDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		staffDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }
	
	public void updateEmail(String staffName) throws IOException
    {
		System.out.println("Enter the new Email ID");
        newEmail = sc.nextLine();
		staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
		while ((line = staffDataReader.readLine()) != null)
		{
			parts = line.split(",", 5);
			if (parts.length >= 5)
			{
			name = parts[0];
			password=parts[1];
			mobile = parts[2];
			email= parts[3];
			access=parts[4];
			mobileNo=Long.parseLong(mobile);
			
			if(staffName.equals(name))
			{
				email=newEmail;
				
				Staff staff=new Staff(password,mobileNo,email,access);  
				staffMap.put(name,staff);
			}
			else
			{
			Staff staff =new Staff(password,mobileNo,email,access);    
			staffMap.put(name,staff);
			}
			} 
		}
		staffDataPrintWriter = new PrintWriter(staffDataFilePath);
		staffDataPrintWriter.print("");
		staffDataPrintWriter.close();
		
		try 
		{ 
		staffDataFileWriter=new FileWriter(staffDataFilePath,true);
		staffDataBufferedWriter=new BufferedWriter(staffDataFileWriter);
		staffDataPrintWriter=new PrintWriter(staffDataBufferedWriter);
		
		for (Map.Entry<String, Staff> entry : staffMap.entrySet()) 
		{  
		staffDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		staffDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }
	
	public void updateAccessRole(String staffName) throws IOException
    {
		System.out.println("Enter the new Access Control Role");
        newAccess = sc.nextLine();
		staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
		while ((line = staffDataReader.readLine()) != null)
		{
			parts = line.split(",", 5);
			if (parts.length >= 5)
			{
			name = parts[0];
			password=parts[1];
			mobile = parts[2];
			email= parts[3];
			access=parts[4];
			mobileNo=Long.parseLong(mobile);
			
			if(staffName.equals(name))
			{
				access=newAccess;
				
				Staff staff=new Staff(password,mobileNo,email,access);  
				staffMap.put(name,staff);
			}
			else
			{
			Staff staff =new Staff(password,mobileNo,email,access);    
			staffMap.put(name,staff);
			}
			} 
		}
		staffDataPrintWriter = new PrintWriter(staffDataFilePath);
		staffDataPrintWriter.print("");
		staffDataPrintWriter.close();
		
		try 
		{ 
		staffDataFileWriter=new FileWriter(staffDataFilePath,true);
		staffDataBufferedWriter=new BufferedWriter(staffDataFileWriter);
		staffDataPrintWriter=new PrintWriter(staffDataBufferedWriter);
		
		for (Map.Entry<String, Staff> entry : staffMap.entrySet()) 
		{  
		staffDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		staffDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }
	
	public void updateMobileNo(String staffName) throws IOException
    {
		System.out.println("Enter the new Mobile Number");
        newMobile = sc.nextLong();
		staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
		while ((line = staffDataReader.readLine()) != null)
		{
			parts = line.split(",", 5);
			if (parts.length >= 5)
			{
			name = parts[0];
			password=parts[1];
			mobile = parts[2];
			email= parts[3];
			access=parts[4];
			mobileNo=Long.parseLong(mobile);
			
			if(staffName.equals(name))
			{
				mobileNo=newMobile;
				
				Staff staff=new Staff(password,mobileNo,email,access);  
				staffMap.put(name,staff);
			}
			else
			{
			Staff staff =new Staff(password,mobileNo,email,access);    
			staffMap.put(name,staff);
			}
			} 
		}
		staffDataPrintWriter = new PrintWriter(staffDataFilePath);
		staffDataPrintWriter.print("");
		staffDataPrintWriter.close();
		
		try 
		{ 
		staffDataFileWriter=new FileWriter(staffDataFilePath,true);
		staffDataBufferedWriter=new BufferedWriter(staffDataFileWriter);
		staffDataPrintWriter=new PrintWriter(staffDataBufferedWriter);
		
		for (Map.Entry<String, Staff> entry : staffMap.entrySet()) 
		{  
		staffDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
		} 
		staffDataPrintWriter.close();
		}
		catch(IOException e1)
		{
		System.err.println(e1);
		}
    }



}