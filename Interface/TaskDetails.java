class TaskDetails implements Tasks {
  public void typing() {
    System.out.println("Practice Typing for 1 hour everyday");
  }
  public void learning() {
    System.out.println("Complete minimum 150 minutes of learning every week");
  }
  public static void main(String[] args) {
    TaskDetails t = new TaskDetails();  
    t.typing();
    t.learning();
  }
}
