import java.io.*; 
import java.util.*; 
import java.util.Scanner;
public class ServiceData
{
HashMap<String, Integer> serviceMap = new HashMap<String, Integer>();
public String filePath = "C:/Users/Admin/Desktop/Intern/Java/AB/servicedata.txt"; 
public String serviceName;
public int serviceCost;

void createService() throws IOException
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
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
for (Map.Entry<String, Integer> entry : serviceMap.entrySet()) {  
pw.println(entry.getKey() + ":"+ entry.getValue()); 
} 
pw.close();
}
catch(IOException e)
{
System.err.println(e);
}
System.out.println("Created New Service Successfully");
} 

void displayServiceData() throws IOException
{
String line;
BufferedReader reader = new BufferedReader(new FileReader(filePath));
while ((line = reader.readLine()) != null)
{
String[] parts = line.split(":", 2);
if (parts.length >= 2)
{
String key = parts[0];
String value = parts[1];
int cost=Integer.parseInt(value);  
serviceMap.put(key, cost);
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
Scanner sc2 = new Scanner(System.in);
System.out.println("------------------------------------------");
System.out.println("           UPDATE EXISTING SERVICE        ");
System.out.println("------------------------------------------");
System.out.println("Enter the Service name");
String name1 = sc2.nextLine();
Scanner sc3 = new Scanner(System.in);
System.out.println("Enter the new Service Cost");
int cost1 = sc3.nextInt();
for (String key : serviceMap.keySet())
{
System.out.println(key + ":" + serviceMap.get(key));
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
int price=Integer.parseInt(value);  
if(key.equals(name1)&& price != cost1){
serviceMap.remove(key);
}else{
serviceMap.put(key, price);
serviceMap.put(name1,cost1);}
} 
}
PrintWriter pw1 = new PrintWriter(filePath);
pw1.print("");
pw1.close();
for (String key : serviceMap.keySet())
{
try { 
FileWriter fw=new FileWriter(filePath,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw); 
pw.println(key + ":" + serviceMap.get(key)); 
pw.close();
}
catch(IOException e)
{
System.err.println(e);
}
}	
System.out.println("Service Updated Successfully");
}

/*
public static void main(String args[]) throws IOException
{
ServiseData d = new ServiceData();
d.createService();
d.displayServiceData();
d.updateServiceData();
d.displayServiceData();
}*/
}