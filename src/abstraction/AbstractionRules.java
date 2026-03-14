package abstraction;
interface Absm
{
     void method1();
    public void method2();
      default void method3() //default is just keywords not access modifier it is also public
      {
        System.out.println(" parent class method3  Called");
    }
  private void method4()
    {
        System.out.println(" parent classmethod3  Called");
    }
}
public class AbstractionRules implements Absm
{
    @Override
    public void method1()
    {
        System.out.println(" child class method2  Called");
    }
    @Override
    public void method2()
    {
        System.out.println(" child class method3  Called");
    }
    @Override
    public void method3()
    {
        System.out.println(" child class method4  Called");
    }

    protected void method4()//hide  the method of parent
    {
        System.out.println(" child class method4  Called");
    }

    public static void main(String[] args) {
        AbstractionRules abs = new AbstractionRules();
        abs.method1();
        abs.method2();
        abs.method3();
        abs.method4();
    }
}
