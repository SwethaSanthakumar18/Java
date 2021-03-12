class JavaThread2 implements Runnable {
 Thread t3;
 private String n;
 JavaThread2(String name) {
  n = name;
 }
 @Override
 public void run() {
  System.out.println("Thread running :" + n);
  for (int i = 0; i < 4; i++) {
   System.out.println(i);
   System.out.println(n);
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    System.out.println("Thread has been interrupted");
   }
  }
 }
 public void start() {
  System.out.println("Thread started");
  if (t3 == null) {
   t3 = new Thread(this, n);
   t3.start();
  }
 
 }
}