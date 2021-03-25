import java.io.*; 
import java.util.*; 
public class StaffData extends UpdateStaffDetails
{
public String staffName;
public String staffPassword;
public long staffMobileNo;
public String staffEmail;
public String staffAccessControl;

public String staffNameToBeUpdated;

UpdateStaffDetails updateStaffDetails = new UpdateStaffDetails();

Scanner sc = new Scanner(System.in);

public void createStaff() throws IOException
{ 
System.out.println("------------------------------------------");
System.out.println("             CREATING NEW STAFF           ");
System.out.println("------------------------------------------");
System.out.println("ENTER THE STAFF NAME :");
staffName = sc.nextLine();
System.out.println("ENTER THE STAFF'S PASSWORD :");
staffPassword = sc.nextLine();
System.out.println("ENTER THE STAFF'S EMAIL ID :");
staffEmail = sc.nextLine();
System.out.println("ENTER THE STAFF'S ACCESS CONTROL :");
staffAccessControl = sc.nextLine();
System.out.println("ENTER THE STAFF'S MOBILE NUMBER :");
staffMobileNo = sc.nextLong();
}


public void displayStaffData() throws IOException{
staffDataReader = new BufferedReader(new FileReader(staffDataFilePath));
System.out.println("---------------------------------------------------------------------------------------------------");
System.out.printf("%10s %15s %15s %25s %15s","STAFF NAME", "PASSWORD", "MOBILE NUMBER", "EMAIL-ID", "ACCESS CONTROL");
System.out.println();
System.out.println("---------------------------------------------------------------------------------------------------");
while ((line = staffDataReader.readLine()) != null)
{
parts = line.split(",", 5);
if (parts.length >= 5)
{
name = parts[0];
password = parts[1];
mobile = parts[2];
email = parts[3];
access = parts[4];
mobileNo = Long.parseLong(mobile);  
System.out.format("%10s %15s %15d %25s %15s",name,password,mobileNo,email,access);
System.out.println();
} 
}
System.out.println("---------------------------------------------------------------------------------------------------");
}


public void updateAdminAccessData()throws IOException
{		
boolean done1=false;
do{
System.out.println("---------------------------------------------");
System.out.println("              UPDATE STAFF DETAILS           ");
System.out.println("---------------------------------------------");
System.out.println("1.Update My Details");
System.out.println("2.Update Other Staff Details");
System.out.println("3.Exit");
int staffmenuChoice=sc.nextInt(); 
switch(staffmenuChoice){
case 1:
boolean done=false;
if(existingStaffName.contains(loggedInStaff)){
do{
System.out.println("Staff Name : "+loggedInStaff);
System.out.println("1.Update Password");
System.out.println("2.Update Mobile Number");
System.out.println("3.Update Email ID");
System.out.println("4.Exit");
System.out.println("Please enter your choice:");
int staffChoice=sc.nextInt(); 
switch(staffChoice){
case 1:
updateStaffDetails.updatePassword(loggedInStaff);
break;	
case 2:
updateStaffDetails.updateMobileNo(loggedInStaff);
break;
case 3:
updateStaffDetails.updateEmail(loggedInStaff);
break;
case 4:
done = true;
break;
default:
System.err.println("Invalid Choice");
break;
}}
while(!done);}
else{
System.out.println("Customer Does not exist");
}
break;

case 2:
System.out.println("Enter the Staff Name");
Scanner staffNameToUpdate = new Scanner(System.in);
staffNameToBeUpdated=staffNameToUpdate.nextLine();
boolean done3=false;
if(existingStaffName.contains(staffNameToBeUpdated)){
do{	
System.out.println("1.Update Password");
System.out.println("2.Update Mobile Number");
System.out.println("3.Update Email ID");
System.out.println("4.Update Access Control");
System.out.println("5.Exit");
System.out.println("Please enter your choice:");
int staffChoice=sc.nextInt(); 
switch(staffChoice){
case 1:
updateStaffDetails.updatePassword(staffNameToBeUpdated);
break;	
case 2:
updateStaffDetails.updateMobileNo(staffNameToBeUpdated);
break;
case 3:
updateStaffDetails.updateEmail(staffNameToBeUpdated);
break;
case 4:
updateStaffDetails.updateAccessRole(staffNameToBeUpdated);
break;
case 5:
done3 = true;
break;
default:
System.err.println("Invalid Choice");
break;
}}
while(!done3);}else{
System.out.println("Customer Does not exist");
}
break;
case 3:
done1 = true;
break;

default:
System.err.println("Invalid Choice");
break;
}	
}while(!done1);
}


public void updateStaffAccessData()throws IOException
{
boolean done1=false;
do{
System.out.println("---------------------------------------------");
System.out.println("              UPDATE STAFF DETAILS           ");
System.out.println("---------------------------------------------");
System.out.println("1.Update My Details");
System.out.println("2.Exit");
int staffmenuChoice=sc.nextInt(); 
switch(staffmenuChoice){
case 1:
boolean done=false;
if(existingStaffName.contains(loggedInStaff)){
do{
System.out.println("Staff Name : "+loggedInStaff);
System.out.println("1.Update Password");
System.out.println("2.Update Mobile Number");
System.out.println("3.Update Email ID");
System.out.println("4.Exit");
System.out.println("Please enter your choice:");
int staffChoice=sc.nextInt(); 
switch(staffChoice){
case 1:
updateStaffDetails.updatePassword(loggedInStaff);
break;	
case 2:
updateStaffDetails.updateMobileNo(loggedInStaff);
break;
case 3:
updateStaffDetails.updateEmail(loggedInStaff);
break;
case 4:
done = true;
break;
default:
System.err.println("Invalid Choice");
break;
}}
while(!done);}
else{
System.out.println("Customer Does not exist");
}
break;
case 2:
done1 = true;
break;
default:
System.err.println("Invalid Choice");
break;
}	
}while(!done1);
}


public static void main(String args[]) throws IOException{

StaffData s=new StaffData();
//s.createStaff();
//s.displayStaffData();
s.existingStaffData();
s.updateAdminAccessData();
s.updateStaffAccessData();
}

}
