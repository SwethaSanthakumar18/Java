import java.io.*; 
import java.util.*; 
import java.util.Scanner;
public class ServiceData extends UpdateServiceDetails
{
public String serviceName;
public int serviceCost;
public String serviceNameToBeUpdated;

UpdateServiceDetails updateService = new UpdateServiceDetails();


public void createService() throws IOException
{ 
Scanner sc = new Scanner(System.in);
System.out.println("------------------------------------------");
System.out.println("            CREATING NEW SERVICE          ");
System.out.println("------------------------------------------");
System.out.println("Enter the Service name");
serviceName = sc.nextLine();
System.out.println("Enter the Service Cost");
serviceCost = sc.nextInt();
serviceMap.put(serviceName,serviceCost); 
try { 
serviceDataFileWriter=new FileWriter(serviceDataFilePath,true);
serviceDataBufferedWriter=new BufferedWriter(serviceDataFileWriter);
serviceDataPrintWriter=new PrintWriter(serviceDataBufferedWriter);
for (Map.Entry<String, Integer> entry : serviceMap.entrySet()) {  
serviceDataPrintWriter.println(entry.getKey() + ","+ entry.getValue()); 
} 
serviceDataPrintWriter.close();
}
catch(IOException e)
{
System.err.println(e);
}
System.out.println("Created New Service Successfully");
} 

void displayServiceData() throws IOException
{
serviceDataReader = new BufferedReader(new FileReader(serviceDataFilePath));
while ((line = serviceDataReader.readLine()) != null)
{
String[] parts = line.split(",", 2);
if (parts.length >= 2)
{
name = parts[0];
cost= parts[1];
price=Integer.parseInt(cost);  
serviceMap.put(name, price);
}
}
System.out.println("---------------------------------------------------");
System.out.printf("%25s %10s" , "SERVICE NAME", "COST");
System.out.println();
System.out.println("---------------------------------------------------");

for (String key : serviceMap.keySet())
{
System.out.format("%25s %10d",key,serviceMap.get(key));
System.out.println();
}
System.out.println("---------------------------------------------------");
}


void updateServiceData()throws IOException
{
System.out.println("------------------------------------------");
System.out.println("           UPDATE EXISTING SERVICE        ");
System.out.println("------------------------------------------");
System.out.println("Enter the Service name");
Scanner sc1=new Scanner(System.in);
serviceNameToBeUpdated = sc1.nextLine();
if(existingServiceName.contains(serviceNameToBeUpdated)){
updateService.updateCost(serviceNameToBeUpdated);
System.out.println("Service Updated Successfully");
}else
{
	System.out.println("Service does not exist");
}	

}

public static void main(String args[]) throws IOException
{
ServiceData d = new ServiceData();
//d.createService();
//d.displayServiceData();
d.existingServiceData();
d.displayServiceData();
d.updateServiceData();
d.displayServiceData();
}
}