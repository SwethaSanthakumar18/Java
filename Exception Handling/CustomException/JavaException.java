class JavaException
{
  public String checkNum(int num)throws CustomException{
    if (num == 0){    
      throw new CustomException("Number is zero");
    }
    else
    {
      return "Number is non zero";
    }
  }
}