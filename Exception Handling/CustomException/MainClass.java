public class MainClass{
  public static void main(String[] args){
   JavaException object = new JavaException();
    try{
      String a = object.checkNum(0);
    }
    catch (CustomException e)
    {
      e.printStackTrace();
    }
  }
}