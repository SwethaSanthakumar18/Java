import java.io.*; 
import java.util.*;
import java.util.Scanner;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class MenuOption {    
public static void main(String [] args) throws IOException{
Scanner sc = new Scanner(System.in);
boolean done4=false;
do{
System.out.println("--------------------------");
System.out.println("        WELCOME           ");
System.out.println("--------------------------");
System.out.println("1.Customer");
System.out.println("2.Admin");
System.out.println("3.Exit");
System.out.println("Please enter your choice:");
int choice=sc.nextInt();
switch(choice)
{
case 1:
Map<String,AppointmentDetails> map=new HashMap<String,AppointmentDetails>();    
String filePath = "C:/Users/Admin/Desktop/Intern/Java/AB/appointmentdata.txt";
DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
String data = df.format(new Date());
AppointmentDetails a1=new AppointmentDetails(); 
a1.selectCustomer();
System.out.println("-----------------------------------");
System.out.println("          BOOK APPOINTMENT          ");
System.out.println("------------------------------------");
a1.selectService();
a1.selectTimeSlot();	
String a= a1.customerName;
long b= a1.mobile;
String c=a1.serviceName;
int d=a1.cost;
String e=a1.timeSlot;
AppointmentDetails a2=new AppointmentDetails(a,b,c,d,e);         
map.put(data,a2);    
try { 
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw1=new PrintWriter(bw);
for (Map.Entry<String, AppointmentDetails> entry : map.entrySet()) {  
pw1.println(entry.getKey() + ","+ entry.getValue()); 
} 
pw1.close();
}
catch(IOException e1)
{
System.err.println(e1);
}
break;
case 2:
ValidateAdmin admin = new ValidateAdmin();
admin.validateAdminDetails();
boolean done3=false;
do{
System.out.println("--------------------------------");
System.out.println("         WELCOME ADMIN          ");
System.out.println("--------------------------------");
System.out.println("1.Customers");
System.out.println("2.Services");
System.out.println("3.Appointments");
System.out.println("4.Exit");
System.out.println("Please enter your choice:");
int menuChoice=sc.nextInt();
switch (menuChoice)
{
case 1:
boolean done2 = false;
do{
System.out.println("--------------------------");
System.out.println("        CUSTOMER          ");
System.out.println("--------------------------");
System.out.println("1.Create New Customer");
System.out.println("2.Update Customer");
System.out.println("3.View Customer");
System.out.println("4.Exit");
System.out.println("Please enter your choice:");
int customerMenuChoice=sc.nextInt();
switch(customerMenuChoice){
case 1:
try{
CustomerData cus = new CustomerData();
cus.createCustomer();}
catch(IOException e2)
{
System.err.println(e2);
}
break;
case 2:
try{
CustomerData c1 = new CustomerData();
c1.updateCustomerData();}
catch(IOException e3)
{
System.err.println(e3);
}
break;
case 3:
try{
CustomerData c2 = new CustomerData();
c2.displayCustomerData();}
catch(IOException e4)
{
System.err.println(e4);
}
break;
case 4:
done2 = true;
break;
default: 
System.out.println("Invalid choice");
break;
} 
} while(!done2);		
break;

case 2:
boolean done1 =false;
do{		
System.out.println("--------------------------");
System.out.println("        SERVICES          ");
System.out.println("--------------------------"); 
System.out.println("1.Create New Service");
System.out.println("2.Update Service");
System.out.println("3.View Services");
System.out.println("4.Exit");
System.out.println("Please enter your choice:");
int serviceMenuChoice=sc.nextInt();
switch(serviceMenuChoice){
case 1:
try{
ServiceData s = new ServiceData();
s.createService();}
catch(IOException e5)
{
System.err.println(e5);
}
break;
case 2:
try{
ServiceData s = new ServiceData();
s.updateServiceData();}
catch(IOException e6)
{
System.err.println(e6);
}
break;
case 3:
try{
ServiceData s = new ServiceData();
s.displayServiceData();}
catch(IOException e7)
{
System.err.println(e7);
}
break;
case 4:
done1 =true;
break;
default: 
System.out.println("Invalid choice");
break;
} }while(!done1);

break;
case 3:
boolean done = false;
do{		 
System.out.println("-------------------------------------");
System.out.println("         VIEW APPOINTMENTS           ");
System.out.println("-------------------------------------");
System.out.println("1.View All Appointments");
System.out.println("2.View Appointments by Date");
System.out.println("3.View Upcoming Appointments");
System.out.println("4.View Previous Appointments");
System.out.println("5.Exit");
System.out.println("Please enter your choice:");
int appointmentChoice=sc.nextInt();
switch(appointmentChoice){
case 1:
AppointmentDetails a3=new AppointmentDetails(); 
System.out.println("ALL APPOINTMENTS");
a3.displayAllAppointments();
break;
case 2:
AppointmentDetails a4=new AppointmentDetails(); 
System.out.println("APPOINTMENTS BY DATE");
a4.displayAppointmentsByDate();
break;
case 3:
AppointmentDetails a5=new AppointmentDetails(); 
System.out.println("UPCOMING APPOINTMENTS");
a5.displayUpcomingAppointments();
break;
case 4:
AppointmentDetails a6=new AppointmentDetails(); 
System.out.println("PREVIOUS APPOINTMENTS");
a6.displayPreviousAppointments();
break;
case 5:
done =true;
break;
default: 
System.out.println("Invalid choice");
break;
}}while(!done);
break;
case 4:
done3 =true;
break;
default:
System.out.println("Invalid Choice");
break;
}

} while(!done3);					

break;
case 3:
done4=true;
break;
default:
System.out.println("Invalid Choice");
break;
}}while(!done4);
}}
