package AppointmentBooking.ValidateDetails;
import java.io.*; 
import java.util.*; 

public class ValidateStaff
{
	public String staffName;
	public String staffPassword;
	public String staffAccessRole;
	public boolean validateStaff;
	public String staffDataFilePath = "C:/Users/Admin/Desktop/Intern/Java/AB/staffdata.txt";
	public String loginDataFilePath = "C:/Users/Admin/Desktop/Intern/Java/AB/logindata.txt";
	public BufferedWriter loginDataWriter;
	public BufferedReader staffDataReader;
	public ArrayList<String> existingStaffName = new ArrayList<String>(); 
	public ArrayList<String> existingStaffPassword = new ArrayList<String>(); 
	public String line;
	public String parts[];
	Scanner sc=new Scanner(System.in);
	
public void validateStaffDetails() throws IOException{

    System.out.println("------------------------------");
	System.out.println("          STAFF LOGIN         ");
	System.out.println("------------------------------");
	System.out.println("ENTER USERNAME :");
	staffName = sc.nextLine();
	System.out.println("ENTER PASSWORD :");
	staffPassword = sc.nextLine();  

loginDataWriter = new BufferedWriter(new FileWriter(loginDataFilePath));
    loginDataWriter.write(staffName);
    loginDataWriter.close();

staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
while ((line = staffDataReader.readLine()) != null)
{
	parts = line.split(",", 5);
	if (parts.length >= 5)
	{
	existingStaffName.add(parts[0]);
	existingStaffPassword.add(parts[1]);
	String name = parts[0];
	String password = parts[1];
	String accessrole= parts[4];
	if (name.equals(staffName) && password.equals(staffPassword)){
	staffAccessRole = accessrole;
	}
	} 
}

	if(existingStaffName.contains(staffName) && existingStaffPassword.contains(staffPassword))
	{
	validateStaff=true;
	System.out.println("------------------------------");
	System.out.println("LOGGED IN STAFF SUCCESSFULLY!!");
	System.out.println("------------------------------");
	}
	else
	{
	System.out.println("-------------------------------------------------------");
	System.out.println("INVALID STAFF USERNAME AND PASSWORD. PLEASE TRY AGAIN!!");
	System.out.println("-------------------------------------------------------");
	}
}
}
