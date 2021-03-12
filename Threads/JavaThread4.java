public class JavaThread4 {
 public static void main(String[] args) {
  JavaThread2 t1 = new JavaThread2("Swetha");
  t1.start();
  JavaThread2 t2 = new JavaThread2("Miki");
  t2.start();
 }
}