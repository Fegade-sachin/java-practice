package opps.abstraction;
interface ImplementAbs
{
     void meth1();
     default void meth2(){
         System.out.println("meth2 called inside the ImplementAbs");
     }
    private void meth3() {
        System.out.println("this is private method inside Interface");
    }

}
abstract class AbstractionClass
{
    public abstract void meth1();
  private void meth3()
    {
        System.out.println("this is private method inside AbstractionClass");
    }
  public  void meth2()
    {
        System.out.println("this is public method inside Class");
    }
    protected void meth4()
    {
        System.out.println("this is protected method inside Class");
    }

}
public class ImplementAbstraction  extends AbstractionClass implements ImplementAbs
{
    public void abstMethod()
    {
        System.out.println("abstMethod provide an implementation on the class");
    }
    @Override
    public void meth1() {
        System.out.println("this is meth1");
    }

    @Override
    public void meth2() {
        ImplementAbs.super.meth2();
    }
    public static void main(String[] args) {
        ImplementAbstraction obj = new ImplementAbstraction();
       obj.abstMethod();
        obj.meth2();
        obj.meth1();
        obj.meth2();
    }


}
