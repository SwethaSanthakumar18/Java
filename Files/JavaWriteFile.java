import java.io.FileWriter;
class JavaWriteFile {
   public static void main(String args[]) {

     String data = "Hii Hello";
     try {
       FileWriter output = new FileWriter("output.txt");
       output.write(data);
       System.out.println("Data is written to the file.");
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}