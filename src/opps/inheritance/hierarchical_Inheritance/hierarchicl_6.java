package opps.inheritance.hierarchical_Inheritance;
class Bank
{
  void intrestRate()
  {
    System.out.println("different bank tak different intresRate");
  }
}
class SBI extends Bank
{
  void SBIRate()
  {
      System.out.println(" SBI tak different intresRate");
  }
}
    class HDFC extends Bank
    {
    void HdfcRate()
    {
        System.out.println(" HDFC tak different intresRate");
    }
    }

public class hierarchicl_6
{
    public static void main(String[] args)


   {
    SBI s = new SBI();
    s.intrestRate();
    s.SBIRate();

    HDFC h = new HDFC();
    h.intrestRate();
    h.HdfcRate();


    }
}
